package Objects;

import java.util.Objects;

public class HashExample {

	public static void main(String[] args) {
		Student s1 = new Student(1, "È«±æ·Õ");
		Student s2 = new Student(1, "È«±æ·Õ");
		System.out.println(s1.hashCode());
		// System.out.println(Object.hashCode(s2));

	}

	static class Student {
		int sno;
		String name;

		public Student(int sno, String name) {

			this.sno = sno;
			this.name = name;
		}

		@Override
		public int hashCode() {
			return Objects.hash(name, sno);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			return Objects.equals(name, other.name) && sno == other.sno;
		}

	}
}
