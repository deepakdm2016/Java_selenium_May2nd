package HCL;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class repeatedCHarcters {
	
	public static void main(String v[])
	{
		String a="deepakdm";
		
		Map<String, Integer> mp=new LinkedHashMap<String, Integer>();
		
		for(int i=0;i<a.length()-1;i++)
		{
			if(!mp.containsKey(a.substring(i,i+1)))
			{
				mp.put(a.substring(i,i+1), 1);
			}
			
			else
			{
				System.out.println(a.substring(i,i+1)+" is repeated");
				mp.put(a.substring(i,i+1), mp.get(a.substring(i,i+1))+1);
			}	
		}
		
		
		System.out.println(mp);
	
		
	}

}
