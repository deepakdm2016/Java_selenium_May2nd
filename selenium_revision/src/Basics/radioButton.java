package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class radioButton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.goindigo.in/");
		driver.findElement(By.xpath("//input[@id='roundTrip']")).click();
		driver.findElement(By.xpath("//input[@id='oneWayTrip']")).click();
		
		WebElement elements=driver.findElement(By.xpath("//div[@id='gp-cont']//button[@class='close']"));
		System.out.println(driver.findElement(By.xpath("//span[@id='gp-title']")).getAttribute("innerText"));
		System.out.println(driver.findElement(By.xpath("//span[@id='gp-msg']")).getAttribute("innerText"));
		driver.findElement(By.xpath("//div[@id='gp-cont']//button[@class='close']//i[@class='icon-close']")).click();
	
	}

}
