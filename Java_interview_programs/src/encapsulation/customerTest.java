package encapsulation;

public class customerTest {

	public static void main(String v[])
	{
		customer c=new customer();
		c.setFname("Deepak");
		c.setLname("dm");
		c.setCreditCard("4ps06ec014");
		
		System.out.println(c.getFname());
		System.out.println(c.getLname());
		System.out.println(c.getCreditCard());

	}
}
