package dataDrivePropertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testGetPropertyFileAttributes {

	public static void main(String[] args) throws FileNotFoundException, IOException {
			
		Properties prop=new Properties();
		prop.load(new FileInputStream("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\dataDrivePropertyFile\\src\\dataDrivePropertyFile\\dataDrive.properties"));
		
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("empId"));
		
	
	}

}
