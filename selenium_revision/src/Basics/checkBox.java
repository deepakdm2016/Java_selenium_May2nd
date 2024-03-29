package Basics;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class checkBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		WebElement checkBox=driver.findElement(By.xpath("//div[@id='discount-checkbox']"));
		List<WebElement> cbs = checkBox.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(cbs.size());
		
		for(int i=1;i<cbs.size();i++)
		{
			Thread.sleep(1000);
			cbs.get(i).click();
		
			String actual=driver.findElements(By.xpath("//div[@id='discount-checkbox']//label")).get(i-1).getAttribute("innerText");
			Assert.assertEquals(actual, "Family and Friends");
			System.out.println((driver.findElements(By.xpath("//div[@id='discount-checkbox']//label")).get(i-1).getAttribute("innerText")));
			System.out.println((driver.findElements(By.xpath("//span[@class='search-offer-tooltip mobile-tooltip-left']")).get(i-1).getAttribute("innerText")));
		}
	}

}
