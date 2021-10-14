package Class;

import java.util.Scanner;

public class ReflectEx2 {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("실행할 객체 입력");
		String className = "Class." + scanner.next();

		Class clazz = Class.forName(className);
		System.out.println(clazz.getName());

		Action action = (Action) clazz.newInstance();
		action.execute();

	}

}
