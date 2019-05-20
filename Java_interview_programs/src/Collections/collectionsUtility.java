package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionsUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li=new ArrayList<>();
		li.add("Vinithra");
		li.add("Deepak");
		li.add("Hanuman");
		li.add("Abhi");
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		
		Comparator<String> c=(s1,s2) -> {
			
			if (s1.length()>s2.length()) return -1;
			else if (s1.length()<s2.length()) return 1;
			else return s1.compareTo(s2);};
			
			Collections.sort(li, c);
			System.out.println(li);
			int binarySearch = Collections.binarySearch(li, "Vinithra");
			System.out.println(binarySearch);
			
			Collections.reverse(li);
			System.out.println(li);
	}

}
