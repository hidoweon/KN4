package Map;

import java.util.HashMap;
import java.util.Map;

public class MapEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> fruits = new HashMap<String, String>();

		fruits.put("apple", "���");
		String value = fruits.get("apple");
		System.out.println(value);
	}

}
