package HCL;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	String nextInt = scan.nextLine();
	
	int input=Integer.parseInt(nextInt);
	
	int pow=nextInt.length()-1;
	int result=0;
	int temp=0;
	while(input>0)
	{
		temp=input%10;
	
		result= (int) (result+ temp*Math.pow(10, pow));
		input=input/10;
		pow--;
	}
	
	
	
	System.out.println(result);
	}

}
