package exceptionHandling;

public class customeException1 extends RuntimeException{
	
	int num;
	
	customeException1(int i)
	{
		this.num=i;
		System.out.println("Please enter first number greater than 10, entered number is "+i);
	}
	

}
