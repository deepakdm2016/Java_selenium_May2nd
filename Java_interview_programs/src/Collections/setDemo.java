package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class setDemo {

	public static void main(String v[])
	{
		
		Set<Integer> demoSet=new TreeSet<Integer>();
		List<Integer> demoList=new ArrayList<Integer>();

		Random r=new Random();
		for(int i=0;i<10;i++)
		{
			demoSet.add(r.nextInt(5));
			demoList.add(r.nextInt(5));
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
