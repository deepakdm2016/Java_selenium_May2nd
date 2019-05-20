package testNG_1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import testNG_1.myListener;
import testNG_3.TestB;

public class TestA {
	public static Logger log=LogManager.getLogger(TestA.class.getName());

	
	@Test(priority=1, groups={"smoke"})
	public void testANG_1()
	{
		log.info("In testANG_1");
		log.info("Mother "+myListener.prop.get("Mother")+ "Father:"+myListener.prop.get("Father"));
		log.info(myListener.prop.get("Sister"));
		
		log.info("My name is:"+ myListener.prop.getProperty("name")+" emp id: "+myListener.prop.getProperty("empid") );

		log.info("I am starting the test");

	}

	@Test(priority=15)
	public void testA2NG_1()
	{
		log.info("In testA2NG_1");
	}
	
	@Test(priority=1)
	public void testA3NG_1()
	{
		log.info("In testA3NG_1");
	}
}
