import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class disabledText {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");

		WebElement element = driver.findElement(By.xpath("//input[@id='fromPlaceName']"));
		System.out.println(element.getAttribute("value"));
		
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		String s=(String) js.executeScript("return document.getElementById('fromPlaceName').value;");

		System.out.println(s);
		js.executeScript("document.getElementById('fromPlaceName').value='Mysore';");

		Thread.sleep(5000);
		driver.close();
	}

}
