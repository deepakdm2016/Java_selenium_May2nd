package Basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class alerts_web {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		WebElement radio = driver.findElement(By.xpath("(//td[@class='table5']) [2]"));

		List<WebElement> s = radio.findElements(By.xpath("//input[@type='radio']"));
		System.out.println(radio.findElements(By.xpath("//input[@type='radio']")).size());
	/*	for (int i = 0; i < s.size(); i++) {
			radio.findElements(By.xpath("//input[@type='radio']")).get(i).click();
			System.out.println(radio.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value"));
		}
*/
		for (int i = 0; i < s.size(); i++) {
			String actual = radio.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value");

			if (actual.equals("Butter")) {
				System.out.println("Inside cheese loop");
				radio.findElements(By.xpath("//input[@type='radio']")).get(i).click();
				System.out.println(radio.findElements(By.xpath("//input[@type='radio']")).get(i).getAttribute("value"));

			}

		}
	}

}
