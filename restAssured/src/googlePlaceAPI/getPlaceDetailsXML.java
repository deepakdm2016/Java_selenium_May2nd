package googlePlaceAPI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;

public class getPlaceDetailsXML {

	@Test
	public void restTest() {

		RestAssured.baseURI="https://maps.googleapis.com";
	
		Response response = given().
			param("location","-33.8670522,151.1957362").
			param("radius","1500").
			param("key","AIzaSyDCCqBMQfSt3svIvYJXEu9ukNIjTwRwrKo").
		when().
			get("maps/api/place/nearbysearch/xml").
		then().assertThat().statusCode(200).and().
				contentType(ContentType.XML).and().
				//body("results[0].geometry.location.lat",equalTo("-33.86882")).and().
				//body("results[0].name", equalTo("Sydney")).
				//and().body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).
				and().header("Server", "scaffolding on HTTPServer2").extract().response();
	
		System.out.println(response.asString());
		
		
	}

}
