package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parentChild {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='RNNXgb']/div/div/input")).sendKeys("Hello");
		//driver.findElement(By.cssSelector("div[class='RNNXgb']>input[name='q']")).sendKeys("Hola");;

	}

}
