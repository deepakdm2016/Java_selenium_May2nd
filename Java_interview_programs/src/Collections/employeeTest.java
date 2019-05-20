package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class employeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee a=new Employee(389524,"Deepak");
		Employee b=new Employee(326112,"Vinithra");
		Employee c=new Employee(394027,"Nagesh");
		
		Comparator<Employee> c2=(e1,e2)->{
			return e1.name.compareTo(e2.name);};
		
		Set<Employee> li=new TreeSet<Employee>(c2);
		li.add(a);
		li.add(b);
		li.add(c);

		for(Employee e:li)
		{
			System.out.println("Name:" + e.name +"EmpId: "+ e.getId());
		}
		
		
	}

}
