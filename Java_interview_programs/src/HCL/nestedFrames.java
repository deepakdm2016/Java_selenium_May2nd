package HCL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class nestedFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.maths.surrey.ac.uk/explore/nigelspages/framenest.htm");
	
		Dimension d=new Dimension(0,0);
		driver.manage().window().setSize(d);
		
		
		Point p = new Point (700,700);
		driver.manage().window().setPosition(p);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frameset[2]//frame[2]")));
		String text = driver.findElement(By.xpath("//font[contains(text(),'Cascading Style Sheets')]")).getText();
		System.out.println(text);

		driver.switchTo().defaultContent();

		driver.switchTo().frame(driver.findElement(By.xpath("//frameset[2]//frame[3]")));

		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("DeepakDM");

	}

}
