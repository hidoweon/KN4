package Objects;

import java.util.Comparator;

public class StudentsComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.sno == o2.sno ? 0 : o1.sno - o2.sno;

	}
}

class Student {
	int sno;

	public Student(int sno) {
		this.sno = sno;
	}
}