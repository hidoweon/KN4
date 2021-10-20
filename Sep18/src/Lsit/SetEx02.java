package Lsit;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetEx02 {

	public static void main(String[] args) {
		Set<Member1> set = new HashSet<>();

		set.add(new Member1("1", "홍길동"));
		set.add(new Member1("2", "일지매"));
		set.add(new Member1("3", "임꺽정"));
		set.add(new Member1("2", "일지매"));

		Iterator<Member1> itr = set.iterator();
		while (itr.hasNext()) {
			Member1 m = itr.next();
			System.out.println(m);
		}

		System.out.println();
		for (Member1 m : set)
			System.out.println(m);

	}

}

class Member1 {
	private String sno;
	private String name;

	public Member1(String sno, String name) {
		this.sno = sno;
		this.name = name;
	}

	public String getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Member [sno=" + sno + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, sno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member1 other = (Member1) obj;
		return Objects.equals(name, other.name) && Objects.equals(sno, other.sno);
	}

	// hashCode

	// equals
}
