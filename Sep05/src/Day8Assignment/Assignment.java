// package Day8Assignment;
// 
//
//import java.util.Scanner;
//
//public class Assignment {
//
//	// 스캐너로 입력값 입력받기 성별 나이 키 몸무게
//	// 반복처리 가능하게
//	// 계속 여부 출력후 yes/no값을 받아서 종료하도록 수정
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
//		System.out.println("당신의 성별을 입력해주십시오.(남성 혹은 여성으로 선택해주십시오)");
//
//		String sex = scanner.next();
//
//		switch (sex) {
//
//		case "남성": {
//			System.out.println("당신은 남성이 맞습니까?(Y/N)");
//			String YN = scanner.next();
//			if (YN.equals("Y")) {
//				System.out.println("당신의 나이, 키, 몸무게를 순서대로 입력해주십시오.");
//				double age, h1, w1 = scanner.nextDouble(); //불가능
//				System.out.println("당신의 나이는" + age + ", 키는" + h1 + ", 몸무게는" + w1 + "kg가 맞습니까?");
//
//				String YN2 = scanner.next();
//
//				if (YN.equals("Y")) {
//					double result1 = (1.10 * w1) - (128 * (w1 * w1) / (h1 * h1));
//					double result2 = w1 - result1;
//					double result3 = (result1 * 100) / w1;
//					double result4 = 100 - result3;
//					System.out.println("당신의 제지방량은" + result1 + "kg입니다.");
//					System.out.println("체지방량은 " + result2 + "kg입니다.");
//					System.out.println("제지방률은 " + result3 + "% 이며,");
//					System.out.println("체지방률은 " + result4 + "% 입니다.");
//
//						if (result4 <= 12)
//							System.out.println("당신은 야윈몸입니다.");
//						else if (result4 <= 17)
//							System.out.println("당신은 표준체형입니다.");
//						else if (result4 <= 22)
//							System.out.println("당신은 과체중입니다.");
//						else if (result4 <= 27)
//							System.out.println("당신은 비만입니다.");
//						else
//							System.out.println("당신은 고도비만입니다.");
//						break;
//				}
//			} else
//				break;
//		}
//
//		case "여성":
//			System.out.println("당신은 여성이 맞습니까?(Y/N)");
//			String YN = scanner.next();
//			if (YN.equals("Y")) {
//				System.out.println("당신의 나이, 키, 몸무게를 순서대로 입력해주십시오.");
//				double age, height, weight = scanner.nextDouble();
//			}
//
//		}
//	}
//}}
//
