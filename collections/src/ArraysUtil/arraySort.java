package ArraysUtil;

import java.util.Arrays;
import java.util.List;

public class arraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,7,4,6};
		System.out.println("Before sort");
		for (int i:a)
		{
			System.out.println(i);
		}
		
		Arrays.sort(a);
		System.out.println("After sort");
		for (int i:a)
		{
			System.out.println(i);
		}
		
		
		String s[]={"Z","A","K","D"};
		Arrays.sort(s, new myComparator());
		System.out.println("After sorting the strings");

		for (String s1:s)
		{
			System.out.println(s1);
		}
		
		List<String> asList = Arrays.asList(s);
		System.out.println(asList);
		
		s[1]="Y";
		System.out.println(asList);
		
		asList.add("L");
		System.out.println(asList);
		

	}

}
