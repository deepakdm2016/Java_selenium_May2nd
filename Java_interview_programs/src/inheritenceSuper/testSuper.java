package inheritenceSuper;

public class testSuper {

	public static void main(String[] args) {

		parent a=new parent(3, 6);
		a.f1();
		
		a=new child(7,8, 9, 10);
		a.f1();
	}

}
