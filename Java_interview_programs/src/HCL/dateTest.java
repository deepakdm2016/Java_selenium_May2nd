package HCL;

import java.util.Calendar;
import java.util.Date;

public class dateTest {
	
	public static void main(String v[])
	{
		Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println(calendar.get(Calendar.MONTH));

	}

}
