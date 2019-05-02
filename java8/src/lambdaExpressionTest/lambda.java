package lambdaExpressionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li=Arrays.asList(1,2,3,6,7,9);
		int sum=li.stream().filter(lambda::isOdd).reduce(0, Integer::sum);
		System.out.println(sum);
		
	}
	
	static boolean isOdd(int number)
	{
		return number%2!=0;
		
	}
}
