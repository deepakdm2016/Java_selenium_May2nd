package Basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdownNew {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		WebElement element=driver.findElement(By.xpath("//div[@id='divpaxinfo']"));
		element.click();
		WebElement choice=driver.findElement(By.xpath("//span[@id='hrefIncAdt']"));
		
		for(int i=0;i<5;i++)
		{
			choice.click();
			System.out.println(driver.findElement(By.xpath("//span[@id='spanAudlt']")).getText());
		}
		driver.findElement(By.xpath("//input[@class='buttonN']")).click();;

	}

}
