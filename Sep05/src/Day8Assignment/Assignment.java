// package Day8Assignment;
// 
//
//import java.util.Scanner;
//
//public class Assignment {
//
//	// ��ĳ�ʷ� �Է°� �Է¹ޱ� ���� ���� Ű ������
//	// �ݺ�ó�� �����ϰ�
//	// ��� ���� ����� yes/no���� �޾Ƽ� �����ϵ��� ����
//	// https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=kmovie97&logNo=150186681215
//
//	Scanner scanner = new Scanner(System.in);
//
//	boolean run = true;
//	// double age = 0;
//	// double h1 = 0;
//	// double w1 = 0;
//

//	

//	while(true)
//	{
//		System.out.println("����� ������ �Է����ֽʽÿ�.(���� Ȥ�� �������� �������ֽʽÿ�)");
//
//		String sex = scanner.next();
//
//		switch (sex) {
//
//		case "����": {
//			System.out.println("����� ������ �½��ϱ�?(Y/N)");
//			String YN = scanner.next();
//			if (YN.equals("Y")) {
//				System.out.println("����� ����, Ű, �����Ը� ������� �Է����ֽʽÿ�.");
//				double age, h1, w1 = scanner.nextDouble(); //�Ұ���
//				System.out.println("����� ���̴�" + age + ", Ű��" + h1 + ", �����Դ�" + w1 + "kg�� �½��ϱ�?");
//
//				String YN2 = scanner.next();
//
//				if (YN.equals("Y")) {
//					double result1 = (1.10 * w1) - (128 * (w1 * w1) / (h1 * h1));
//					double result2 = w1 - result1;
//					double result3 = (result1 * 100) / w1;
//					double result4 = 100 - result3;
//					System.out.println("����� �����淮��" + result1 + "kg�Դϴ�.");
//					System.out.println("ü���淮�� " + result2 + "kg�Դϴ�.");
//					System.out.println("��������� " + result3 + "% �̸�,");
//					System.out.println("ü������� " + result4 + "% �Դϴ�.");
//
//						if (result4 <= 12)
//							System.out.println("����� �������Դϴ�.");
//						else if (result4 <= 17)
//							System.out.println("����� ǥ��ü���Դϴ�.");
//						else if (result4 <= 22)
//							System.out.println("����� ��ü���Դϴ�.");
//						else if (result4 <= 27)
//							System.out.println("����� ���Դϴ�.");
//						else
//							System.out.println("����� �����Դϴ�.");
//						break;
//				}
//			} else
//				break;
//		}
//
//		case "����":
//			System.out.println("����� ������ �½��ϱ�?(Y/N)");
//			String YN = scanner.next();
//			if (YN.equals("Y")) {
//				System.out.println("����� ����, Ű, �����Ը� ������� �Է����ֽʽÿ�.");
//				double age, height, weight = scanner.nextDouble();
//			}
//
//		}
//	}
//}}
//
