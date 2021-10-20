package Lsit;

import java.util.Comparator;
import java.util.List;

public class LinkedList {

	public static void main(String[] args) {
		List<String> list = new java.util.LinkedList<>();

		list.add("gildong");
		list.add("일지매");
		list.add("임꺽정");

		System.out.println(list.size());

		System.out.println(list.contains("이순신"));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		list.set(2, "유관순");
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
