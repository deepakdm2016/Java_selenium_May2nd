import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class nativaAppTest {
	public static AndroidDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium\" ");
		Thread.sleep(10000);
		DesiredCapabilities capabilities=new DesiredCapabilities();
		File app=new File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\AppiumMavenTesting\\app\\selendroid-test-app-0.17.0.apk");
		//capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		
		
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	}

}
