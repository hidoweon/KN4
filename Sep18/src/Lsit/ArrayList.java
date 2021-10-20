package Lsit;

import java.util.List;

public class ArrayList {
	public static void main(String[] args) {

		List<String> list = new java.util.ArrayList<>();

		list.add("Hello");
		list.add("hi");
		list.add("Java");

		int n = list.size();
		System.out.println(n);

		list.add(2, "Shani");
		// list.add(5, "shanghai");

		String str = list.get(1);
		System.out.println(str);

		list.remove(3);
		// list.remove(4);

		list.clear();
	}
}
