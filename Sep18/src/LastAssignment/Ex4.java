package LastAssignment;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member = new Member("blue", "lee-paran");
		System.out.println(member);
	}

}

class Member {
	private String id;
	private String name;

	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}

}
