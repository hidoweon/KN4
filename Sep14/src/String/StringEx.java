package String;

public class StringEx {

	public static void main(String[] args) {

		String ssn = "960318-1124546";

		int index = ssn.indexOf("-");
		char gender = ssn.charAt(index + 1);
		System.out.println(index);

		switch (gender) {
		case '1':
		case '3':
			System.out.println("³²");
			break;
		case '2':
		case '4':
			System.out.println("¿©");
			break;
		}

		char[] chars = new char[ssn.length()];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = ssn.charAt(i);
		}
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
	}

}
