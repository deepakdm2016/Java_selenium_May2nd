package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class writeFile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream(new File("C:\\Users\\Deepak\\Desktop\\Deepak.png"));
		FileOutputStream fos=new FileOutputStream(new File("C:\\Users\\Deepak\\Desktop\\new_Deepak.png"));
		int read;
		try {
			do
			{
				read= fis.read();
				fos.write(read);
					
			}
			while(read!=-1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
	fis.close();
	fos.close();
		}
	}

}
