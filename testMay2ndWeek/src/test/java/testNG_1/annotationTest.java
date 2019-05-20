package testNG_1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class annotationTest {
  @Test
  public void f() {
	  System.out.println("Method f test");
  }
  
  @Test
  public void f1() {
	  System.out.println("Method f1 test");
  }
  
  
  @Test
  public void f2() {
	  System.out.println("Method f2 test");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method f test");

  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Ater Method f test");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class execution");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class execution");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test execution");

  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  System.out.println("After Test execution");
	  Thread.sleep(5000);

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite execution");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite execution");

  }
  

}