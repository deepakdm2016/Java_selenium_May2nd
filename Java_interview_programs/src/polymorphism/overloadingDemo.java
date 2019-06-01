package polymorphism;

public class overloadingDemo {
	
	overloadingDemo()
	{
		System.out.println("Default constructor");
	}

	overloadingDemo(int a)
	{
		System.out.println("one arg constructor");
	}
	
	overloadingDemo(int b, int c)
	{
		System.out.println("two arg constructor");
	}

	

	void add(double b, double c)
	{
		System.out.println(b+c);
	}

	void add(int b, int c)
	{
		System.out.println("integer demo overladaed method "+(b+c));
	}
	
	public static void main(String[] args) {
		overloadingDemo ol=new overloadingDemo();
		ol.add(3.14,  5.99);
		ol.add(3,  5.99);
		ol.add(3,  5);

	}

}
