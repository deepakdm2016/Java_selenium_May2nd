package herokuApp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class toolTipJquery {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/tooltip.html");
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.cssSelector("#download_now"))).build().perform();
		System.out.println("Without going to element:"+driver.findElement(By.xpath("//div[@class='tooltip']/a")).getText());
		
		
		
	}

}
