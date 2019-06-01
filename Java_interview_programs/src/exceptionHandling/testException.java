package exceptionHandling;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import exceptionHandling.customeException1;
public class testException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);

		if(a<10)
			
		{
			throw new customeException1(a);
			
		}
		
		System.out.println(a/b);
		}
		catch(InputMismatchException | ArithmeticException | customeException1 e)
		{
			if(e.getClass().getName().contains("InputMismatchException"))
			System.out.println("Entered input is not a number");
		
			if(e.getClass().getName().contains("ArithmeticException"))
				System.out.println("Division by zero is not allowed");
			
			if(e.getClass().getName().contains("customeException1"))
				System.out.println("Custom exception");
		}
		
		finally
		{
			System.out.println("muttalla");
		}
	}

}
