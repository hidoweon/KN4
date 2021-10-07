package Sep06Assignment;

import java.util.Scanner;

public class No20Important {
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	private static int idx;

	public static void main(String[] args) {

		boolean run = true;
		while (run) {
			System.out.println("1.계좌생성 2.계좌목록 3.예금 4.출금 5.종료");
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
		System.out.println("프로그램 종료");
	}

	private static void createAccount() {
		System.out.println("-----");
		System.out.println("계좌생성");
		System.out.println("-----");
		System.out.println("계좌번호:");
		String ano = scanner.next();
		System.out.println("계좌주:");
		String owner = scanner.next();
		System.out.println("초기입금금액:");
		int balance = scanner.nextInt();
		Account acc = new Account(ano, owner, balance);
		accountArray[idx++] = acc;
		System.out.println("계좌가 생성되었습니다.");
	}

	private static void accountList() {
		System.out.println("--------");
		System.out.println("계좌목록보기");
		System.out.println("--------");

		for (int i = 0; i < accountArray.length; i++) {
			Account account = accountArray[i];
			if (account != null)
				System.out.println(account.toString());
		}
	}

	private static void deposit() {
		System.out.println("예금");
		System.out.println("----");
		System.out.println("계좌번호");
		String ano = scanner.next();
		System.out.println("예금액");
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);
		if (acc != null) {
			acc.setBalance(acc.getBalance() + amount);
			System.out.println("예금이 성공되었습니다.");
		} else
			System.out.println("계좌번호를 확인해주세요");

	}

	private static void withdraw() {
		System.out.println("출금");
		System.out.println("계좌입력");
		String ano = scanner.next();
		System.out.println("금액");
		int amount = scanner.nextInt();
		Account acc = findAccount(ano);
		if (acc != null) {
			if (acc.getBalance() - amount >= 0) {
				acc.setBalance(acc.getBalance() - amount);
				System.out.println("출금이 신청되었습니다.");
			} else
				System.out.println("잔고부족");
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