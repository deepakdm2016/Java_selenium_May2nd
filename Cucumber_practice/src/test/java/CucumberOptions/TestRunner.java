package CucumberOptions;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features1",
					glue="stepDefination1")

public class TestRunner extends AbstractTestNGCucumberTests {
	
	
	@BeforeMethod
	public void beforeMethodTest()
	{
		System.out.println("Before Method");
	}

	@AfterMethod
	public void AfterMethodTest()
	{
		System.out.println("After Method");
	}
	

}
