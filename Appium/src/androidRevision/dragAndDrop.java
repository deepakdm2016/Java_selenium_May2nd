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

public class dragAndDrop {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		
		AndroidDriver<AndroidElement> driver = Resources.giveDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));");
		WebElement views = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
		views.click();

		driver.findElementByXPath("//*[@text='Drag and Drop']").click();
		TouchAction t=new TouchAction(driver);
		WebElement src=driver.
				findElementsByXPath("//android.view.View").get(0);
		WebElement destination=driver.
				findElementsByXPath("//android.view.View").get(2);
		
		t.longPress(longPressOptions().
				withElement(element(src))).moveTo(element(destination)).
		release().perform();
	}

}
