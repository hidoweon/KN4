package Sep06Assignment;

public class No16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("gildong");
	}

}

class Printer {
	void println(int i) {
		System.out.println(i);
	}

	void println(double i) {
		System.out.println(i);
	}

	void println(boolean i) {
		System.out.println(i);
	}

	void println(String s) {
		System.out.println(s);
	}

}