package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class readFile {

	public static void main(String[] args) throws IOException {
	
		String readLine;

		try(
				FileInputStream readFile=new FileInputStream(new File("C:\\Users\\Deepak\\Desktop\\Grid learning.txt"));
				InputStreamReader isr=new InputStreamReader(readFile);
				BufferedReader br=new BufferedReader(isr);
				) {
			do
			{
				readLine = br.readLine();
				if(readLine==null)
				{
					break;
				}
				System.out.println(readLine);
				
			}
			while(readLine!=null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
