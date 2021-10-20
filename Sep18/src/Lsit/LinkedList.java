package Lsit;

import java.util.Comparator;
import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		List<String> list = new java.util.LinkedList<>();

		list.add("gildong");
		list.add("������");
		list.add("�Ӳ���");

		System.out.println(list.size());

		System.out.println(list.contains("�̼���"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.set(2, "������");
		System.out.println();

		System.out.println(list.get(2));

		list.clear();
		System.out.println(list.isEmpty());

		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
	}

}
