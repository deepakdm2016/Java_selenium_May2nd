package SerializeDeserialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class empMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		employee e1=new employee("389524","DeepakDM");
		employee e2=new employee("326112","Vinithra");
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		fos=new FileOutputStream(new File("C:\\Users\\Deepak\\Desktop\\employee.ser"));
		oos=new ObjectOutputStream(fos);
		
		oos.writeObject(e1);
		oos.writeObject(e2);
		System.out.println("Employee object serialized");
	
	}

}
