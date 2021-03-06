package realDeviceSimulator;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import androidRevision.*;

public class realDeviceSimulator {
	AndroidDriver<AndroidElement> driver;

	@Test
	public void mobileBrowser() throws MalformedURLException {

		driver = baseChrome.capabilitiesRealDevice();
		driver.get("http://facebook.com");
		driver.findElementByXPath("//*[@id='u_0_1']/div[1]/div/input").sendKeys("qwerty");
		driver.findElementByName("pass").sendKeys("12345");
		driver.findElementByXPath("//button[@value='Log In']").click();

	}

	@Test
	public void cricBuzz() throws MalformedURLException {

		driver = baseChrome.capabilitiesRealDevice();
		driver.get("https://www.cricbuzz.com/");
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//a[@href='#menu']").click();
		driver.findElementByXPath("//a[contains(text(),'Home')]").click();
		System.out.println(driver.getCurrentUrl());

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400);");

		List<AndroidElement> headers = driver
				.findElements(By.xpath("//h4[@class='cb-list-item ui-header ui-branding-header']"));
		for (int i = 1; i < headers.size(); i++) {
			System.out.println(driver.findElements(By.xpath("//h4[@class='cb-list-item ui-header ui-branding-header']"))
					.get(i).getText());
		}

	}

	@Test
	public void faceBook() throws MalformedURLException {

		driver = baseChrome.capabilitiesRealDevice();
		driver.get("http://facebook.com");
		driver.findElement(By.id("m_login_email")).sendKeys("dipud_m@yahoo.co.in");
		driver.findElement(By.id("m_login_password")).sendKeys("389524");
		driver.findElement(By.xpath("//button[@value='Log In']")).click();

	}

	@Test(dataProvider = "getDrivers")
	public void testClock(AndroidDriver<AndroidElement> driverFromProvider, String device) throws MalformedURLException {
		driverFromProvider.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driverFromProvider.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		WebElement views = driverFromProvider.findElementByXPath("//android.widget.TextView[@text='Views']");
		views.click();

		// gesture handling by touch actions
		TouchAction t = new TouchAction(driverFromProvider);
		WebElement xpandableList = driverFromProvider.findElementByXPath("//android.widget.TextView[@text='Date Widgets']");
		TapOptions tapOptions = tapOptions().withElement(element(xpandableList));
		t.tap(tapOptions).perform();

		xpandableList = driverFromProvider.findElementByXPath("//android.widget.TextView[@text='2. Inline']");
		tapOptions = tapOptions().withElement(element(xpandableList));
		t.tap(tapOptions).perform();

		xpandableList = driverFromProvider.findElementByXPath("//*[@content-desc='9']");
		tapOptions = tapOptions().withElement(element(xpandableList));
		t.tap(tapOptions).perform();

		// long press on element and move to other element, then release
		WebElement from = driverFromProvider.findElementByXPath("//*[@content-desc='15']");
		WebElement to = driverFromProvider.findElementByXPath("//*[@content-desc='45']");
		t.longPress(longPressOptions().withElement(element(from)).withDuration(ofSeconds(2))).moveTo(element(to))
				.release().perform();
	}

	@Test(dataProvider = "getDrivers")
	public void testDragAndDrop(AndroidDriver<AndroidElement> driverFromProvider, String device) throws MalformedURLException {

		driverFromProvider.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driverFromProvider.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		WebElement views = driverFromProvider.findElementByXPath("//android.widget.TextView[@text='Views']");
		views.click();

		driverFromProvider.findElementByXPath("//*[@text='Drag and Drop']").click();
		TouchAction t = new TouchAction(driverFromProvider);
		WebElement src = driverFromProvider.findElementsByXPath("//android.view.View").get(0);
		WebElement destination = driverFromProvider.findElementsByXPath("//android.view.View").get(2);

		t.longPress(longPressOptions().withElement(element(src))).moveTo(element(destination)).release().perform();

	}

	@Test(dataProvider = "getDrivers")
	public void longPress(AndroidDriver<AndroidElement> driverFromProvider, String device) throws MalformedURLException {

		driverFromProvider.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driverFromProvider
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		WebElement views = driverFromProvider.findElementByXPath("//android.widget.TextView[@text='Views']");
		views.click();

		// gesture handling by touch actions
		TouchAction t = new TouchAction(driverFromProvider);
		WebElement xpandableList = driverFromProvider
				.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		TapOptions tapOptions = tapOptions().withElement(element(xpandableList));
		t.tap(tapOptions).perform();

		xpandableList = driverFromProvider.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
		tapOptions = tapOptions().withElement(element(xpandableList));
		t.tap(tapOptions).perform();

		xpandableList = driverFromProvider.findElementByXPath("//android.widget.TextView[@text='People Names']");
		t.longPress(longPressOptions().withElement(element(xpandableList)).withDuration(ofSeconds(2))).release()
				.perform();

		System.out.println(driverFromProvider.findElementByXPath("//android.widget.TextView").getText());

	}

	@Test(dataProvider = "getDrivers")
	public void basicTest(AndroidDriver<AndroidElement> driverFromProvider, String device) throws MalformedURLException {
		driverFromProvider.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driverFromProvider.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driverFromProvider.findElementById("android:id/checkbox").click();
		driverFromProvider.findElementsByXPath("//android.widget.RelativeLayout").get(1).click();
		driverFromProvider.findElementById("android:id/edit").sendKeys("DeepakDM");
		driverFromProvider.findElementById("android:id/button1").click();

	}

	@Test(dataProvider = "getDrivers")
	public void swipeTest(AndroidDriver<AndroidElement> driverFromProvider, String device) throws MalformedURLException {

		driverFromProvider.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driverFromProvider
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		WebElement views = driverFromProvider.findElementByXPath("//android.widget.TextView[@text='Views']");
		views.click();

		// gesture handling by touch actions
		driverFromProvider.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		WebElement webView = driverFromProvider.findElementByXPath("//android.widget.TextView[@text='WebView']");
		webView.click();

	}

	@DataProvider
	public Object[][] getDrivers() throws MalformedURLException {
		Object[][] drivers = new Object[1][1];

		
		File f = new File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\appiumMaven\\src\\main\\java\\");
		File fs = new File(f, "ApiDemos-debug.apk");
		
		/*
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_S_API_25");
		cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		drivers[0][0] = driver;
		drivers[0][1] = "SImulator";*/

		/////////////////////////////////////////////////
		DesiredCapabilities cap1 = new DesiredCapabilities();
		cap1.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap1.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

		AndroidDriver<AndroidElement> driver1 = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap1);
		drivers[0][0] = driver1;
		drivers[1][1] = "Real Device";

		return drivers;

	}

}
