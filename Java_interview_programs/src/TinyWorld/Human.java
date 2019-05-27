package TinyWorld;

public class Human {

	String name;
	int age;
	int heightIninches;
	String eyeColor;
	
	public Human()
	{
		
	}
	
	public Human(String name, int age, int heightIninches, String eyeColor) {
		super();
		this.name = name;
		this.age = age;
		this.heightIninches = heightIninches;
		this.eyeColor = eyeColor;
	}

	public void speak()
	{
		System.out.println("Hello I am: "+ name);
		System.out.println("My age is"+ age);
		System.out.println("Height "+ heightIninches);
		System.out.println("Eye Color: "+ eyeColor);

	}
	
	public void eat()
	{
		System.out.println("eating...");

	}
	
	
	public void walk()
	{
		System.out.println("walking...");

	}
	
	public void work()
	{
		System.out.println("working...");

	}
}
