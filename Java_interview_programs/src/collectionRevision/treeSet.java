package collectionRevision;

import java.util.Comparator;
import java.util.TreeSet;

public class treeSet {

	public static void main(String v[])
	{
		
		Comparator<Employee> c=(Employee e1, Employee e2) -> {
			
			if(e1.id>e2.id)
				return 1;
			else 
				return -1;
			
		};
		
		TreeSet<Employee> empTree=new TreeSet<>(c);
		Employee e2=new Employee(326112, "Vinithra");
		Employee e1=new Employee(389524, "Deepak");
		Employee e3=new Employee(394027, "Pavithraa");
		Employee e4=new Employee(201989, "Nageshaaaaa");
		empTree.add(e1);
		empTree.add(e2);
		empTree.add(e3);
		empTree.add(e4);

		System.out.println(empTree);
	}
}