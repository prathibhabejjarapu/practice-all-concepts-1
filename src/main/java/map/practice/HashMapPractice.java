package map.practice;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "chinni");
		m.put(2, "sri");
		m.put(3, "vinu");
		m.put(4, "thota");
		// System.out.println(m);
		Set<Integer> keys = m.keySet();
		System.out.println(keys);
		Collection<String> values = m.values();
		System.out.println(values);
		m.put(2, "sriyanvi");

		for (Integer key : keys) {
			System.out.println(key + "-----" + m.get(key));
		}
		System.out.println(m.containsKey(8));
	}

}
