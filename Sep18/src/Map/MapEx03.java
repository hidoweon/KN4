package Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> m = new HashMap<>();

		m.put(1, "ȫ�浿");
		m.put(2, "������");
		m.put(3, "�Ӳ���");
		m.put(2, "�̼���");

		System.out.println(m.size());
		System.out.println(m.get(3));
		System.out.println(m.get(2));

	}

}