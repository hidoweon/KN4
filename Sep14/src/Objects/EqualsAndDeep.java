package Objects;

import java.util.Objects;

public class EqualsAndDeep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer o1 = 1000;
		Integer o2 = 1000;

		System.out.println(Objects.equals(o1, o2));
		System.out.println(Objects.deepEquals(o1, o2));
	}

}
