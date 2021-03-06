package herokuApp;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sampleTests {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/droppable/");
		Actions action = new Actions(driver);

		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		Actions a=new Actions(driver);
		
		a.moveToElement(driver.findElement(By.cssSelector("#draggable"))).build().perform();
		WebElement src=driver.findElement(By.cssSelector("#draggable"));
		WebElement destn=driver.findElement(By.cssSelector("#droppable"));
		
		//a.dragAndDrop(src, destn).build().perform();
		Thread.sleep(2000);
		a.clickAndHold(src).moveToElement(destn).release().build().perform();
		System.out.println("done");

	
		/*driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));

		WebElement sourceLocator = driver.findElement(By.cssSelector("#draggable"));
		                //To get target locator
		 WebElement targetLocator = driver.findElement(By.cssSelector("#droppable"));
		                //dragAndDrop(source, target) method accepts two parameters source and locator. 
		                //used dragAndDrop method to drag and drop the source locator to target locator
		 action.dragAndDrop(sourceLocator, targetLocator).build().perform();
		  */ 
	}

}
