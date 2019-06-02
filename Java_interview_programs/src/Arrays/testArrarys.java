package Arrays;
import java.util.Arrays;
import java.util.Comparator;
public class testArrarys {
	
	public static void main(String v[])
	{
		Integer a[]={1, 4, 7, 9, 10, 2, 3};
		
		Arrays.sort(a);
		
		Comparator<Integer> c=(i,j)->{if(i<j) return 1; else return -1;};
		Arrays.sort(a, c);
		
		System.out.println(Arrays.asList(a));
		
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
