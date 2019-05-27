package JIRArestAPIRevision;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class AuthenticationMap {

	public static Logger log=LogManager.getLogger();

	@Test
	public void getSessionId() {
		// TODO Auto-generated method stub
		
		HashMap<String, String> map=new HashMap<>();
		map.put("username", "deepakdm2016");
		map.put("password", "Vinayaka@2019_1");
		RestAssured.baseURI="http://localhost:8080";
		
		Response res=given().header("Content-Type", "application/json").
		body(map).log().all().when().post("rest/auth/1/session").
				then().log().all().assertThat().statusCode(200).extract().response();
		String response = res.asString();
		JsonPath js=new JsonPath(response);
		log.info("Session Id :"+js.get("session.value"));
		String sessionid=js.get("session.value");
		
	
		}

}
