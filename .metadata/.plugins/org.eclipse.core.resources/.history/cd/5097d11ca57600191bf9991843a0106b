package testNG_3;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestA {
	
	@Parameters({"EmplId"})
	@Test(priority=1, groups={"smoke"}, enabled=true)
	public void testANG_3(String empid)
	{
		System.out.println(empid);
		System.out.println("In testANG_3");
	}

	
	@Test(priority=2,groups={"smoke"},dependsOnMethods={"testANG_3"},enabled=true, dataProvider="dataFeed")
	public void testA2NG_3(int a, int b)
	{
		System.out.println("In testA2NG_3");
		System.out.println("A "+a);
		System.out.println("B "+b);
		System.out.println("A+B "+(a+b));


	}
	
	@Test(priority=1)
	public void testA3NG_3()
	{
		System.out.println("In testA3NG_1");
	}
	
	
	@DataProvider
	public Object[][] dataFeed()
	{
		
	
		
		Object[][] a={{1,2},{3,4},{4,5},{6,7}};
		
		return a;
		
	}
}
