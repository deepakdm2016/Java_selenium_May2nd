package abstraction_interference;

public interface interfaceCar {
	
	void go();
	void stop();
	
	default void goCar()
	{
		System.out.println("Inside car interface");
	}
	

}
