package appium_PageObject;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import androidRevision.Resources;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class testBasics {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Resources.giveDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Thread.sleep(5000);
		APIDemosHome apd=new APIDemosHome(driver);
		APIDemosPrefDependenices apdPrefDepend=new APIDemosPrefDependenices(driver);
		APIDemosPreference apdPref=new APIDemosPreference(driver);
		
		apd.getPreference().click();
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();

		apdPref.getPreferenceDependencies().click();
		apdPrefDepend.getCheckBox().click();
		apdPrefDepend.getRelativeLayout().click();
		apdPrefDepend.getEditBox().sendKeys("DeepakDM");
		apdPrefDepend.getandroidButton().click();
		
		
	}

}
