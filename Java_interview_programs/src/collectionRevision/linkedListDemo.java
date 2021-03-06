package collectionRevision;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class linkedListDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		long currentTimeMillis = System.currentTimeMillis();
		List<Integer> intList=new LinkedList<>();
		
		for(int i=1;i<=10;i++)
		{
			intList.add(7*i);
		}
		
		intList.set(3, 66);
		System.out.println(intList);
		intList.stream().filter(i-> i>40).collect(Collectors.toList()).forEach(i->System.out.println(i));
	
	
	List<Integer> intList2=new ArrayList<>();
			
		for(int i=1;i<=10;i++)
		{
			intList.add(8*i);
		}
		
	
		intList.addAll(intList2);
		System.out.println("Size is: "+intList.size());
		intList.stream().filter(i-> i>40).collect(Collectors.toList()).forEach(i->System.out.println(i));
	
		intList.stream().filter(i-> i>60).collect(Collectors.toList()).forEach(i->intList.remove(i));
		System.out.println("Size is: "+intList.size());
		System.out.println("Size is: "+intList);

		long currentTimeMillis1 = System.currentTimeMillis();
		Thread.sleep(3000);
		System.out.println(currentTimeMillis1-currentTimeMillis);
	
	}

}
