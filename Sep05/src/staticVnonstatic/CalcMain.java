package staticVnonstatic;

public class CalcMain {

	public static void main(String[] args) {

		System.out.println(Calculator.pi);

		int result = Calculator.plus(10, 20);
		System.out.println(result);

		int result2 = Calculator.minus(10, 30);
		System.out.println(result2);

		// static 벰버는 아래와 같이 사용 안함
		Calculator c = new Calculator();
		// c.pi;
		// c.minus(10, 30);
		// c.plus(10, 20);
	}

}
