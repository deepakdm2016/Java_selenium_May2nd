package libraryAPIRevision;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class getBook {

	@Test(dataProvider="feeder")
	public void addBook(String isbn, String aisle) {
		RestAssured.baseURI = "http://216.10.245.166";

		Response response = given().header("Content-Type", "application/json")
				.body(payLoadLibrary.libraryPayLoad(isbn, aisle)).log().all().when()
				.post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response();

		String res = response.asString();
		System.out.println("ResPonse Deepak" + res);

		JsonPath x = new JsonPath(res);
		System.out.println("X:" + x);
		System.out.println("ID: " + x.get("ID"));
		String id = x.get("ID");

		given().header("Content-Type", "application/json").
		body("{" + "\"ID\" : \"" + id + "\"}").log().all().when()
				.post("/Library/DeleteBook.php").
			then().assertThat().statusCode(200).log().all();

	}

	@DataProvider(name="feeder")
	public Object[][] feeder() {

		Object[][] data = new Object[5][2];
		for (int i = 0; i < 5; i++) {
			{
				for (int j = 0; j < 2; j++) {
					if (j % 2 == 0) {
						data[i][j] = "deepakdm2" + (i + 1);

					} else
						data[i][j] = "3895241" + (i + 1);
				}
			}
		}

		return data;

	}
	
	
	@Test
	public void staticJson() throws IOException {
		RestAssured.baseURI = "http://216.10.245.166";

		Response response = given().header("Content-Type", "application/json")
				.body(payLoadLibrary.GenerateStringFromResource("C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\restAssured\\src\\libraryAPIRevision\\example.json")).log().all().when()
				.post("/Library/Addbook.php").then().assertThat().statusCode(200).extract().response();

		String res = response.asString();
		System.out.println("ResPonse Deepak" + res);

		JsonPath x = new JsonPath(res);
		System.out.println("X:" + x);
		System.out.println("ID: " + x.get("ID"));
		String id = x.get("ID");

		given().header("Content-Type", "application/json").
		body("{" + "\"ID\" : \"" + id + "\"}").log().all().when()
				.post("/Library/DeleteBook.php").
			then().assertThat().statusCode(200).log().all();

	}


}
