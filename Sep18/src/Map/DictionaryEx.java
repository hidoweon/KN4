package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {

	public static void main(String[] args) {
		// "apple" - "사과"
		// "pear" - "배"
		// "peach" - "복숭아"
		// "dog" - "개"
		// "cat" - "고양이"
		// "zebra" - "얼룩말"
		// 맵에 저장후
		// scanner로 영문을 입력받아서 해당하는 한글 출력
		// 키가 없으면 다시 입력하도록
		// 끝낼때는 "end"가 입력되면 종료;

		Map<String, String> m = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		m.put("apple", "사과");
		m.put("pear", "배");
		m.put("peach", "복숭아");
		m.put("dog", "개");
		m.put("cat", "고양이");
		m.put("zebra", "얼룩말");

		while (true) {
			System.out.println("찾으시는 단어를 입력해주세요");
			String key = scanner.next();
			if (!key.equals("end")) {
				if (m.containsKey(key)) {
					System.out.println(m.get(key));
					System.out.println();
				} else {
					System.out.println("해당하는 단어가 존재하지 않습니다.");
					System.out.println();
				}

			} else {
				System.out.println("시스템을 종료합니다.");
				break;
			}
		}

	}
}
