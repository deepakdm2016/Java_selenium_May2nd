package HCL;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		for(WebElement we:findElements)
		{
			String url = we.getAttribute("href");
			System.out.println(url);
			try {
				HttpURLConnection openConnection=(HttpURLConnection)(new URL(url)).openConnection();
				openConnection.connect();
				int responseCode = openConnection.getResponseCode();
				if(responseCode>=400)
				{
					System.out.println("Broken Link "+url);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
