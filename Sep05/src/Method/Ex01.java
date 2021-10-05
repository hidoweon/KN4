package Method;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A1 a1 = new A1();

		a1.add(0, 0);
		a1.print("hello");
	}
}

class A1 {
	void add(int x, int y) {
		System.out.println("sum: " + (x + y));
	}

	void print(String msg) {
		System.out.println("message: " + msg);
	}
}
