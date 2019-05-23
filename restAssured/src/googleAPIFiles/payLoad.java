package googleAPIFiles;

public class payLoad {

	public static String postBody(){
		
		return "{"+
				"\"location\":{"+
				"\"lat\" : -38.383494,"+
				"\"lng\" : 33.427362"+
				"},"+
				"\"accuracy\":50,"+
				"\"name\":\"Frontline house\","+
				"\"phone_number\":\"(+91) 983 893 3937\","+
				"\"address\" : \"29, side layout, cohen 09\","+
				"\"types\": [\"shoe park\",\"shop\"],"+
				"\"website\" : \"http://google.com\","+
				"\"language\" : \"French-IN\""+
				"}";
	}
	
	

public static String postBodyXml(){
		
		return "<?xml version=\"1.0\" encoding=\"UTF-8\" ?> <root> <location> <lat>-38.383494</lat> <lng>33.427362</lng> </location> <accuracy>50</accuracy> <name>The Mens store</name> <phone_number>(+91) 983 893 3937</phone_number> <address>Anna Salai, Chennai</address> <types>shoe park</types> <types>kadai</types> <website>http://google.com</website> <language>tamil-IN</language> </root>";
	}
	

	
}
