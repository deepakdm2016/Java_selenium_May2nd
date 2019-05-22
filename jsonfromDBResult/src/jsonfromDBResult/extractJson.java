package jsonfromDBResult;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class extractJson {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub

		ObjectMapper o=new ObjectMapper();
		CustomerDetails cd=o.readValue(new File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\jsonfromDBResult\\src\\json_output1.json"), CustomerDetails.class);
		System.out.println(cd.getCourseName());
	}

}
