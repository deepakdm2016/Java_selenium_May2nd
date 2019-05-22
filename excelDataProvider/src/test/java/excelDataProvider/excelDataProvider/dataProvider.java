package excelDataProvider.excelDataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataProvider {

public static void main(String v[]) throws IOException	{
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Deepak\\Downloads\\sample.xlsx"));
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rows = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getLastCellNum();
		Object[][] data=new Object[rows-1][column];

		for(int i=0;i<rows;i++)
		{
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<column; j++)
			{
				System.out.println(row.getCell(j));
				data[i][j]=row.getCell(j);
			}
		}
		
		
		
	}


	
}
