package Method;

public class MethodEx {

	// 1. 매개변수 있고, 리턴타입 있는 메소드
	int sum(int x, int y) {
		return x + y;
	}

	// 2. 매개변수 없고, 리턴타입 있는 메소드
	String greeting() {
		return "hello";
	}

	// 3. 매개변수 있고, 리턴타입 없는 메소드
	void sumVoid(int x, int y) {
		System.out.println("result=" + (x + y));
	}

	// 4. 매개변수 없고, 리턴타입 없는 메소드
	void greetingVoid() {
		System.out.println("hi");
	}

}
