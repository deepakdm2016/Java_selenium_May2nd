package testNG_2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class TestA {
	
	public static Logger log=LogManager.getLogger(TestA.class.getName());

	@Test(priority=3, groups={"smoke"})
	public void testANG_2()
	{
		log.info("In testANG_2");
	}

}
