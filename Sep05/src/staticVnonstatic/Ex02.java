package staticVnonstatic;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bnk = Bank.getBank();
		System.out.println("�ŷ�����: " + bnk.name);
	}

}

class Bank {
	String name;
	private static Bank b = new Bank("�ϳ�����");

	private Bank(String n) {
		name = n;
	}

	static Bank getBank() {
		return b;
	}
}