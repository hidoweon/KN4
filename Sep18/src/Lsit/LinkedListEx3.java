//package Lsit;
//
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.List;
//
//public class LinkedListEx3 {
//
//	public static void main(String[] args) {
//		// MemberŬ���� int sno, String name
//		// 1. "ȫ�浿" 2. "������" 3. "�Ӳ���" ������ �����ϴ� linkedlist �����Ͽ� ����
//
//		// list�� �����Ű� �����ϴ��� Ȯ��
//
//		// index ��ȣ 2���� �ش��ϴ� ��ü�� 4, "�̼���"���� ��ü
//
//		List<Member> list = new LinkedList<>();
//
//		list.add(new Member(1, "ȫ�浿"));
//		list.add(new Member(1, "������"));
//		list.add(new Member(1, "�Ӳ���"));
//
//		boolean result = list.contains(new Member(2, "������"));
//		System.out.println(result);
//
//		list.set(2, new Member(4, "�̼���"));
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