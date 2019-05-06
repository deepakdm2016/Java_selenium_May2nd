package HospitalUtils_testVargant;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class hospitalManagement {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat objSDF = new SimpleDateFormat("dd-M-yyyy");
		  Date dt_1 = objSDF.parse("28-04-2019");
		  Date dt_2 = objSDF.parse("01-05-2019");
		hospital manipal=new hospital();
		patient p1=new patient("Deepak","Mysore", new Date());
		patient p2=new patient("Shyam","Bangalore", new Date());
		patient p3=new patient("Vinithra","Bangalore", dt_1);
		patient p4=new patient("Pavithra","Bangalore",  dt_1);
		patient p5=new patient("Sandeep","Bangalore", objSDF.parse("29-04-2019"));
		
		manipal.addPatient(p1);
		manipal.addPatient(p2);
		manipal.addPatient(p3);
		
		manipal.addPatient(p5);
		manipal.addPatient(p4);

		manipal.getStats(new Date());
			
		
	}

}
