package restAssured;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import files.reusableMethods;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class Post_xml {
	
	public static Properties prop;
	
	
	@BeforeTest
	public void getData() throws FileNotFoundException, IOException
	{
		 prop=new Properties();
		prop.load(new FileInputStream(new File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\restAssured\\src\\files\\environment.properties")));
	}
	

	@Test
	public void testData() throws IOException {
		
		String postData=GenerateStringFromResource("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\restAssured\\src\\files\\postdata.xml");
		RestAssured.baseURI = prop.getProperty("host");
		ValidatableResponse varOutput = given().queryParam("key", "qaclick123").

				body(postData)
				.

				when().

				post("/maps/api/place/add/xml").then().log().all().assertThat().statusCode(200).and()
				.contentType(ContentType.XML);
				//.and().body("status", equalTo("OK"));
		Response res = varOutput.extract().response();
		System.out.println(res.asString());
		
		XmlPath x=reusableMethods.rawToXml(res);
		
		//XmlPath x=new XmlPath(res.asString());
		//String placeId = x.get("response.place_id");
		System.out.println("Place Id: "+x.get("response.place_id"));
		
	}

	public static String GenerateStringFromResource(String path) throws IOException
	{
		
		return new String(Files.readAllBytes(Paths.get(path)));
		
	}
}
