package Acc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Acclist {
	private static List<Account> accountList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	private static Account idx;

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("1.���»��� 2.���¸�� 3.���� 4.��� 5.�۱� 6.����");
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
				transfer();
				break;
			case 6:
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
		accountList.add(acc);
		System.out.println("���°� �����Ǿ����ϴ�.");
	}

	private static void accountList() {
		System.out.println("--------");
		System.out.println("���¸�Ϻ���");
		System.out.println("--------");

		for (int i = 0; i < accountList.size(); i++) {
			Account account = accountList.get(i);
			if (account != null)
				System.out.println(account);
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

	private static void transfer() {
		// 1�� ������ balance -=amount, 2�������� balance+=amount.
		System.out.println("�۱�");
		System.out.println("----");
		System.out.println("�۱��ϴ� ���¹�ȣ");
		String ano1 = scanner.next();
		System.out.println("�۱ݹ޴� ���¹�ȣ");
		String ano2 = scanner.next();
		System.out.println("��ü�� �ݾ�");
		int amount = scanner.nextInt();
		// Account acc = findAccount(ano);
	}

	private static Account findAccount(String ano) {
		Account account = null;
		for (int i = 0; i < accountList.size(); i++) {
			account = accountList.get(i);
			if (account != null)
				if (account.getAno().equals(ano))
					return account;
		}
		return account;
	}
}