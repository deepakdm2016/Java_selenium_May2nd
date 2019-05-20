package Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArraysSort {

	public static void main(String[] args) {

		int a[]={40, 10, 5, 6};
		for(int i:a)
			System.out.println(i);
	
		Arrays.sort(a);
		for(int i:a)
			System.out.println(i);
		
		
		String s[]={"z","a","b","y"};
		for(String i:s)
			System.out.println(i);
		Comparator<String> c=(s1,s2)->{if (s1.compareTo(s2)>1) return 1; else if(s1.compareTo(s2)<1) return -1; else return 0;};
		
		Arrays.sort(s,c);
		for(String i:s)
			System.out.println(i);
	
		List<int[]> asList = Arrays.asList(a);
		List<String> asList2 = Arrays.asList(s);
		System.out.println(asList2);
		asList2.set(1, "K");
		System.out.println(asList2);
		for(String i:s)
			System.out.println(i);
	}

}
