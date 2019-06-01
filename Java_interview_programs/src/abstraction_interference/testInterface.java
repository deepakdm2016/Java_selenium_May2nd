package abstraction_interference;

public class testInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		interfaceCar car=new hondaImpCar();
		car.go();
		car.stop();
		car.goCar();
		
		/*
		 * Interface is full contact, abstract is partial implementation
		 * Interface methods are public abstract even though u explicity define, 
		 * variables in interface are public static final, in abstract it can be other types
		 * interface can not have constructors
		 * Interface can not have static blocks
		 * 
		 */

	}

}
