package HCL;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.host.Document;

public class disabledText2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println(driver.findElement(By.id("u_0_o")).getAttribute("aria-label"));
		driver.findElement(By.id("u_0_j")).sendKeys("Deepak");
	    driver.findElement(By.name("lastname")).sendKeys("DM");
	    driver.findElement(By.name("reg_email__")).sendKeys("84521636866");
	    driver.findElement(By.name("reg_passwd__")).sendKeys("il9HNJ1234");
		Actions a=new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//input[@id='u_0_n']"))).build().perform();
		
		System.out.println(driver.findElement(By.xpath("//div[@class='mtm mbs _2_68']")).getText());
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("document.getElementById(\"u_0_s\").click()");


		Thread.sleep(5000);
	}

}
