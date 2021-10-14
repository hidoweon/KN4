package Objects;

import java.util.Objects;

public class NullEx {

	public static void main(String[] args) {
		String s1 = "gildong";
		String s2 = null;

		System.out.println(Objects.requireNonNull(s1));
		// System.out.println(Objects.requireNonNull(s2));

		System.out.println(Objects.isNull(s1));
		System.out.println(Objects.isNull(s2));

		// System.out.println(Objects.requireNonNull(s2, "이름이 없음"));

		System.out.println(Objects.toString(s1));
		System.out.println(Objects.toString(s2));
		System.out.println(Objects.toString(s2, "no name"));
	}

}
