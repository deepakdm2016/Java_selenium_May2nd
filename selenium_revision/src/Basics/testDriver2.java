package Basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testDriver2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://team-scale.com/testo/references/ajax/");
		
		WebElement pick=driver.findElement(By.xpath("//select[@id='manufacture']"));
		
		Select dropdown= new Select(pick);
		dropdown.selectByIndex(1);
		
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//select[@disabled='disabled']"), 1));
		

		String text =w.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath("//select[@id='model']"))).findElement(By.xpath("/html[1]/body[1]/select[2]/option[1]")).getText();
		 System.out.println(text);
		driver.findElement(By.cssSelector("#answer")).sendKeys(text);
		
		//driver.close();
		//driver.quit();
	}

}