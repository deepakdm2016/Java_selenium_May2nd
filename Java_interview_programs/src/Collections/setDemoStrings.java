package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class setDemoStrings {

	public static void main(String v[])
	{
		
		Set<Character> demoSet=new TreeSet<Character>();
		List<Character> demoList=new ArrayList<Character>();

		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			int nextInt = r.nextInt(26);
			Character c=new Character((char) (65+nextInt));
			demoSet.add(c);
			demoList.add(c);
		}
		
		System.out.println(demoSet);
		System.out.println(demoList);
		
		for(int i:demoSet)
		{
			System.out.println(i);
		}

		Iterator it=demoSet.iterator();
		while(it.hasNext())
		{
			
			System.out.println(it.next());
			it.remove();
		}
		System.out.println(demoSet);

	}
}
