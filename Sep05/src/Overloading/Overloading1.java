package Overloading;

public class Overloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingSample ols = new OverloadingSample();

		System.out.printf("%.2f", ols.getSum(10.2, 50.9));
		System.out.println(ols.getSum(10, 50, 99));
		System.out.println(ols.getSum(10, 100));
	}

}
