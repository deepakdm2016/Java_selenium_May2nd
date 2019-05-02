import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptExecutorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.espncricinfo.com");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,5000)", "");
		js.executeScript("window.scrollBy(0,-2500)", "");

	}

}
