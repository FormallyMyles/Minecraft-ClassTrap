/* ClassTrap v1.0.2 by _MylesC (MylesIsCool)  */
package us.myles.classtrap;

import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class Trap implements InvocationHandler {
	private static final Map<Class, Class> primitiveMap = new HashMap<Class, Class>();

	static {
		primitiveMap.put(Boolean.class, boolean.class);
		primitiveMap.put(Character.class, char.class);
		primitiveMap.put(Byte.class, byte.class);
		primitiveMap.put(Short.class, short.class);
		primitiveMap.put(Integer.class, int.class);
		primitiveMap.put(Long.class, long.class);
		primitiveMap.put(Float.class, float.class);
		primitiveMap.put(Double.class, double.class);
		primitiveMap.put(Void.class, void.class);
	}

	private final Object internal_object;

	private Trap(Object o) {
		this.internal_object = o;
	}

	public static <T> T create(Class<T> classInterface, Object o) {
		return (T) Proxy.newProxyInstance(classInterface.getClassLoader(), new Class[]{classInterface}, new Trap(o));
	}

	public static <T> T create(Class<T> classInterface, Class objectClass) {
		return create(classInterface, objectClass, new Object[0]);
	}

	public static <T> T create(Class<T> classInterface, Class objectClass, Object... constructorParams) {
		return create(classInterface, objectClass, extractClasses(constructorParams), constructorParams);
	}

	public static <T> T create(Class<T> classInterface, Class objectClass, Class[] constructorClasses, Object... constructorParams) {
		return create(classInterface, Trap.createObject(objectClass, constructorClasses, constructorParams));
	}

	public static <T> T createObject(Class<T> objectClass) {
		return createObject(objectClass, new Class[0], new Object[0]);
	}

	public static <T> T createObject(Class<T> objectClass, Object... constructorParams) {
		return createObject(objectClass, extractClasses(constructorParams), constructorParams);
	}

	public static <T> T createObject(Class<T> objectClass, Class[] constructorClasses, Object... constructorParams) {
		try {
			T object;
			if (objectClass.getConstructors().length == 0)
				object = objectClass.newInstance();
			else {
				Constructor constructor = null;
				for (Constructor con : objectClass.getDeclaredConstructors()) {
					if (con.getParameterTypes().length == constructorClasses.length) {
						boolean works = true;
						for (int x = 0; x < con.getParameterTypes().length; x++) {
							if (!con.getParameterTypes()[x].isAssignableFrom(constructorClasses[x].getClass()) && !con.getParameterTypes()[x].equals(constructorClasses[x]) &&
									isNotSamePrimitive(con.getParameterTypes()[x],
											constructorClasses[x]))
								works = false;
						}
						if (works)
							constructor = con;
					}
				}
				if (constructor == null)
					throw new Exception("Failed to find a compatible constructor for the given arguments.");
				object = (T) constructor.newInstance(constructorParams);
			}
			return object;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public static Class[] extractClasses(Object[] objects) {
		List<Class> paramClasses = new ArrayList<Class>();
		for (Object o : objects)
			paramClasses.add(o.getClass());
		return paramClasses.toArray(new Class[paramClasses.size()]);
	}

	public static boolean isNotSamePrimitive(Class a, Class b) {
		return !a.equals(b) && !toPrimitive(a).equals(toPrimitive(b));
	}

	public static Class toPrimitive(Class b) {
		return primitiveMap.containsKey(b) ? primitiveMap.get(b) : b;
	}

	public static Object getInternalObject(Object b) {
		return Proxy.getInvocationHandler(b) instanceof Trap ? ((Trap) Proxy.getInvocationHandler(b)).getObject() : null;
	}

	public Object getObject() {
		return this.internal_object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		TrapTag t = method.getAnnotation(TrapTag.class);
		String name = t == null ? method.getName() : t.value();
		TrapTagType type = t == null ? TrapTagType.METHOD : t.type();
		if (args == null)
			args = new Object[0];
		for (int x = 0; x < args.length; x++)
			if (args[x].getClass().getAnnotation(TrapTag.class) != null)
				args[x] = getInternalObject(args[x]);
		Method desired = null;
		if (type == TrapTagType.METHOD) {
			for (Method meth : this.internal_object.getClass().getDeclaredMethods()) {
				if (!meth.getName().equalsIgnoreCase(name)) continue;
				if (meth.getParameterTypes().length == args.length) {
					boolean works = true;
					for (int x = 0; x < meth.getParameterTypes().length; x++)
						if (!meth.getParameterTypes()[x].isAssignableFrom(args[x].getClass()) && !meth.getParameterTypes()[x].equals(args[x].getClass()) && isNotSamePrimitive(meth
								.getParameterTypes()[x], args[x].getClass()))
							works = false;
					if (works)
						desired = meth;
				}
			}
			if (desired == null)
				throw new Exception("Could not find method '" + name + "' as specified in TrapTag.");
		} else {
			try {
				Field desiredField = this.internal_object.getClass().getDeclaredField(t.value());
				desiredField.setAccessible(true);
				if (t.type() == TrapTagType.GETTER)
					if (t.value().equals("this"))
						return this.internal_object;
					else
						return wrapIfNeeded(desiredField.get(this.internal_object), method.getReturnType());
				if (t.type() == TrapTagType.SETTER) {
					if (args.length == 0)
						throw new Exception("Specified setter for '" + name + "' but parameter 1 missing.");
					desiredField.set(this.internal_object, args[0]);
					return null;
				}
			} catch (NoSuchFieldException e) {
				throw new Exception("Could not find field '" + name + "' as specified in TrapTag.");
			}
		}
		desired.setAccessible(true);
		return wrapIfNeeded(desired.invoke(this.internal_object, args), method.getReturnType());
	}

	private Object wrapIfNeeded(Object o, Class c) {
		return (c != null && c.getAnnotation(TrapTag.class) != null) ? create(c, o) : o;
	}
}
