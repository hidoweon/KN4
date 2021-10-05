package Day8Assignment;

import java.util.Scanner;

public class AssignmentAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. 제지방 구하기 - 남성 1.10*체중 - (128*(체중^2)/키^2) 여성 1.07*체중 - (128*(체중^2)/키^2) 2.
		 * 체지방량 3.체지방율
		 */

		Scanner scanner = new Scanner(System.in);

		final double maleSTD = 1.10, femaleSTD = 1.07;
		final int COMSTD = 128, COMSTD2 = 100;
		boolean run = true;

		while (run) {
			String gender;
			int age;
			double height;
			double weight;
			// static void menu(){}

			System.out.println("------------------------------------------------------------------");
			System.out.println("성별을 선택해주십시오 (M/F)");
			System.out.println("------------------------------------------------------------------");

			// static void myInfo(){}
			gender = scanner.next();

			System.out.println("나이를 입력해주십시오.");
			age = scanner.nextInt();

			System.out.println("키를 입력해주십시오");
			height = scanner.nextDouble();

			System.out.println("몸무게를 입력해주십시오");
			weight = scanner.nextDouble();

			// 1.제지방량 구하기
			// leanBodyMass = getLeanBodyMass(String gender){}

			double leanBodyMass = 0.0;
			switch (gender) {

			case "M":
				leanBodyMass = (maleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
			case "F":
				leanBodyMass = (femaleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
			}

			// 2. 체지방량구하기
			// bodyFatMass = getBodyFatMass(){}
			double bodyFatMass = 0.0;
			bodyFatMass = weight - leanBodyMass;

			// 3. 제지방률 구하기
			// leanBodyRatio = getLeanBodyRatio(double a, int weight){}
			double leanBodyRatio = (leanBodyMass * COMSTD2) / (double) weight;

			// 4.체지방률 구하기
			// bodyFatRatio = getbodyFatRatio(){}
			double bodyFatRatio = (bodyFatMass * COMSTD2) / (double) weight;

			// 4.비만도 계산
			// result = getResult(String gender, double bodyFatRatio){}
			String result = "";
			switch (gender) {
			case "M":
				if (bodyFatRatio < 12)
					result = "야윈몸 ";
				else if (bodyFatRatio <= 17)
					result = "표준";
				else if (bodyFatRatio <= 22)
					result = "과체중";
				else if (bodyFatRatio <= 27)
					result = "비만";
				else
					result = "고도비만";
				break;

			case "F":
				if (bodyFatRatio < 22)
					result = "야윈몸 ";
				else if (bodyFatRatio <= 27)
					result = "표준";
				else if (bodyFatRatio <= 35)
					result = "과체중";
				else if (bodyFatRatio <= 40)
					result = "비만";
				else
					result = "고도비만";
				break;
			}
			// 출력 메소드 void형
			// void printResult(){}
			System.out.println("결과 > ");
			System.out.printf("제지방량:%.2f\n", leanBodyMass);
			System.out.printf("페지방량:%.2f\n", leanBodyRatio);
			System.out.printf("제지방률:%.2f\n", bodyFatMass);
			System.out.printf("체지방률:%.2f\n", bodyFatRatio);
			System.out.println("당신은 " + result + "입니다.");

			// void isRun(){}
			System.out.println("계속할까요? (Y/N)");
			String yN = scanner.next();
			if (yN.equals("N"))
				run = !run;

		}
	}
}
