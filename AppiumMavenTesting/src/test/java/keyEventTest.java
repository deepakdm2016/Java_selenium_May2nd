import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class keyEventTest {
	public static AndroidDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {

		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium\" ");
		// Thread.sleep(10000);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		// File app=new
		// File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\AppiumMavenTesting\\app\\selendroid-test-app-0.17.0.apk");
		// capabilities.setCapability(MobileCapabilityType.APP,
		// app.getAbsolutePath());
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		capabilities.setCapability("appPackage", "io.selendroid.testapp");
		capabilities.setCapability("appActivity", "io.selendroid.testapp.HomeScreenActivity");
		// capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,
		// "io.selendroid.testapp.HomeScreenActivity");
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		driver.findElementById("io.selendroid.testapp:id/buttonStartWebview").click();
		Thread.sleep(2000);

		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		// driver.pressKey(new KeyEvent(AndroidKey.HOME));
		Thread.sleep(2000);
		// driver.longPressKey(new KeyEvent(AndroidKey.HOME));
		Thread.sleep(3000);
		driver.findElementById("io.selendroid.testapp:id/my_text_field").click();

		driver.pressKey(new KeyEvent(AndroidKey.A));
		driver.pressKey(new KeyEvent(AndroidKey.A));

		driver.pressKey(new KeyEvent(AndroidKey.P));
		driver.pressKey(new KeyEvent(AndroidKey.P));
		driver.pressKey(new KeyEvent(AndroidKey.I));
		driver.pressKey(new KeyEvent(AndroidKey.U));
		driver.pressKey(new KeyEvent(AndroidKey.M));

		Actions a = new Actions(driver);
		a.sendKeys(Keys.chord(Keys.CLEAR));
		a.sendKeys("Appium Testing").perform();
		driver.pressKey(new KeyEvent(AndroidKey.CAMERA));

		driver.toggleWifi();
		// driver.toggleAirplaneMode();

	}

}
