package appium_PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class APIDemosPreference {
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	WebElement preferenceDependencies;
	
	
	APIDemosPreference(AppiumDriver driver)
	{
		PageFactory.initElements(driver, this);

//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public WebElement getPreferenceDependencies()
	{
		return preferenceDependencies;
	}
	
	}
