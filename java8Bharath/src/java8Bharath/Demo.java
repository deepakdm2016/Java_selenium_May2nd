package java8Bharath;

public class Demo {
	

	static Demo obj=new Demo();
	
	static{
		System.out.println(Demo.obj);
		Demo.init();
	}

	public static void main(String v[])
	{
		System.out.println(Demo.obj);
		Demo demo = new Demo();
		demo.doSomething();
	}

	static void init()
	{
		Demo.obj=new Demo();
		
	}
	
	void doSomething()
	{
		System.out.println("Do Something");
	}
}

