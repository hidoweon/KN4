package Method;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		E1 e = new E1();
		e.greet(7);
	}

}

class E1 {

	// ���ȣ�� �޼ҵ�

	void greet(int x) {
		System.out.println("�ȳ�: " + x);
		if (x < 1)
			return;
		greet(--x);
	}
}