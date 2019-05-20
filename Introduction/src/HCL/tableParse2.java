package HCL;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableParse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		WebElement table=driver.findElement(By.xpath("//tr"));
		
		List<WebElement> rows=table.findElements(By.xpath("//tr"));
		
		for(int i=1;i<rows.size();i++)
		{
			for(int j=1;j<=3;j++)
			{
				
			String element="//tr["+i+"]"+"/td["+j+"]";	
			String text = driver.findElement(By.xpath(element)).getText();
			
			if(text.equals("Write effective QA Resume that will turn to interview call"))
			{
				System.out.println("Element found");
				break;
			}
			System.out.println(text);
			}
		}
		
		
		
		

	}

}
