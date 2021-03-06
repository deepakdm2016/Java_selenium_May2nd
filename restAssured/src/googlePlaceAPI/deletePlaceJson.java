package googlePlaceAPI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import files.reusableMethods;
import googleAPIFiles.payLoad;
import googleAPIFiles.resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class deletePlaceJson {

	Properties prop = new Properties();

	@BeforeTest
	public void getProperties() throws IOException {
		File input = new File(
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\restAssured\\src\\googleAPIFiles\\data.properties");
		FileInputStream fis = new FileInputStream(input);
		prop.load(fis);
	}

	@Test
	public void addDelete() {
		// TODO Auto-generated method stub

		RestAssured.baseURI = (String) prop.get("host");

		Response response = given().queryParam("key", prop.get("key")).
				body(payLoad.postBody()).log().body().

				when().post(resources.postURL()).

				then().log().body().assertThat().statusCode(200).extract().response();

		System.out.println(response.asString());
		JsonPath js=resources.rawToJson(response);
		
		
		String placeId = js.get("place_id");
		System.out.println(placeId);

		RestAssured.baseURI = prop.getProperty("host");

		Response delResponse = given().queryParam("key", prop.get("key")).
				body("{" + "\"place_id\":" + placeId + "}").log().body()
				.when().delete(resources.deleteURL()).then().log().all().
				assertThat().
				statusCode(200).extract().response();

		// System.out.println(delResponse.asString());

	}

}
