package Method2;

public class ArrayPassing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5 };

		// �迭�� ��ü - �����ּҰ��� �Ű����� ������ ���� ��.
		increase(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	// �迭�� �Ű������� ���޵ȴٴ� ���� �����ϴ� �ּҰ��� ���޵ȴٴ� ��.
	static void increase(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++; // int x=array[i]; x++; array[i]=x
		}
	}

}
