package Method;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 b1 = new B1();

		int result = b1.add(10, 10);
		System.out.println(result);

		float res2 = b1.add2(20, 20);
		System.out.println(res2);
	}

}

class B1 {
	int add(int x, int y) {
		return x + y;
	}

	float add2(int x, int y) {
		return x + y;
	}
}
