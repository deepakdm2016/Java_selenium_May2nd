package mindTree_inheritence;

public class string_swap {

	public static void main(String v[])
	{
		String s1="Deepak";
		String s2="Vinithra";
		
		s1=s1+s2;
		s2=s1.substring(0,s1.indexOf(s2));
		s1=s1.substring(s2.length());
		
		System.out.println("S1 is "+ s1);
		System.out.println("S2 is "+ s2);
	}
	
	
}
