package androidRevision;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;

import org.openqa.selenium.By;
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

public class longPress {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		AndroidDriver<AndroidElement> driver = Resources.giveDriver();
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
		t.longPress(longPressOptions().withElement(element(xpandableList)).withDuration(ofSeconds(2))).release().perform();

		System.out.println(driver.findElementByXPath("//android.widget.TextView").getText());
	}

}
