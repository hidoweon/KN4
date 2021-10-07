package Sep06Assignment;

import java.util.Scanner;

public class No20Important {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.����");
			int selectNo = scanner.nextInt();
			switch (selectNo) {
			case 1:
				createAccount();
				break;
			case 2:
				accountList();
				break;
			case 3:
				deposit();
				break;
			case 4:
				withdraw();
				break;
			case 5:
				run = !run;
			}
		}
		System.out.println("���α׷� ����");
	}

	private static void createAccount() {
		System.out.println("-----");
		System.out.println("���»���");
		System.out.println("-----");
		System.out.println("���¹�ȣ:");
		String ano = scanner.next();
		System.out.println("������:");
		String owner = scanner.next();
		System.out.println("�ʱ��Աݱݾ�:");
		int balance = scanner.nextInt();
		Account acc = new Account(ano, owner, balance);
		accountArray[idx++] = acc;
		System.out.println("���°� �����Ǿ����ϴ�.");
	}

	private static void accountList() {
		System.out.println("--------");
		System.out.println("���¸�Ϻ���");
		System.out.println("--------");

		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null)
				System.out.println(account.toString());
		}
	}

	private static void deposit() {
		System.out.println("����");
		System.out.println("----");
		System.out.println("���¹�ȣ");
		String ano = scanner.next();
		System.out.println("���ݾ�");
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);
		if (acc != null) {
			acc.setBalance(acc.getBalance() + amount);
			System.out.println("������ �����Ǿ����ϴ�.");
		} else
			System.out.println("���¹�ȣ�� Ȯ�����ּ���");

	}

	private static void withdraw() {
		System.out.println("���");
		System.out.println("�����Է�");
		String ano = scanner.next();
		System.out.println("�ݾ�");
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);
		if (acc != null) {
			if (acc.getBalance() - amount >= 0) {
				acc.setBalance(acc.getBalance() - amount);
				System.out.println("����� ��û�Ǿ����ϴ�.");
			} else
				System.out.println("�ܰ����");
		}

	}

	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountArray.length; i++) {
			account = accountArray[i];
			if (account != null)
				if (account.getAno().equals(ano))
					return account;
		}
		return account;
	}
}