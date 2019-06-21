package com.Deepak.testNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@Parameters({"Vinithra"})
	@Test(dependsOnMethods={"testngDemoSecondDay3"})
	public void testngDemoDay3(String empId)
	{
		System.out.println("Employee ID of Vinithra is "+ empId);
		System.out.println("First testng program day3");
	}

	
	@Test(dataProvider="testData",priority=1)
	public void testngDemoSecondDay3(String n1, String n2)
	{

		System.out.println("parameter1 "+n1);
		System.out.println("parameter2 "+n2);

		System.out.println("Second testng program day3");
		
	}
	
	
	@DataProvider
	public Object[][] testData()
	{
		Object[][] obj=new Object[2][2];
		
		for(int i=0;i<2;i++)
			for(int j=0;j<2;j++)
			obj[i][j]="obj "+i+j;
		return obj;
		
		
	}
}
