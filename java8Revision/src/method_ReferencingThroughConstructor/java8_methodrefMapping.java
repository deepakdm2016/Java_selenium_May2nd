package method_ReferencingThroughConstructor;

public class java8_methodrefMapping {
	
	public static void main(String v[])
	{
		
		Runnable r=new java8_methodrefMapping()::mySpecial;
		Thread t1=new Thread(r);
		t1.start();
		
		Runnable r2=java8_methodrefMapping::mine;
		Thread t2=new Thread(r2);
		t2.start();
	}

	
	public void mySpecial()
	{
		System.out.println("Birthday Oct 18th");
	}
	
	public static void mine()
	{
		System.out.println("Birthday March 18th");
	}
}
