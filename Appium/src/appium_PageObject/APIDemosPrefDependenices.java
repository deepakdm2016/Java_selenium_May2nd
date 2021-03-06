package appium_PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class APIDemosPrefDependenices {
	

	@AndroidFindBy(id="android:id/checkbox")
	WebElement chkbox;
	
	@AndroidFindBy(xpath="//android.widget.RelativeLayout")
	WebElement relativeLayout;
	

	@AndroidFindBy(id="android:id/edit")
	WebElement editbox;


	@AndroidFindBy(id="android:id/button1")
	WebElement androidButton;
	
	
	APIDemosPrefDependenices(AppiumDriver driver)
	{
		//PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	
		PageFactory.initElements(driver, this);

	}
	
	public WebElement getCheckBox()
	{
		return chkbox;
	}
	
	public WebElement getRelativeLayout()
	{
		return relativeLayout;
	}
	
	public WebElement getEditBox()
	{
		return editbox;
	}
	
	public WebElement getandroidButton()
	{
		return androidButton;
	}
	


	}
