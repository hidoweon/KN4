package Method;

public class Ex09 {

	public static void main(String[] args) {
		// default�����ڰ� ������ default ������ ȣ�� �Ұ�
		// �Ű����� 3��¥�� ����ȣ���Ͽ� ��ü ����
		B3 b = new B3(98, 89, 93);
		b.sum(); // �޼ҵ� ȣ��
		System.out.println(b.sum); // �ʵ� ����
		int avg = b.avg();
		System.out.println(avg);
	}
}

class B3 {
	int kor, eng, math, sum;

	B3(int k, int e, int m) {
		kor = k;
		eng = e;
		math = m;
	}

	void sum() {
		sum = kor + eng + math; // sum() �޼ҵ忡 ���� sum=0���� �ʱ�ȭ�� ���¿��� kor+eng+math����� ����
	}

	int avg() {
		return sum / 3; // sum()�޼ҵ��� ó�� ����� ���� ���� ������� ó���� ��� ����
	}
}