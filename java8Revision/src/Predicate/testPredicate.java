package Predicate;

import java.util.function.Predicate;

public class testPredicate {
	
	public static void main(String v[])
	{
	
	Predicate<Integer> p=i->(i>20);
	p.test(13);
	p.test(78);
	p.test(34);
		
	}

}
