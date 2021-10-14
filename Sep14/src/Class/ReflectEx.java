package Class;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class ReflectEx {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz = Class.forName("Class.SendAction");
		System.out.println(clazz.getName());

		Constructor[] constructors = clazz.getConstructors();
		for (Constructor cons : constructors) {
			System.out.println(cons.getName() + "(");
			Class[] params = cons.getParameterTypes();
			Arrays.toString(params);
			System.out.println(")");
		}

	}

}
