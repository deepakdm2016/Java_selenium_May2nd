package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\Automation\\src\\test\\java\\features\\login.feature", glue="stepDefinations")
public class TestRunner {
	
	

}
