package us.myles.classtrap;

import org.bukkit.Bukkit;

import java.util.regex.Pattern;

public class MCUtils {
	public static String getVersionString() {
		return Bukkit.getServer().getClass().getPackage().getName().split(Pattern.quote("."))[3];
	}

	public static Object makeNMS(String nmsName, Object... args) {
		try {
			return Trap.createObject(Class.forName("net.minecraft.server." + getVersionString() + "." + nmsName), args);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Object makeCB(String nmsName, Object... args) {
		try {
			return Trap.createObject(Class.forName("org.bukkit.craftbukkit." + getVersionString() + "." + nmsName), args);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return null;
		}
	}
}
