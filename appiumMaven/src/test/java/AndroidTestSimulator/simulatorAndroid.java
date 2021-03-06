package AndroidTestSimulator;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import androidRevision.Resources;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;

public class simulatorAndroid {

	AndroidDriver<AndroidElement> driver;

	@Test
	public void testClock() throws MalformedURLException {
		driver = Resources.giveDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		WebElement views = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		views.click();

		// gesture handling by touch actions
		TouchAction t = new TouchAction(driver);
		WebElement xpandableList = driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']");
		TapOptions tapOptions = tapOptions().withElement(element(xpandableList));
		t.tap(tapOptions).perform();

		xpandableList = driver.findElementByXPath("//android.widget.TextView[@text='2. Inline']");
		tapOptions = tapOptions().withElement(element(xpandableList));
		t.tap(tapOptions).perform();

		xpandableList = driver.findElementByXPath("//*[@content-desc='9']");
		tapOptions = tapOptions().withElement(element(xpandableList));
		t.tap(tapOptions).perform();

		// long press on element and move to other element, then release
		WebElement from = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement to = driver.findElementByXPath("//*[@content-desc='45']");
		t.longPress(longPressOptions().withElement(element(from)).withDuration(ofSeconds(2))).moveTo(element(to))
				.release().perform();
	}

	@Test
	public void testDragAndDrop() throws MalformedURLException {

		driver = Resources.giveDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		WebElement views = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		views.click();

		driver.findElementByXPath("//*[@text='Drag and Drop']").click();
		TouchAction t = new TouchAction(driver);
		WebElement src = driver.findElementsByXPath("//android.view.View").get(0);
		WebElement destination = driver.findElementsByXPath("//android.view.View").get(2);

		t.longPress(longPressOptions().withElement(element(src))).moveTo(element(destination)).release().perform();

	}

	@Test
	public void longPress() throws MalformedURLException {

		driver = Resources.giveDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		WebElement views = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		views.click();

		// gesture handling by touch actions
		TouchAction t = new TouchAction(driver);
		WebElement xpandableList = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		TapOptions tapOptions = tapOptions().withElement(element(xpandableList));
		t.tap(tapOptions).perform();

		xpandableList = driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
		tapOptions = tapOptions().withElement(element(xpandableList));
		t.tap(tapOptions).perform();

		xpandableList = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		t.longPress(longPressOptions().withElement(element(xpandableList)).withDuration(ofSeconds(2))).release()
				.perform();

		System.out.println(driver.findElementByXPath("//android.widget.TextView").getText());

	}

	@Test
	public void basicTest() throws MalformedURLException {
		driver = Resources.giveDriver();
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElementByXPath("//android.widget.TextView[@text='3. Preference dependencies']").click();
		driver.findElementById("android:id/checkbox").click();
		driver.findElementsByXPath("//android.widget.RelativeLayout").get(1).click();
		driver.findElementById("android:id/edit").sendKeys("DeepakDM");
		driver.findElementById("android:id/button1").click();

	}

	@Test
	public void swipeTest() throws MalformedURLException {

		driver = Resources.giveDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		WebElement views = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		views.click();
		// gesture handling by touch actions
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		WebElement webView = driver.findElementByXPath("//android.widget.TextView[@text='WebView']");
		webView.click();

	}
}
