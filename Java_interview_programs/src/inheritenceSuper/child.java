package inheritenceSuper;

public class child extends parent {

	child(int a, int b, int c, int d) {
		super(a, b);
		System.out.println("Child variables: "+c+":: "+d);
	}

	void f1() {
		super.f1();
		System.out.println("inside child");
	}

}