package staticVnonstatic;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C1.method2();

		C1 c = new C1();
		c.method1();
		c.method2();
	}

}

class C1 {
	void method1() {
		System.out.println("i am instance");
	}

	static void method2() {
		System.out.println("i am static method");
	}
}