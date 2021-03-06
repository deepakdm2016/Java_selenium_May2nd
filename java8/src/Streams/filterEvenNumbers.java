package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class filterEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l1=new ArrayList<Integer>();
		
		for(int i=10;i>=1;i--)
			l1.add(i);
		
		System.out.println(l1);
		
/*
		List<Integer> l2=new ArrayList<Integer>();

		for(Integer i:l1)
		{
			if (i%2==0)
				l2.add(i);
		}
		
		System.out.println(l2);
		*/
		List<Integer> l2 = l1.stream().filter(i->i%2==0).collect(Collectors.toList());
		long count = l1.stream().filter(i->i%2==0).count();
		System.out.println(l2);
		System.out.println("Number of even number ="+ count);
		List<Integer> l3 = l1.stream().sorted().collect(Collectors.toList());
		System.out.println(l3);

		
		Comparator<Integer> comp=(i1,i2) -> i2.compareTo(i1);
		List<Integer> l4 = l1.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(l4);
		
		Integer max = l1.stream().max(comp).get();
		Integer min = l1.stream().max(comp).get();
		
		System.out.println("Max is "+ max );
		System.out.println("Min is "+ min );
		
		l4.stream().forEach(i -> System.out.println(i));


	}

}
