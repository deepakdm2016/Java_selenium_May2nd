package methodMappingConstructors;

public class myClass {

	private String str;
	
	myClass(String str)
	{
		this.str=str;
		System.out.println("Inside constructor: "+ str);
	}
}
