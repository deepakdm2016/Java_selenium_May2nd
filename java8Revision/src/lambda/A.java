package lambda;

@FunctionalInterface
public interface A {

	public void myMethod();
	
	public default void myImplementedMethod()
	{
		System.out.println("In default method myImplementedMethod");
	}

	
}
