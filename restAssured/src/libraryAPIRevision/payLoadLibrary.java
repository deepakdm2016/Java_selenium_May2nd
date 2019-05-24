package libraryAPIRevision;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class payLoadLibrary {

	public static String libraryPayLoad(String isbn, String aisle)
	{
		return 
				"{"+
				"\"name\":\"Learn Appium Automation with Java\","+
				"\"isbn\":\""+isbn+"\","+
				"\"aisle\":\""+aisle+"\","+
				"\"author\":\"John foe\""+
				"}";
	}
	
	public static String GenerateStringFromResource(String path) throws IOException
	{
		return new String(Files.readAllBytes(Paths.get(path)));
		
	}
}
