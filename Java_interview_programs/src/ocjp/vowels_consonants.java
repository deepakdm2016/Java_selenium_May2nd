package ocjp;

public class vowels_consonants {

	public static void main(String v[])
	{
		String a="I am not happy";
		
		int vowelCOunt=0;
		int consonantCount=0;
		
		a=a.toLowerCase();
				
		for(int i=0;i<a.length();i++)
		{
		
			if (a.charAt(i)==' ') continue;
			switch(a.charAt(i))
			{
			
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'y':vowelCOunt++; break;
			default: consonantCount++; break;
			}
		}
			
	System.out.println("vowelCOunt : "+vowelCOunt);
	System.out.println("consonantCount : "+consonantCount);
	
	}
				
}
