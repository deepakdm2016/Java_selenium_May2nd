package SerializeDeserialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class empMainDeserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		FileInputStream fis;
		ObjectInputStream ois;
		
		fis=new FileInputStream(new File("C:\\Users\\Deepak\\Desktop\\employee.ser"));
		ois=new ObjectInputStream(fis);
		
		employee e11=(employee) ois.readObject();
		employee e21=(employee) ois.readObject();
		System.out.println(e11.getName());
		System.out.println(e21.getName());
		System.out.println(e21.getEmpId());

	
	}

}
