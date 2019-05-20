package Collections;

public class genericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generics<String> a=new generics("Hello");
		generics<Integer> b=new generics(123);
		
		a.displayObjectDetails();
		
		b.displayObjectDetails();
		
		System.out.println(a.getSample());
		System.out.println(b.getSample());
	}

}
