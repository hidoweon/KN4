//package Lsit;
//
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.List;
//
//public class LinkedListEx3 {
//
//	public static void main(String[] args) {
//		// Member클래스 int sno, String name
//		// 1. "홍길동" 2. "일지매" 3. "임꺽정" 순으로 저장하는 linkedlist 생성하여 저장
//
//		// list에 일지매가 존재하는지 확인
//
//		// index 번호 2번에 해당하는 객체를 4, "이순신"으로 교체
//
//		List<Member> list = new LinkedList<>();
//
//		list.add(new Member(1, "홍길동"));
//		list.add(new Member(1, "일지매"));
//		list.add(new Member(1, "임꺽정"));
//
//		boolean result = list.contains(new Member(2, "일지매"));
//		System.out.println(result);
//
//		list.set(2, new Member(4, "이순신"));
//
//		for (int i = 0; i < list.size(); i++) {
//			Member m = list.get(i);
//			System.out.println(m.getSno() + ":" + m.getName());
//		}
//
//		list.sort(new Comparator<Member>() {
//
//			@Override
//			public int compare(Member o1, Member o2) {
//				return o1.getSno() - o2.getSno();
//			}
//		});
//
//		for (int i = 0; i < list.size(); i++) {
//			Member m = list.get(i);
//			System.out.println(m);
//		}
//	}
//
//}
//
//class Member {
//	private String sno;
//	private String name;
//
//	public Member(String sno, String name) {
//		this.sno = sno;
//		this.name = name;
//	}
//
//	public String getSno() {
//		return sno;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//}