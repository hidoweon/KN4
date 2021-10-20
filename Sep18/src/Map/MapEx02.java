package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Double> cities = new HashMap<>();
		cities.put("¼­¿ï", 32.5);
		cities.put("º£ÀÌÂ¡", 35.8);
		cities.put("È«Äá", 39.5);
		cities.put("¼­¿ï", 38.7);

		Set<String> keyset = cities.keySet();
		Iterator<String> itor = keyset.iterator();
		while (itor.hasNext()) {
			String key = itor.next();
			double cc = cities.get(key);
			System.out.println(key + " µµ½ÃÀÇ ¿Âµµ´Â " + cc);
		}

		double c = cities.get("¼­¿ï");
		System.out.println("¼­¿ïÀÇ ¿Âµµ´Â:" + c);

		c = cities.get("È«Äá");
		System.out.println("È«ÄáÀÇ ¿Âµµ´Â:" + c);
	}

}
