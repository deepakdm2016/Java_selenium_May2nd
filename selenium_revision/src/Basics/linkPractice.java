package Basics;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class linkPractice {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.qaclickacademy.com/interview.php");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		Actions a= new Actions(driver);
		
		for(int i=0;i<links.size();i++)
		{
			//System.out.println(s.getAttribute("href"));
			//System.out.println(s.getText());
			
			String link=links.get(i).getAttribute("href");
			links.get(i).sendKeys(Keys.CONTROL,Keys.ENTER);
			URL url = null;
			try {
				url = new URL(link);
			} catch (Exception e) {
				System.out.println("Bad URL :"+link);
			}
			int responseCode=0;
			try {
				HttpURLConnection open=(HttpURLConnection)(url.openConnection());
                open.setRequestMethod("HEAD");

				open.connect();
				
				responseCode = open.getResponseCode();
				System.out.println(responseCode);
				 if(responseCode >= 400){
	                    System.out.println(url+" is a broken link");
	                }
	                else{
	                    System.out.println(url+" is a valid link");
	                }
			
				} catch (Exception e) {

					System.out.println(e);
					System.out.println(link +" has problem ");
				
			}

		}
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		Iterator it=windowHandles.iterator();
		while(it.hasNext())
		{
			System.out.println(driver.switchTo().window((String) it.next()));
			System.out.println(driver.getTitle());
		}
		
	}

}
