package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class calendar {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight ui-state-active ui-state-hover']")).click();
		
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']")).getAttribute("value"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		List<WebElement> dates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//a[@class='ui-state-default']"));
		dates.get(dates.size()-1).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_txt_Fromdate']")).getAttribute("value"));

		String opacity = driver.findElement(By.xpath("//div[@class='picker-second']")).getAttribute("style");
		
		Assert.assertEquals(opacity, "display: block; opacity: 0.5;");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-active']")).click();
		String opacitynew = driver.findElement(By.xpath("//div[@class='picker-second']")).getAttribute("style");
		Assert.assertEquals(opacitynew, "display: block; opacity: 1;");
	
	}

}
