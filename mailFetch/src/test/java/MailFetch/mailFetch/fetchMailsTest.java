package MailFetch.mailFetch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fetchMailsTest {

	@Test
	public void getTodaysMail() throws SQLException, InterruptedException
	{
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/hb-01-one-to-one-uni","hbstudent","hbstudent");
		Statement s=con.createStatement();
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("deepakdm2016@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Winvini@2018");;
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(5000);

				
		Map<Integer, String> monthConvertor=new HashMap<Integer, String>();
		monthConvertor.put(0, "Jan");
		monthConvertor.put(1, "Feb");
		monthConvertor.put(2, "Mar");
		monthConvertor.put(3, "Apr");
		monthConvertor.put(4, "May");
		monthConvertor.put(5, "Jun");
		monthConvertor.put(6, "July");
		monthConvertor.put(7, "Aug");
		monthConvertor.put(8, "Sep");
		monthConvertor.put(9, "Oct");
		monthConvertor.put(10, "Nov");
		monthConvertor.put(11, "Dec");

		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		int year = calendar.get(Calendar.YEAR);
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		int mon=calendar.get(Calendar.MONTH);

		String month=monthConvertor.get(mon);
		
		
		List<WebElement> we = driver.findElements(By.xpath("//span[contains(@title,'"+month+" "+day+", "+year+"')]"));
		System.out.println(we.size());
		
		System.out.println(driver.findElement(By.xpath("//tr[3]/td[6] //div[@class='y6']")).getText());
		s.executeUpdate("DELETE FROM mailbox where date(DayOfMail)=current_date");
		
		for(int i=1;i<=we.size();i++)
		{
			
			String subject = driver.findElement(By.xpath("//tr["+i+"]/td[6] //div[@class='y6']")).getText();
			System.out.println(subject);
			subject=subject.replaceAll("[^A-Z a-z 0-9]", "");
			
			String inserQuery="INSERT INTO mailbox (mailSubject) VALUES (\""+subject+"\")";
			System.out.println(inserQuery);
			s.execute(inserQuery);
			
		}
		
		s.close();
		con.close();
		driver.quit();
	}

		
		
	}
	

