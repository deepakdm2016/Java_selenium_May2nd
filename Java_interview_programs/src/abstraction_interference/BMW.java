package abstraction_interference;

public abstract class BMW {

	public void communFunc()
	{
		System.out.println("Inside common functions");
	}
	
	public abstract void accelarator();
	
	public static void main(String v[])
	{
		System.out.println("Inside abstract main class");
	}
	
}
