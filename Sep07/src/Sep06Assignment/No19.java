package Sep06Assignment;

public class No19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account1 account = new Account1();

		account.setBalance(10000);
		System.out.println("your balance: " + account.getBalance());
	}

}

class Account1 {
	private int balance;
	final int MAX_VALUE = 1000000;
	final int MIN_VALUE = 0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		if (balance >= MIN_VALUE && balance <= MAX_VALUE)
			this.balance = balance;
	}

}