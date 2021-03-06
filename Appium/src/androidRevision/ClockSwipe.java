package androidRevision;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;

public class ClockSwipe {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		AndroidDriver<AndroidElement> driver = baseChrome.capabilities();
		
		driver.rotate(ScreenOrientation.LANDSCAPE);
		driver.rotate(ScreenOrientation.PORTRAIT);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator
		("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
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
		
		xpandableList=driver.findElementByXPath("//*[@content-desc='9']");
		tapOptions = tapOptions().withElement(element(xpandableList));
		t.tap(tapOptions).perform();
		
		//long press on element and move to other element, then release
		WebElement from=driver.findElementByXPath("//*[@content-desc='15']");
		WebElement to=driver.findElementByXPath("//*[@content-desc='45']");
		t.longPress(longPressOptions().withElement(element(from)).
				withDuration(ofSeconds(2))).moveTo(element(to)).release().perform();
	
		try {
			Runtime.getRuntime().exec("taskkill /F/IM cmd.exe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
