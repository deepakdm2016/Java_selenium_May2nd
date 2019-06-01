package inheritenceDemo;

public class vehicleTest {

	public static void main(String[] args) {

		vehicle a=new vehicle();
		System.out.println(a.fulel());
		a=new vehicleCar();
		System.out.println(a.fulel());
		a=new vehicleBus();
		System.out.println(a.fulel());
		a=new vehicleBike();
		System.out.println(a.fulel());

	}

}
