package LastAssignment;

import java.util.regex.Pattern;

public class Ex10 {
	public static void main(String[] args) {

		String id = "5Angel1004";
		String regExp = "[a-zA-z][a-zA-Z0-9]{8,12}";
		boolean isMatch = Pattern.matches(regExp, id);
		if (isMatch) {
			System.out.println("ID�� ����� �� �ֽ��ϴ�.");
		} else {
			System.out.println("ID�� ����� �� �����ϴ�.");
		}
	}
}
