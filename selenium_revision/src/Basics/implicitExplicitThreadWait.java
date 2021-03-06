package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitExplicitThreadWait {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/hotels/");
		//driver.findElement(By.xpath("//input[@id='city']")).sendKeys(Keys.chord("mysor",Keys.ARROW_DOWN,Keys.ENTER));
		//driver.findElement(By.cssSelector("#hsw_search_button")).click();
		Thread.sleep(15000);
		WebDriverWait w=new WebDriverWait(driver, 10);
	//	WebDriver frame = driver.switchTo().frame("notification-frame-~10cb56657");
		
		
		
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("notification-frame-~10cb56657"));
		driver.findElement(By.cssSelector("a#webklipper-publisher-widget-container-notification-close-div")).click();
		//Thread.sleep(2000);
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("webpush-bubble"));
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("#deny")));
		driver.findElement(By.cssSelector("#deny")).click();
		
		driver.switchTo().defaultContent();
		
	}


}
