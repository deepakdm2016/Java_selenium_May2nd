package testNG_1;

import org.testng.annotations.Test;
import testNG_1.myListener;

public class TestA {
	
	@Test(priority=1, groups={"smoke"})
	public void testANG_1()
	{
		System.out.println("In testANG_1");
		System.out.println("Mother "+myListener.prop.get("Mother")+ "Father:"+myListener.prop.get("Father"));
		System.out.println(myListener.prop.get("Sister"));
		
		System.out.println("My name is:"+ myListener.prop.getProperty("name")+" emp id: "+myListener.prop.getProperty("empid") );

		System.out.println("I am starting the test");

	}

	@Test(priority=15)
	public void testA2NG_1()
	{
		System.out.println("In testA2NG_1");
	}
	
	@Test(priority=1)
	public void testA3NG_1()
	{
		System.out.println("In testA3NG_1");
	}
}
