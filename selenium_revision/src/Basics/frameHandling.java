package Basics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frameHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://gmail.com/");
		driver.findElement(By.linkText("Terms")).click();
		String original = null;
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		while(iterator.hasNext())
		{
			
			String next = iterator.next();
			WebDriver window = driver.switchTo().window(next);
			if(driver.getTitle().equals("Gmail"))
			{
				original=next;
			}
			try{
			Thread.sleep(3000);
			if(driver.findElement(By.partialLinkText("Terms of Service"))!=null)
			{
				System.out.println("Inside if condition");
				System.out.println("Element found in window: "+driver.getTitle()+"::"+driver.getCurrentUrl());
				break;
			}
			}
			catch(NoSuchElementException e)
			{
				System.out.println("element not found in current window");
			}
		}
		
		driver.switchTo().window(original);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
	}

}
