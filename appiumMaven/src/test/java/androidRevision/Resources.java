package androidRevision;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Resources {

	public static AndroidDriver<AndroidElement> giveDriver() throws MalformedURLException {
		
		//File apk=new File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\Appium\\src\\ApiDemos-debug.apk");
		
		File f=new File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\appiumMaven\\src\\main\\java\\");
		File fs=new File(f,"ApiDemos-debug.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_S_API_25");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
		
	}

	
public static AndroidDriver<AndroidElement> giveDriverReal() throws MalformedURLException {
		
		//File apk=new File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\Appium\\src\\ApiDemos-debug.apk");
		
		File f=new File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\appiumMaven\\src\\main\\java\\");
		File fs=new File(f,"ApiDemos-debug.apk");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,  "Android Device");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
		
	}
}
