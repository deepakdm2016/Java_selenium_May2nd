package Arrays;

public class testArrarys {
	
	public static void main(String v[])
	{
		int a[]={1, 4, 7, 9, 10};
		String b[]=new String[3];
		b[0]="Deepak";
		b[1]="Vinithra";
		b[2]="Nagesh";
		
		for(int i:a)
			System.out.println(i);
		
		
		for(String i:b)
			System.out.println(i);
		
		System.out.println(a.length);
		System.out.println(b.length);
		
	}

}
