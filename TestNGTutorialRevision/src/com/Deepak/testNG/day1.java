package com.Deepak.testNG;
import org.testng.annotations.Test;

public class day1 {
	
	@Test(groups={"smoke"},priority=2)
	public void testngDemo()
	{
		System.out.println("First testng program");
	}

	
	@Test(priority=1)
	public void testngDemoSecond()
	{
		System.out.println("Second testng program");
	}
}
