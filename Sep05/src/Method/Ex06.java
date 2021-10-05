package Method;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		F1 f = new F1();

		f.fact1(5);
		f.fact2(6);
	}

}

class F1 {
	int res1 = 1, res2 = 1;

	void fact1(int x) {
		for (int i = x; i >= 1; i--) {
			res1 *= i;
			if (i != 1) {
				System.out.print(i + " * ");
			} else
				System.out.println(i + " = " + res1);
		}
	}

	// Àç±ÍÇÔ¼ö, Àç±Í¸Þ¼Òµå
	void fact2(int x) {
		res2 *= x;
		if (x != 1) {
			System.out.print(x + " * ");
			fact2(--x);
		} else {
			System.out.println(x + " = " + res2);
		}
	}
}
