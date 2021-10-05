package Method;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 멤소드를 내장하고 있는 클래스의 객체 생성
		MethodEx m = new MethodEx();

		// 참조변수의 베소드 접근
		int result = m.sum(10, 10);
		System.out.println(result);

		String str1 = m.greeting();
		System.out.println(str1);

		m.sumVoid(20, 20);

		m.greetingVoid();

	}

}
