package collectionRevision;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> emp = new HashMap<>();
		emp.put("Deepak", 389524);
		emp.put("Nagesh", 326112);
		emp.put("Vinithra", 314027);
		emp.put("Pavithra", 369639);
		emp.put("Sanalkumar Sandeep", 546780);

		Set<String> keySet = emp.keySet();
		Set<Entry<String, Integer>> entrySet = emp.entrySet();

		System.out.println(keySet);
		Iterator it = keySet.iterator();
		while (it.hasNext()) {
			System.out.println(emp.get(it.next()));
		}
		

		Iterator<Entry<String, Integer>> empEntry = entrySet.iterator();

		for (Entry<String, Integer> e:entrySet)
		{
			System.out.println(e.getKey()+": "+e.getValue());
			System.out.println();
		}

	}

}
