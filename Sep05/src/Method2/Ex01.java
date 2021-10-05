package Method2;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;

		increase(n);

		// n은 increase()메소드에 의해 영향을 받지 않음.
		System.out.println(n);
	}

	// 값 복사되어 넘어와 ㅔㅁ소드내에서 처리
	static void increase(int m) {
		m = m + 1;
	}
}
