package Method;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A3 a = new A3();
		int res1 = a.add(10, 20);
		System.out.println(res1);

		double res2 = a.square(23.3);
		System.out.println(res2);

		a.mul(62, 32);
	}

}

class A3 {
	int add(int a1, int a2) {
		return a1 + a2;
	}

	double square(double d) {
		return d * d;
	}

	void mul(int a1, int a2) {
		System.out.printf("%d * %d = %d\n", a1, a2, a1 * a2);
	}
}
