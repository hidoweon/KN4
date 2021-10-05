package Day8Assignment;

import java.util.Scanner;

public class AssignmentAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. ������ ���ϱ� - ���� 1.10*ü�� - (128*(ü��^2)/Ű^2) ���� 1.07*ü�� - (128*(ü��^2)/Ű^2) 2.
		 * ü���淮 3.ü������
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
			System.out.println("������ �������ֽʽÿ� (M/F)");
			System.out.println("------------------------------------------------------------------");

			// static void myInfo(){}
			gender = scanner.next();

			System.out.println("���̸� �Է����ֽʽÿ�.");
			age = scanner.nextInt();

			System.out.println("Ű�� �Է����ֽʽÿ�");
			height = scanner.nextDouble();

			System.out.println("�����Ը� �Է����ֽʽÿ�");
			weight = scanner.nextDouble();

			// 1.�����淮 ���ϱ�
			// leanBodyMass = getLeanBodyMass(String gender){}

			double leanBodyMass = 0.0;
			switch (gender) {

			case "M":
				leanBodyMass = (maleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
			case "F":
				leanBodyMass = (femaleSTD * weight) - (COMSTD * ((weight * weight) / (double) (height * height)));
			}

			// 2. ü���淮���ϱ�
			// bodyFatMass = getBodyFatMass(){}
			double bodyFatMass = 0.0;
			bodyFatMass = weight - leanBodyMass;

			// 3. ������� ���ϱ�
			// leanBodyRatio = getLeanBodyRatio(double a, int weight){}
			double leanBodyRatio = (leanBodyMass * COMSTD2) / (double) weight;

			// 4.ü����� ���ϱ�
			// bodyFatRatio = getbodyFatRatio(){}
			double bodyFatRatio = (bodyFatMass * COMSTD2) / (double) weight;

			// 4.�񸸵� ���
			// result = getResult(String gender, double bodyFatRatio){}
			String result = "";
			switch (gender) {
			case "M":
				if (bodyFatRatio < 12)
					result = "������ ";
				else if (bodyFatRatio <= 17)
					result = "ǥ��";
				else if (bodyFatRatio <= 22)
					result = "��ü��";
				else if (bodyFatRatio <= 27)
					result = "��";
				else
					result = "����";
				break;

			case "F":
				if (bodyFatRatio < 22)
					result = "������ ";
				else if (bodyFatRatio <= 27)
					result = "ǥ��";
				else if (bodyFatRatio <= 35)
					result = "��ü��";
				else if (bodyFatRatio <= 40)
					result = "��";
				else
					result = "����";
				break;
			}
			// ��� �޼ҵ� void��
			// void printResult(){}
			System.out.println("��� > ");
			System.out.printf("�����淮:%.2f\n", leanBodyMass);
			System.out.printf("�����淮:%.2f\n", leanBodyRatio);
			System.out.printf("�������:%.2f\n", bodyFatMass);
			System.out.printf("ü�����:%.2f\n", bodyFatRatio);
			System.out.println("����� " + result + "�Դϴ�.");

			// void isRun(){}
			System.out.println("����ұ��? (Y/N)");
			String yN = scanner.next();
			if (yN.equals("N"))
				run = !run;

		}
	}
}
