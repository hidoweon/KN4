package Method;

public class MethodEx {

	// 1. �Ű����� �ְ�, ����Ÿ�� �ִ� �޼ҵ�
	int sum(int x, int y) {
		return x + y;
	}

	// 2. �Ű����� ����, ����Ÿ�� �ִ� �޼ҵ�
	String greeting() {
		return "hello";
	}

	// 3. �Ű����� �ְ�, ����Ÿ�� ���� �޼ҵ�
	void sumVoid(int x, int y) {
		System.out.println("result=" + (x + y));
	}

	// 4. �Ű����� ����, ����Ÿ�� ���� �޼ҵ�
	void greetingVoid() {
		System.out.println("hi");
	}

}
