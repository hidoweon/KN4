package String;

public class StringEx3 {

	public static void main(String[] args) {
		String sbj = "Java Programming Java Programming";
		String sbj2 = sbj.replace("Java", "ÀÚ¹Ù");

		System.out.println(sbj2);

		String org = "Java Programming";
		String low = org.toLowerCase();
		String up = org.toUpperCase();
		System.out.println(low);
		System.out.println(up);

		String tel1 = "010";
		String tel2 = "9566";
		String tel3 = "     8833    ";
		System.out.println(tel3.length());

		String tel = tel1.trim() + "-" + tel2.trim() + "-" + tel3.trim();
		System.out.println(tel);

		String str1 = String.valueOf(10);
		System.out.println(str1);
		String str2 = String.valueOf(10.1);
		System.out.println(str2);
	}

}
