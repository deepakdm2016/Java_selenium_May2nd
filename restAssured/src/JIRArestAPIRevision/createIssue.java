package JIRArestAPIRevision;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;


public class createIssue {

	public static Logger log=LogManager.getLogger();

	@Test
	public static String createIssue() {
		// TODO Auto-generated method stub
		
		String sessionid=Authentication.getSessionId();
		log.info(sessionid);

		RestAssured.baseURI="http://localhost:8080";
		Response res=given().header("Content-Type","application/json").
		header("Cookie", "JSESSIONID="+sessionid).
		body("{"+
				"    \"fields\": {"+
				"       \"project\":"+
				"       {"+
				"          \"key\": \"RA\""+
				"       },"+
				"       \"summary\": \"Wires Defect - May 25 2019\","+
				"       \"description\": \"Creating of an issue using project keys and issue type names using the REST API\","+
				"       \"issuetype\": {"+
				"          \"name\": \"Bug\""+
				"       }"+
				"   }"+
				"}").log().all().when().post("rest/api/2/issue/").
		then().assertThat().statusCode(201).log().all().extract().response();
		
		String response=res.asString();
		JsonPath js=new JsonPath(response);
		String id=js.get("id");
		String key=js.get("key");
		log.info("ID: "+id+" and"+ " key:"+key);
		return key;
	}

}
