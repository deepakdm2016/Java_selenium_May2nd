package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class autoSuggestionDropdown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		WebElement e=driver.findElement(By.xpath("//input[@id='fromCity']"));
		e.click();
		
		WebElement from=driver.findElement(By.xpath("//input[@placeholder='From']"));
		
		from.sendKeys("m");
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ARROW_DOWN);
		from.sendKeys(Keys.ENTER);
	
		WebElement to=driver.findElement(By.xpath("//input[@placeholder='To']"));
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ARROW_DOWN);
		to.sendKeys(Keys.ENTER);
	
	}

}
