package Objects;

import java.util.Objects;

public class CompareEx {

	public static void main(String[] args) {
		Student s1 = new Student(1);
		Student s2 = new Student(1);
		Student s3 = new Student(3);

		int result = Objects.compare(s1, s2, new StudentsComparator());
		System.out.println(result);

		int result2 = Objects.compare(s2, s3, new StudentsComparator());
		System.out.println(result2);

	}

}
