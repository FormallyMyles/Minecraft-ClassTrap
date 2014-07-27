/* ClassTrap v1.0.2 by _MylesC (MylesIsCool)  */
package us.myles.classtrap;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TrapTag {
	TrapTagType type() default TrapTagType.METHOD;
	String value() default "";
}

