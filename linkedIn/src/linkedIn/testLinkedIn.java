package linkedIn;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testLinkedIn {

	public static void main(String v[])
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/in/deepak-dm-850376143/");
		driver.findElement(By.xpath("//a[@class='form-toggle']")).click();
		driver.findElement(By.cssSelector("input#login-email")).sendKeys("deepakdm2016@gmail.com");
		driver.findElement(By.cssSelector("#login-password")).sendKeys("Winvini@2017");
		driver.findElement(By.xpath("//input[@id='login-submit']")).submit();
		String noOffriends = driver.findElement(By.xpath("//span[@class='pv-top-card-v2-section__entity-name pv-top-card-v2-section__connections ml2 t-14 t-black t-bold']")).getText();
		System.out.println("Deepak's connections:"+noOffriends);
		
		driver.navigate().to("https://www.linkedin.com/in/vinithra-subramanian/");
		String noOffriend = driver.findElement(By.xpath("//span[@class='pv-top-card-v2-section__entity-name pv-top-card-v2-section__connections ml2 t-14 t-black t-normal']")).getText();
		System.out.println("Vinithra's connections:"+noOffriend);
		
		driver.findElement(By.xpath("//span[text()='Show more']")).click();
		
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Show more']"))).build().perform();
		driver.findElement(By.xpath("//span[text()='Show more']")).click();
		System.out.println("Vinithra's skills:");
		List<WebElement> findElements = driver.findElements(By.xpath("//span[@class='pv-skill-category-entity__name-text t-16 t-black t-bold']"));
		for(WebElement e:findElements)
		{
			System.out.println(e.getText());
		}
		
	}
}
