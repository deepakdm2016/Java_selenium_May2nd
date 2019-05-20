package Collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class mapDemo {
	
	//identity hasmap does ==
	//hashmap does .equals
	//so if you want duplicate, advisable to use identity hash map

	public static void main(String v[]) {
		Map<Integer, String> mp = new TreeMap<Integer, String>();
		mp.put(389524, "Deepak");
		mp.put(389524, "Deepak");
		mp.put(326112, "Vinithra");
		mp.put(314027, "Girish");

		Set<Integer> keySet = mp.keySet();
		System.out.println(keySet);

		

		Collection<String> values = mp.values();
		System.out.println(values);

		Set<Entry<Integer, String>> entrySet = mp.entrySet();

		for (Entry<Integer, String> m : entrySet) {
			System.out.println(m.getKey());
			System.out.println(m.getValue());

		}

	}
}
