package Basics;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testTable {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://www.espncricinfo.com/india/content/player/253802.html");
		
		String[] team={"Virat Kohli (capt)", "Jasprit Bumrah", "Yuzvendra Chahal", "Shikhar Dhawan", "MS Dhoni (wk)", "Ravindra Jadeja", "Kedar Jadhav", "Dinesh Karthik (wk)", "Bhuvneshwar Kumar", "Hardik Pandya", "KL Rahul", "Mohammed Shami", "Vijay Shankar", "Rohit Sharma", "Kuldeep Yadav"};
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int j=0;j<team.length;j++)
		{
			
		System.out.println(team[j]);
		driver.findElement(By.xpath("//a[@id='global-search-trigger']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@class='search-box']")).sendKeys(team[j],Keys.ENTER);
		driver.findElement(By.xpath("//div[contains(@class,'gs-title gsc-table-cell-thumbnail gsc-thumbnail-left')]//a[contains(@class,'gs-title')][contains(text(),\" News, Career, Age\")]")).click();
		
		js.executeScript("window.scrollBy(0,200);");
		File src= ((TakesScreenshot)driver). getScreenshotAs(OutputType. FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Deepak\\teamIndia2019\\"+team[j]+".jpeg"));
		List<WebElement> rows = driver.findElements(By.xpath("//table[1]//tbody/tr"));
		int totalInnings = 0;
		int totalRuns = 0;

		for (int i = 1; i <= 3; i++) {
			WebElement inn = driver.findElement(By.xpath("//table[1]//tbody/tr[" + i + "]/td[3]"));
			String innings = inn.getText();
			int in = 0;
			try
			{
				in = Integer.parseInt(innings);
			}
			
			catch(NumberFormatException e)
			{
				System.out.println("value not available");
				continue;
			}
			totalInnings += in;

			WebElement score = driver.findElement(By.xpath("//table[1]//tbody/tr[" + i + "]/td[5]"));
			String sc = score.getText();
			int runs = Integer.parseInt(sc);
			totalRuns += runs;

		}
		//System.out.println("Total Innings: "+totalInnings);
		//System.out.println("Total Runs: "+totalRuns);

		double avg=totalRuns/totalInnings;
		System.out.println("Average :"+avg);
		}
	}

}
