package Sep20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex9 {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();

		m.put("blue", 96);
		m.put("hong", 86);
		m.put("white", 92);

		String name = null;
		int maxScore = 0;
		int totalScore = 0;

		Set<String> keySet = m.keySet();
		Iterator<String> it = keySet.iterator();
		while (it.hasNext()) {
			String key = it.next();
			int value = m.get(key);
			totalScore += value;

			if (maxScore < value) {
				maxScore = value;
				name = key;
			}
		}

		System.out.println("Æò±Õ: " + totalScore / m.size());
		System.out.println("ÃÖ°í: " + maxScore);
		System.out.println(name);

	}

}
