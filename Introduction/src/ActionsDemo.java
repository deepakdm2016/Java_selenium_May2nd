import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ActionsDemo {

	public static final String USERNAME = "deepakdm";

	public static final String ACCESS_KEY = "0b90b757-a1e5-4d20-b99c-5b46b2224735";

	// https://wiki.saucelabs.com/display/DOCS/Automated+Web+App+Testing+on+Desktop+and+Mobile+Browsers----will
	// give URL configuration details based on zone

	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {

		// TODO Auto-generated method stub

		// https://wiki.saucelabs.com/display/DOCS/Platform+Configurator#/ --use
		// this link to get the required desired capabilities of a particular
		// browser

		DesiredCapabilities caps = DesiredCapabilities.chrome();
		caps.setCapability("version", "51.0");

		caps.setCapability("Platform", "Windows 7");

		DesiredCapabilities caps1 = DesiredCapabilities.firefox();
		caps1.setCapability("Platform", "Linux");
		caps1.setCapability("version", "43.0");

		// note this step like how remote driver is configured here ----URL,
		// capabilities
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL), caps1);

		driver.get("http://google.com");

		System.out.println(driver.getTitle());

		driver.get("http://www.echoecho.com/htmlforms10.htm");

		// driver.findElement(By.xpath("//input[@value='Milk']")).click();

		int count = driver.findElements(By.xpath("//input[@name='group1']")).size();

		for (int i = 0; i < count; i++)

		{

			// driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

			String text = driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");

			if (text.equals("Cheese"))

			{

				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();

			}

		}

	}

}