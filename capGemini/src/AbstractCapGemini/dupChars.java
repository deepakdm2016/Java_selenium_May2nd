package AbstractCapGemini;

import java.util.HashMap;
import java.util.Map;

public class dupChars {

	public static void main(String[] args) {

		String test="Welcome";
		String temp;
		Map<String, Integer> mp=new HashMap<String, Integer>();
		for(int i=0;i<test.length();i++)
		{
			
			temp=test.substring(i, i+1);
			System.out.println(temp);
			if(!mp.containsKey(temp))
			{
				mp.put(temp, 1);
			}
			else
			{
				mp.put(temp, mp.get(temp)+1);
								
			}
			}
		
		System.out.println(mp);
		
		for(Map.Entry m:mp.entrySet() )
		{
			int i=(int) m.getValue();
			
			if(i>1)
			{
				System.out.println("Duplicates: "+m.getKey());
			}
			
		}
	}

}
