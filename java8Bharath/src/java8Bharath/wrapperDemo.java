package java8Bharath;

public class wrapperDemo {

	public static void main(String[] args) {

		int x=100;
		String y=Integer.toString(x);
		
		Integer b=new Integer(y);
		int z = b.intValue();
		
		Integer c=new Integer(z);
		String d=c.toString();
		int parseInt = Integer.parseInt(d);
		
	}

}
