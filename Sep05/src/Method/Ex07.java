package Method;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		G1 g = new G1();
		for (int i = 0; i < 5; i++) {
			String str = g.method();
			System.out.println(str);
		}
	}

}

class G1 {
	String method() {
		return "´ë¹Ú";
	}

}