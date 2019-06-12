package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://team-scale.com/testo/references/inventory/");
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='title']"));
		
		for(int i=0;i<findElements.size();i++)
		{
			WebElement webElement = driver.findElements(By.xpath("//span[@class='title']")).get(i);
		String value=(webElement.getText());
		String value1=webElement.findElements(By.xpath("//span[@class='price']")).get(i).getText();
	//	System.out.println(value1);

		
		int price = Integer.parseInt(value1);
		if(price<50)
		{
			System.out.println(value);
			driver.findElement(By.cssSelector("#answer")).sendKeys(value);
			driver.findElement(By.cssSelector("#answer")).sendKeys("   ");

		}
		}
		driver.close();
		driver.quit();
	}

}
