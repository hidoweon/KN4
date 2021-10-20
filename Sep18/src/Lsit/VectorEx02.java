//package Lsit;
//
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.List;
//
//public class VectorEx02 {
//
//	public static void main(String[] args) {
//
//		List<Member> list = new LinkedList<>();
//		// Vector<Member> list = new Vector<Member>();
//
//		list.add(new Member(1, "홍길동"));
//		list.add(new Member(1, "일지매"));
//		list.add(new Member(1, "임꺽정"));
//
//		System.out.println();
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
//	private int sno;
//	private String name;
//
//	public Member(int sno, String name) {
//		this.sno = sno;
//		this.name = name;
//	}
//
//	public int getSno() {
//		return sno;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//}