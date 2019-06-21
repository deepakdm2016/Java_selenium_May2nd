import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestWebBrowser {

	public static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		driver.findElementByXPath("//input[@name='q']").sendKeys("Deepak");
		driver.findElementByXPath("//button[@aria-label='Google Search']").click();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.quit();
		
	}

}
