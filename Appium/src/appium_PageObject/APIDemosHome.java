package appium_PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.FindsByXPath;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class APIDemosHome {
	
	AndroidDriver driver;
	String preference="//android.widget.TextView[@text='Preference']";
	
	public APIDemosHome(AppiumDriver driver)
	{
		
		this.driver=(AndroidDriver) driver;
	}
	
	public WebElement getPreference()
	{
		return driver.findElementByXPath(preference);
	}
	
	}
