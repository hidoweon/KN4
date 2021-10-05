package Method2;

public class ArrayPassing2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 1, 2, 3, 4, 5 };

		increase(a);

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static void increase(int[] array) {

		// 货肺款 硅凯 积己
		int[] newArr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			newArr[i] = array[i];
		}
		for (int i = 0; i < newArr.length; i++) {
			newArr[i]++; //
		}
		for (int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]);
		}
		System.out.println();
	}

}
