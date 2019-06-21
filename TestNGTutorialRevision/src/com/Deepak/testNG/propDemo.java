package com.Deepak.testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class propDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\TestNGTutorialRevision\\src\\input.properties"));
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.get("Deepak"));
		System.out.println(prop.get("Vinithra"));
		System.out.println(prop.get("Nagesh"));
		
	}

}
