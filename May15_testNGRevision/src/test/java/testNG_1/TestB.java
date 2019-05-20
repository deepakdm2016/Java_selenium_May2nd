package testNG_1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class TestB {
	
	public static Logger log=LogManager.getLogger(TestB.class.getName());

	@Test(priority=2)
	public void testBNG_1()
	{
		log.info("In testBNG_1");
	}

}
