package googleAPIFiles;

import io.restassured.path.json.JsonPath;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;

public class resources {

	public static String postURL()
	{
		return "maps/api/place/add/json";
		
	}
	

	public static String postURLXml()
	{
		return "maps/api/place/add/xml";
		
	}
	
	
	public static String deleteURL()
	{
		return "maps/api/place/add/json";
	}
	
	public static String deleteURLXml()
	{
		return "maps/api/place/add/xml";
	}


	public static XmlPath rawToXML(Response r)
	{
	
		
		String respon=r.asString();
		XmlPath x=new XmlPath(respon);
		return x;
		
	}
	
	public static JsonPath rawToJson(Response r)
	{ 
		String respon=r.asString();
		JsonPath x=new JsonPath(respon);
		return x;
	}
	
}
