package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryEx {

	public static void main(String[] args) {
		// "apple" - "���"
		// "pear" - "��"
		// "peach" - "������"
		// "dog" - "��"
		// "cat" - "�����"
		// "zebra" - "��踻"
		// �ʿ� ������
		// scanner�� ������ �Է¹޾Ƽ� �ش��ϴ� �ѱ� ���
		// Ű�� ������ �ٽ� �Է��ϵ���
		// �������� "end"�� �ԷµǸ� ����;

		Map<String, String> m = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		m.put("apple", "���");
		m.put("pear", "��");
		m.put("peach", "������");
		m.put("dog", "��");
		m.put("cat", "�����");
		m.put("zebra", "��踻");

		while (true) {
			System.out.println("ã���ô� �ܾ �Է����ּ���");
			String key = scanner.next();
			if (!key.equals("end")) {
				if (m.containsKey(key)) {
					System.out.println(m.get(key));
					System.out.println();
				} else {
					System.out.println("�ش��ϴ� �ܾ �������� �ʽ��ϴ�.");
					System.out.println();
				}

			} else {
				System.out.println("�ý����� �����մϴ�.");
				break;
			}
		}

	}
}
