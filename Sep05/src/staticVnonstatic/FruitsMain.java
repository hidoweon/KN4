package staticVnonstatic;

public class FruitsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fruits f1 = new Fruits(10);
		Fruits f2 = new Fruits(20);
		Fruits f3 = new Fruits(30);
		System.out.println("first ate: " + f1.amount);
		System.out.println("second ate: " + f2.amount);
		System.out.println("last ate: " + f3.amount);
		System.out.println("remain: " + Fruits.currentAmount);
	}

}
