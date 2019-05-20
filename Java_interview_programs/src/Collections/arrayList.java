package Collections;

import java.util.ArrayList;
import java.util.List;

public class arrayList {

	public static void main(String v[])
	{
		List<Integer> t=new ArrayList<Integer>(100);
		
		for (int i=0;i<101;i++)
		{
			t.add(i);
			
		}
		
		
		for (int i=0;i<101;i=i+2)
		{
			System.out.print(t.get(i)+" ");
			
		}
		
		for (int i=0;i<101;i=i+2)
		{
			t.set(i, i*i);
			
		}
		
		List<Integer> li=new ArrayList<Integer>();
		
		for (int i=0;i<10;i=i+1)
		{
				li.add(50-i);			
		}
		
		System.out.println();

		t.addAll(3,li);
		System.out.println(t);
		
		System.out.println(t.contains(2500));
		t.remove(110);
		
		for(int i:t)
		{
			System.out.println(i);
		}
	}
}
