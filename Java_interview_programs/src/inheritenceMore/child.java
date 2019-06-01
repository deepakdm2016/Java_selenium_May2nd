package inheritenceMore;

public class child extends parent {
	
	child()
	{
		super();
		System.out.println(this.getClass().getName()+" child no arg constructor");
	}

	child(int x)
	{
		this();
		System.out.println(this.getClass().getName()+" child one arg constructor");
	}
	child(int a, int b, int c, int d) {
		super(a, b);
		System.out.println(this.getClass().getName()+" child four arg constructor");

		System.out.println("Child variables: "+c+":: "+d);
	}

	void f1() {
		super.f1();
		System.out.println("inside child");
	}

}
