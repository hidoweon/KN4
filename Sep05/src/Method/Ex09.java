package Method;

public class Ex09 {

	public static void main(String[] args) {
		// default생성자가 없으면 default 생성자 호출 불가
		// 매개변수 3개짜리 생성호출하여 객체 생성
		B3 b = new B3(98, 89, 93);
		b.sum(); // 메소드 호출
		System.out.println(b.sum); // 필드 접근
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
		sum = kor + eng + math; // sum() 메소드에 의해 sum=0으로 초기화된 상태에서 kor+eng+math결과로 갱신
	}

	int avg() {
		return sum / 3; // sum()메소드의 처리 결과에 의해 값을 평균으로 처리한 결과 리턴
	}
}