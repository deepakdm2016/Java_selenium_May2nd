package jsonfromDBResult;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class fetchResults {

	public static void main(String[] args) throws SQLException, JsonGenerationException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/Business", "hbstudent","hbstudent");
		Statement s=con.createStatement();
		ResultSet rs = s.executeQuery("select * from CustomerInfo where purchasedDate=CURDATE() and Location ='Asia';");
		
		CustomerDetails c1 = null;
		ObjectMapper oj=new ObjectMapper();
		ArrayList<CustomerDetails> cdList=new ArrayList<CustomerDetails>();

		while(rs.next())
		{
			String s1=rs.getString("CourseName");
			String s2=rs.getString("Location");
			int s3=rs.getInt("Amount");
			String s4 = rs.getString("PurchasedDate");
			
			System.out.println(s1+" "+s2+" "+s3+" "+s4);
			c1.setAmount(s3);
			c1.setCourseName(s1);
			c1.setLocation(s2);
			c1.setPurchasedDate(s4);
		   
		    cdList.add(c1);
			System.out.println(c1.getAmount()+" "+c1.getCourseName()+" "+c1.getLocation()+" "+c1.getPurchasedDate());
			oj.writeValue(new File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\jsonfromDBResult\\src\\json_output.json"), c1);
		}
		int i=1;
		
		System.out.println(cdList.size());
		for(CustomerDetails c:cdList)
		{
			oj.writeValue(new File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\jsonfromDBResult\\src\\json_output"+i+".json"), c);
		i++;
		}
		}
		
		

}