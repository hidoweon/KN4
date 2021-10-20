package Lsit;

import java.util.Vector;

public class VectorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector<Integer>();

		// System.out.println(v.capacity());

		v.add(5);
		v.add(new Integer(4));
		v.add(-1);

		System.out.println(v.size());
		System.out.println();

		v.add(2, 100);

		for (int i = 0; i < v.size(); i++)
			System.out.println(v.get(i));
		System.out.println();

		Integer obj = v.get(1);
		int i = obj.intValue();
		System.out.println(i);
		System.out.println();

		int j = v.get(1);
		System.out.println(j);
		System.out.println();

		v.remove(1);

		int last = v.lastElement();
		System.out.println(last);
		System.out.println();

		for (int i1 = 0; i1 < v.size(); i1++)
			System.out.println(v.get(i1));
		System.out.println();

		v.removeAllElements();

		System.out.println(v.isEmpty());
	}

}
