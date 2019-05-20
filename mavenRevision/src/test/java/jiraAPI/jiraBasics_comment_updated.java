package jiraAPI;

import static io.restassured.RestAssured.given;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class jiraBasics_comment_updated {

	@Test
	public void jiraAPI() throws IOException {

		RestAssured.baseURI = "http://localhost:8080";
		String postData = GenerateStringFromResource(
				"C:\\Users\\Deepak\\Selenium\\Java_selenium_May2nd\\mavenRevision\\src\\test\\java\\jiraAPI\\jira_defect_updateComment.json");
		Response response = given().header("Content-Type", "application/json")
				.header("Cookie", "JSESSIONID=" + reusableMethods.getSessionId()).body(postData).log().all().when()
				.put("/rest/api/2/issue/RA-4/comment/10105").then().log().all().extract().response();

		System.out.println(response.asString());

		JsonPath js = reusableMethods.rawToJson(response);
		String defectId = js.get("id");
		System.out.println("Defect Id:" + defectId);

	}

	private String GenerateStringFromResource(String string) throws IOException {
		// TODO Auto-generated method stub
		return new String(Files.readAllBytes(Paths.get(string)));
	}
}
