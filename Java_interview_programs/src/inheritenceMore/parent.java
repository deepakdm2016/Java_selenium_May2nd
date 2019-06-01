package inheritenceMore;

public class parent {
	
	parent()
	{
		System.out.println("No arg constructor");
	}
	
	parent(int a, int b)
	{
		System.out.println("Arg constructor");

		System.out.println("Sum: "+ (a+b));
	}
	void f1()
	{
		System.out.println("inside parent");
	}

}
