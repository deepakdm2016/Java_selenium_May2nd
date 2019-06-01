package abstraction_interference;

public class hondaImpCar implements interfaceCar {

	@Override
	public void go() {

		System.out.println("Inside go of hondaImpl");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Inside stop of hondaImpl");
		
	}

}
