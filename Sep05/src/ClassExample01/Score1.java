package ClassExample01;

public class Score1 {

	int kor;
	int eng;
	int math;

	void play() {
		int sum = kor + eng + math;
		System.out.print("�հ�: " + sum);
		System.out.println("���: " + sum / 3);
	}

	void print() {
		System.out.println(kor + "\t" + eng + "\t" + math);
	}

	void print(int kor, int eng, int math) {
		System.out.println(kor + "\t" + eng + "\t" + math);
	}

	int res(int kor, int eng, int math) {
		return kor + eng + math;
	}
}
