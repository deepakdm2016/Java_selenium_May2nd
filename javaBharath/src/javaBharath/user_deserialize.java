package javaBharath;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class user_deserialize implements Serializable {
	
	public static void main(String v[]) throws IOException, ClassNotFoundException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\Deepak\\user.ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object u_deserialize=ois.readObject();
		user u=(user)u_deserialize;
		System.out.println(u.name);
		System.out.println(u.id);
		System.out.println(u);


	}
	

}
