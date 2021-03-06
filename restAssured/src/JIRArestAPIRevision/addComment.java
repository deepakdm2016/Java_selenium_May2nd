package JIRArestAPIRevision;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


public class addComment {

	String issueId;
	String sessionid;
	String comment="This is a comment regarding the quality of the response for wires.";
	public static Logger log=LogManager.getLogger();

	@Test
	public void addIssue() {
		// TODO Auto-generated method stub
		
		sessionid=Authentication.getSessionId();
		log.info(sessionid);
		issueId = createIssue.createIssue();
		log.info(issueId);

		RestAssured.baseURI="http://localhost:8080";
		Response res=given().header("Content-Type","application/json").
		header("Cookie", "JSESSIONID="+sessionid).pathParam("issueId", issueId).
		body("{"+
				"    \"body\": \"This is a comment regarding the quality of the response for wires.\""+
				"}").log().all().when().post("rest/api/2/issue/{issueId}/comment").
		then().assertThat().statusCode(201).log().all().extract().response();
		
		String response=res.asString();
		JsonPath js=new JsonPath(response);
		String id=js.get("id");
		String key=js.get("key");
		log.info("ID: "+id);
	}

	@Test(dependsOnMethods={"addIssue"})
	public void addComments()
	{
		
		Response rs=given().header("Content-Type","application/json").
				header("Cookie", "JSESSIONID="+sessionid).
				pathParam("issueId", issueId).when().
				get("rest/api/2/issue/{issueId}").
				then().assertThat().statusCode(200).extract().response();
				
				String response1=rs.asString();
				JsonPath js1=new JsonPath(response1);
				int count=js1.get("fields.comment.comments.size()");
				for(int i=0;i<count;i++)
				{
					log.info("Comment:: "+js1.get("fields.comment.comments.get("+i+").body"));
					Assert.assertEquals(comment, js1.get("fields.comment.comments.get("+i+").body"));
					
				}
	}
	
}
