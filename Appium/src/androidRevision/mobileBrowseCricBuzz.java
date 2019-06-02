package androidRevision;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class mobileBrowseCricBuzz extends baseChrome {

public static void main(String[] args) throws MalformedURLException {
// TODO Auto-generated method stub
AndroidDriver<AndroidElement> driver=capabilities();
driver.get("https://www.cricbuzz.com/");
System.out.println(driver.getTitle());
driver.findElementByXPath("//a[@href='#menu']").click();
driver.findElementByXPath("//a[contains(text(),'Home')]").click();
System.out.println(driver.getCurrentUrl());

JavascriptExecutor js= (JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,400);");

List<AndroidElement> headers = driver.findElements(By.xpath("//h4[@class='cb-list-item ui-header ui-branding-header']"));
for(int i=1;i<headers.size();i++)
{
	System.out.println(driver.findElements(By.xpath("//h4[@class='cb-list-item ui-header ui-branding-header']")).get(i).getText());
}
//rahulonlinetutor@gmail.com

}

}