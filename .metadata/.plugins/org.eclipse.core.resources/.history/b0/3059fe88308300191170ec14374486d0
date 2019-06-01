package testNG_3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestA {
	
	public static Logger log=LogManager.getLogger(TestA.class.getName());

	
	@Parameters({"EmplId"})
	@Test(priority=1, groups={"smoke"}, enabled=true)
	public void testANG_3(String empid)
	{
		log.info(empid);
		log.info("In testANG_3");
	}

	
	@Test(priority=2,groups={"smoke"},dependsOnMethods={"testANG_3"},enabled=true, dataProvider="dataFeed")
	public void testA2NG_3(int a, int b)
	{
		log.info("In testA2NG_3");
		log.info("A "+a);
		log.info("B "+b);
		log.info("A+B "+(a+b));


	}
	
	@Test(priority=1)
	public void testA3NG_3()
	{
		log.info("In testA3NG_1");
	}
	
	
	@DataProvider
	public Object[][] dataFeed()
	{
		
	
		
		Object[][] a={{1,2},{3,4},{4,5},{6,7}};
		
		return a;
		
	}
}
