package ClassExample01;

public class UseCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calc01 cal = new Calc01();

		int res1 = cal.add(10, 20);
		System.out.println(res1);

		cal.i = 10;
		cal.j = 20;
		double res2 = cal.divide();
		System.out.println(res2);

		cal.sub(10, 20);

		cal.mul();
	}

}
