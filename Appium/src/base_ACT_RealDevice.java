import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class base_ACT_RealDevice {
	public static  AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
	{
		

	AndroidDriver<AndroidElement>  driver;

		// TODO Auto-generated method stub
	
	
	 File appDir = new File("src");
     File app = new File(appDir, "ApiDemos-debug.apk");
     DesiredCapabilities capabilities = new DesiredCapabilities();
     
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
    // capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
     capabilities.setCapability("appPackage", "com.android.dialer");
     capabilities.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
     driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	    
	    return driver;
	}
	
	public static void main(String v[]) throws MalformedURLException, InterruptedException{
		
		AndroidDriver<AndroidElement>  driver=	capabilities();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='android.widget.ImageButton']")).click();
		driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("6363767006");
		driver.findElement(By.xpath("//*[@resource-id='com.android.dialer:id/dialpad_floating_action_button']")).click();

		System.out.println("Done");
	}


}
