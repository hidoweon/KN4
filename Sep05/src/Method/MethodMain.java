package Method;

public class MethodMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ��ҵ带 �����ϰ� �ִ� Ŭ������ ��ü ����
		MethodEx m = new MethodEx();

		// ���������� ���ҵ� ����
		int result = m.sum(10, 10);
		System.out.println(result);

		String str1 = m.greeting();
		System.out.println(str1);

		m.sumVoid(20, 20);

		m.greetingVoid();

	}

}
