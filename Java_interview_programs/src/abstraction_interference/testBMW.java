package abstraction_interference;

public class testBMW {

	public static void main(String[] args) {
		BMW a=new BMW3();
		a.communFunc();
		a.accelarator();
		
		a=new BMW5();
		a.communFunc();
		a.accelarator();
		
	}

}
