package googlePlaceAPI;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import googleAPIFiles.payLoad;
import googleAPIFiles.resources;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;

import static io.restassured.RestAssured.given;

public class addPlace {

	Properties prop = new Properties();

	@BeforeTest
	public void getProperties() throws IOException {
		File input = new File(
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\restAssured\\src\\googleAPIFiles\\data.properties");
		FileInputStream fis = new FileInputStream(input);
		prop.load(fis);
	}

	@Test
	public void addPlace() {
		// TODO Auto-generated method stub

		RestAssured.baseURI = (String) prop.get("host");

		Response response = given().queryParam("key", prop.get("key")).body(payLoad.postBody()).

				when().post(resources.postURL()).

				then().assertThat().statusCode(200).extract().response();

		System.out.println(response.asString());
	}

}
