package googlePlaceAPI;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import googleAPIFiles.resources;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;

public class getPlaceDetails {

	@Test
	public void restTest() {

		RestAssured.baseURI="https://maps.googleapis.com";
	
		Response response = given().
			param("location","-33.8670522,151.1957362").
			param("radius","1500").
			param("key","AIzaSyDCCqBMQfSt3svIvYJXEu9ukNIjTwRwrKo").
		when().
			get("maps/api/place/nearbysearch/json").
		then().assertThat().statusCode(200).and().
				contentType(ContentType.JSON).and().
				
				//body("results[0].geometry.location.lat",equalTo("-33.86882")).and().
				body("results[0].name", equalTo("Sydney")).
				and().body("results[0].place_id", equalTo("ChIJP3Sa8ziYEmsRUKgyFmh9AQM")).
				and().header("Server", "scaffolding on HTTPServer2").extract().response();
	
		JsonPath js=resources.rawToJson(response);
		
		System.out.println("Size"+js.get("results.size()"));
		System.out.println(response.asString());
		
		int  count = js.get("results.size()");
		
		for(int i=0;i<count;i++)
		{
			System.out.println("Name: "+ js.get("results["+i+"].name"));
		}
		
		
		
	}

}
