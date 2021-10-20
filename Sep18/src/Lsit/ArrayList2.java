package Lsit;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String 객체를 담는 lsit 만들고
		// "홍길동, 일지매, 임꺽정"을 저장 후 저장된 갯수를 리턴하도록 작성
		// "이순신"이 들어있는지 확인
		// 모든 객체를 출력
		// index번호 2번에 해당하는 객체를 "유관순"으로 변경하세요.
		// index번호 3번에 해당하는 객체를 출력하세요
		// 리스트내의 모든 객체를 삭제후
		// 리스트가 비어있는지 확인 메세지를 출력

		List<String> list = new ArrayList<>();

		list.add("홍길동");
		list.add("일지매");
		list.add("임꺽정");

		int n = list.size();
		System.out.println(n);

		System.out.println(list.contains("이순신") ? "이순신이 리스트에 존재합니다." : "이순신이 리스트에 존재하지 않습니다.");

		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i));
		System.out.println();

		list.set(2, "유관순");

		System.out.println(list.get(2));
		System.out.println();
		System.out.println(list);
		System.out.println();

		list.clear();

		System.out.println(list.isEmpty() ? "비어있음" : "비어있지 않음");

	}

}
