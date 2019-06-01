package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class checkedException {

	public static void main(String[] args) {

		File a= new File("");
		try {
			FileInputStream fis=new FileInputStream(a);
		} catch (FileNotFoundException e) {
			System.out.println("File is not found in specified path");
		}
		
	}

}
