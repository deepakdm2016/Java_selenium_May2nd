package finalDemo;

public final class A {
	
	static final double pi=3.14;

	A()
	{
		//pi=3.14;
	}
	public static void main(String v[])
	{
		final A a=new A();
		//a.pi=9.0;
System.out.println(A.pi);		
		//a=new A();
		
		
	}

}
