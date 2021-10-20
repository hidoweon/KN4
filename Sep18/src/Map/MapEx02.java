package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Double> cities = new HashMap<>();
		cities.put("����", 32.5);
		cities.put("����¡", 35.8);
		cities.put("ȫ��", 39.5);
		cities.put("����", 38.7);

		Set<String> keyset = cities.keySet();
		Iterator<String> itor = keyset.iterator();
		while (itor.hasNext()) {
			String key = itor.next();
			double cc = cities.get(key);
			System.out.println(key + " ������ �µ��� " + cc);
		}

		double c = cities.get("����");
		System.out.println("������ �µ���:" + c);

		c = cities.get("ȫ��");
		System.out.println("ȫ���� �µ���:" + c);
	}

}
