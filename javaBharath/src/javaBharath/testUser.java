package javaBharath;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class testUser {

	public static void main(String[] args) throws IOException {
		
		
		
		user u1=new user("Deepak",389524);
		user u2=new user("Deepak",389524);
		
		System.out.println(u1==u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1);
		System.out.println(u2);

		
		FileOutputStream fos;
		ObjectOutputStream oos;
		fos=new FileOutputStream("C:\\Users\\Deepak\\user.ser");
		oos=new ObjectOutputStream(fos);
		oos.writeObject(u1);
	}

}

