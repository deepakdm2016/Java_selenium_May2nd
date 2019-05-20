package testNG_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annotationTest {
	
	public static Logger log=LogManager.getLogger(annotationTest.class.getName());
	
  @Test
  public void f() {
	  log.info("Method f test");
  }
  
  @Test
  public void f1() {
	  log.info("Method f1 test");
  }
  
  
  @Test
  public void f2() {
	  log.info("Method f2 test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  log.info("Before Method f test");

  }

  @AfterMethod
  public void afterMethod() {
	  log.info("Ater Method f test");

  }

  @BeforeClass
  public void beforeClass() {
	  log.info("Before class execution");

  }

  @AfterClass
  public void afterClass() {
	  log.info("After class execution");

  }

  @BeforeTest
  public void beforeTest() {
	  log.info("Before Test execution");

  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  log.info("After Test execution");
	  Thread.sleep(5000);

  }

  @BeforeSuite
  public void beforeSuite() {
	  log.info("Before suite execution");

  }

  @AfterSuite
  public void afterSuite() {
	  log.info("After Suite execution");

  }
  

}
