package androidRevision;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class testBasics {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Resources.giveDriver();

		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementsByXPath("//android.widget.RelativeLayout").get(1).click();
		driver.findElementById("android:id/edit").sendKeys("DeepakDM");
		driver.findElementById("android:id/button1").click();
		
		
	}

}
