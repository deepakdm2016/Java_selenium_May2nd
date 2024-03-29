package libraryAPI;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.payLoad;
import files.resources;
import files.reusableMethods;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class staticJson {

	public static Properties prop;

	@BeforeTest
	public void getData() throws FileNotFoundException, IOException {
		prop = new Properties();
		prop.load(new FileInputStream(
				new File("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\restAssured\\src\\files\\environment.properties")));
	}

	@Test
	public void dynamicJson() throws IOException {
		RestAssured.baseURI = "http://216.10.245.166";
		System.out.println("step1");
		Response res = given().log().body().header("Content-Type", "application/json").

				body(GenerateStringFromResource("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\restAssured\\src\\files\\postdata.json"))
				.

				when().

				post("/Library/Addbook.php").then().log().body().assertThat().statusCode(200).and().contentType(ContentType.JSON)
				.and().extract().response();

		System.out.println(res);

		String response = res.asString();
		System.out.println(response);
		
		JsonPath js=reusableMethods.rawToJson(res);
					String id=js.get("ID");
		
		System.out.println(id);
		
	}

	
	public static String GenerateStringFromResource(String path) throws IOException
	{
		
		return new String(Files.readAllBytes(Paths.get(path)));
		
	}
	
	
	

}
