package Collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class setDemoStringsBuffer {

	public static void main(String v[])
	{
		Comparator<StringBuffer> c=(s1,s2) ->{
			return s1.toString().compareTo(s2.toString());
			
		} ;
		
		
		Comparator<StringBuffer> c2=(s1,s2) ->{
			if(s1.length()<s2.length())
				return -1;
			else if (s1.length()>s2.length())
				return 1;
			else
				return s1.toString().compareTo(s2.toString()); 
			
		} ;
		
		Set<StringBuffer> demoSet=new TreeSet<StringBuffer>(c2);
		List<StringBuffer> demoList=new ArrayList<StringBuffer>();

		demoSet.add(new StringBuffer("Vinithra"));
		demoList.add(new StringBuffer("Vinithra"));
		
		demoSet.add(new StringBuffer("Nagesh"));
		demoList.add(new StringBuffer("Nagesh"));
		
		
		demoSet.add(new StringBuffer("Deepak"));
		demoList.add(new StringBuffer("Deepak"));
		
		
		System.out.println(demoSet);
		System.out.println(demoList);
		
		for(StringBuffer i:demoSet)
		{
			System.out.println(i);
		}

		Iterator it=demoSet.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
		
		}
		
		
		ListIterator<StringBuffer> lit = demoList.listIterator();
		while(lit.hasNext())
		{
			
			System.out.println(lit.next());

		
		}
		
		System.out.println(demoSet);

	}
}
