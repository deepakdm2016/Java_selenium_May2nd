package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println("Title: "+driver.getTitle());
		//System.out.println("Page Source: "+driver.getPageSource());
		System.out.println("Current URL: "+driver.getCurrentUrl());
		driver.navigate().to("http://www.yahoo.co.in");
		driver.navigate().back();
		System.out.println("Title: "+driver.getTitle());

		driver.navigate().forward();
		System.out.println("Title: "+driver.getTitle());

		driver.navigate().refresh();
		System.out.println("Title: "+driver.getTitle());

		driver.close();
		driver.quit();
	}

}
