package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class textXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/interview.php");
		driver.findElement(By.xpath("//li[@id='tablist1-tab2']/following-sibling::li")).click();		
		driver.findElement(By.xpath("//li[@id='tablist1-tab2']/following-sibling::li[2]")).click();	
		driver.findElement(By.xpath("//li[@id='tablist1-tab2']/parent::ul"));		
		driver.findElement(By.xpath("//*[text()=' Selenium ']")).click();
		driver.findElement(By.xpath("//*[contains(text(),'ppium')]")).click();

	}

}