package com.Deepak.secondTestNg;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Parameters({"vinithra"})
	@Test(priority=2)
	public void testngDemoDay3(String empId)
	{
		System.out.println("Employee ID of Vinithra is"+ empId);
		System.out.println("First testng program day3");
	}

	
	@Test(priority=1)
	public void testngDemoSecondDay3()
	{
		System.out.println("Second testng program day3");
	}
}
