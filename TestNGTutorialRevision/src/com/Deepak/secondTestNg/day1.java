package com.Deepak.secondTestNg;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.*;

public class day1 {
	
	@Test(groups="smoke",priority=2)
	public void testngDemo()
	{
		System.out.println("First testng program");
	}

	
	@Test(priority=1)
	public void testngDemoSecond()
	{
		System.out.println("Second testng program");
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite demo method");
	}
	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite demo method");
	}
	
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After test demo method");
	}
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before test demo method");
	}

	
}
