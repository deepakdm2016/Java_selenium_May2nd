package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testLocatorsClassName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://login.salesforce.com/");
		try {
			driver.findElement(By.className("input r4 wide mb16 mt8 username")).sendKeys("deepakdm");
		} catch (Exception e) {
			System.out.println("compound class xpath selection is not allowed");
		}
		
		driver.findElement(By.id("username")).sendKeys(Keys.chord(Keys.CONTROL,Keys.F5));
		driver.findElement(By.id("password")).sendKeys("deepak");
		driver.findElement(By.id("username")).sendKeys("deepak");
		driver.findElement(By.xpath("//*[@name='Login']")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id='error']")).getText());
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("deepak");
		driver.findElement(By.cssSelector("input.input.r4.wide.mb16.mt8.password")).sendKeys("deepak");
		driver.findElement(By.xpath("//*[@name='Login']")).click();
		
	}

}
