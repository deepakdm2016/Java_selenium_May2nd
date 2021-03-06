package herokuApp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumInterviewQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.softwaretestingmaterial.com/selenium-interview-questions/");
		
		String text = driver.findElement(By.xpath("//strong[contains(text(),'8. Can you explain the Framework which you have us')]")).getText();
		System.out.println("text: "+text);

		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String title = (String) js.executeScript("return document.title;");
		System.out.println(title);
		
		String url = (String) js.executeScript("return document.URL;");
		System.out.println(url);
		
		List<WebElement> questions = driver.findElements(By.xpath("//*[contains(text(),'?')]"));
		for(int i=0;i<questions.size();i++)
		{
			
		System.out.println(questions.get(i).getAttribute("textContent"));
		//System.out.println("*************************************************************");
		
		}

	}

}
