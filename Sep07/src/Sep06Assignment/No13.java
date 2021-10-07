package Sep06Assignment;

public class No13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member u1 = new Member("È²µµ¿ø", "hidoweon");
		Member u2 = new Member();
	}

}

class Member {
	private String name;
	private String id;
	private String password;
	private int age;

	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Member() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}