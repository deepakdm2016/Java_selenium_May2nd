package java8Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class testStream {

	public static void main(String[] args) {

		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<100;i++)
			li.add(i);
		System.out.println(li);

		
		List<Integer> collect = li.stream().filter(i->i%2==0).
				collect(Collectors.toList());
		System.out.println(collect);
		
		
		long count = li.stream().filter(i->i%2==0).count();
		List<Integer> collect2 = li.stream().sorted().collect(Collectors.toList());
		
		Comparator<Integer> c=(i1,i2)->i2.compareTo(i1);
		List<Integer> collect3 = li.stream().sorted(c).collect(Collectors.toList());
		
		System.out.println(collect3);
		
		int max = li.stream().max(c).get();
		li.stream().min(c).get();
		
		
		li.stream().sorted().collect(Collectors.toList()).forEach(i->System.out.println(i));
		
		
	}

}
