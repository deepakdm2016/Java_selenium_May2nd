package java8Streams;

import java.util.ArrayList;

public class mapcheck {

	public static void main(String v[])
	{
		ArrayList<String> slist=new ArrayList<String>();
		slist.add("Hello");
		slist.add("Deepak");
		slist.add("please");
		slist.add("get");
		slist.add("back");
		slist.add("to");
		slist.add("work");
	
		slist.stream().filter(s->s.length()>5).map(s ->s.toUpperCase()).forEach(s->System.out.println(s));
		
	}
}
