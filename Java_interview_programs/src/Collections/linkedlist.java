package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li=new LinkedList<Integer>();
		List<Integer> qli=new ArrayList<Integer>();
		long startTime = System.currentTimeMillis();
		for (int i=0;i<10000000;i++)
		{
			qli.add(i);
		}
		long endtime = System.currentTimeMillis();
		
		System.out.println(endtime-startTime);
		
		
	}

}
