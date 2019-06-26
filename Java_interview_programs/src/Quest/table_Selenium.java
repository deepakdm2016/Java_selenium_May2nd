package Quest;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_Selenium {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html?");
		WebElement table = driver.findElement(By.xpath("(//table)[2]"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		ArrayList<Integer> priceList=new ArrayList<Integer>();
		
		for(int i=0;i<rows.size();i++)
		{
			
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			String value = cols.get(2).getText();
			System.out.println(value);
			priceList.add(Integer.parseInt(value));
			
		}
		
		for(int i=0;i<priceList.size()-1;i++)
		{
			if(priceList.get(i)<priceList.get(i+1))
			{
				System.out.println(priceList.get(i)+" is less than "+ priceList.get(i+1));
			}
			
		}
		
	}

}
