package JIRArestAPIRevision;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
import org.apache.logging.log4j.*;

public class getIssues {

	public static Logger log=LogManager.getLogger();
	@Test
	public  void getIssues() {
		// TODO Auto-generated method stub
		
		String sessionid=Authentication.getSessionId();
		log.info(sessionid);

		RestAssured.baseURI="http://localhost:8080";
		Response res=given().header("Content-Type","application/json").
		header("Cookie", "JSESSIONID="+sessionid).
		body("{\"jql\":\"project = RA\",\"startAt\":0,\"maxResults\":2,\"fields\":[\"id\",\"key\"]}").
		log().all().when().get("rest/api/2/search").
		then().assertThat().statusCode(200).log().all().extract().response();
		
		String response=res.asString();
		JsonPath js=new JsonPath(response);
		int  count = js.get("issues.fields.project.size()");
		log.info("Count:"+ count);
		
		for(int i=0;i<count;i++)
		{
			log.info("ID: "+js.get("issues.get("+i+").id"));
			log.info("Key: "+js.get("issues.get("+i+").key"));
			log.info("Summary: "+js.get("issues.get("+i+").fields.summary"));
			log.info("******************************");
		

		}
		
	}

}
