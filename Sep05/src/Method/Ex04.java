package Method;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		D1 d = new D1();
		d.divide(50, 20);
		d.divide(20f, 40f);
	}

}

class D1 {
	void divide(int x, int y) {
		if (y == 0) {
			System.out.println("¿À·ù");
		} else
			System.out.printf("%d / %d = %d\n", x, y, x / y);
	}

	void divide(float x, float y) {
		System.out.printf("%3.1f / %3.1f = %3.2f\n", x, y, x / y);
	}
}
