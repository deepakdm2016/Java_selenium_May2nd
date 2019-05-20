package testNG_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import testNG_3.TestB;

public class myListener implements ITestListener{
	
	
	public static Logger log=LogManager.getLogger(myListener.class.getName());

	
	public static Properties prop=new Properties();
	

	
	public void onTestStart(ITestResult result) {
		
		File f=new File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\testNG_may_2ndWeek\\src\\resources\\data.properties");
		FileInputStream fis = null;
		try {
			 fis=new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		log.info("Mother "+prop.get("Mother")+ "Father:"+prop.get("Father"));
		log.info(prop.get("Sister"));
		
		log.info("My name is:"+ prop.getProperty("name")+" emp id: "+prop.getProperty("empid") );

		log.info("I am starting the test");
	}

	
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		log.info("I am success with the test");

		
	}

	
	public void onTestFailure(ITestResult result) {
		log.info("I am failed with the test");
		
	}

	
	public void onTestSkipped(ITestResult result) {
		log.info("I am skipped with the test");
		
	}

	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		log.info("I am failed with % with the test");
		
	}

	
	public void onStart(ITestContext context) {
		log.info("I am on start with the test");
		
	}

	
	public void onFinish(ITestContext context) {
		log.info("I am on finish with the test");
		
	}

}
