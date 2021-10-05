package Method;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1 c = new C1();

		c.cal1(10, 30);

		int result = c.cal2(10, 40);
		System.out.println(result);
	}

}

class C1 {
	void cal1(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x + y);
		System.out.printf("%d - %d = %d\n", x, y, x - y);
		System.out.printf("%d * %d = %d\n", x, y, x * y);
		System.out.printf("%d / %d = %d\n", x, y, x / y);
	}

	int cal2(int x, int y) {
		return x * y;
	}
}
