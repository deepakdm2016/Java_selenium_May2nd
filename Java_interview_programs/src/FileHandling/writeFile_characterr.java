package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class writeFile_characterr {

	public static void main(String[] args) throws IOException {
		FileInputStream readFile=new FileInputStream(new File("C:\\Users\\Deepak\\Desktop\\Grid learning.txt"));
		InputStreamReader isr=new InputStreamReader(readFile);
		BufferedReader br=new BufferedReader(isr);
		
		FileOutputStream writeFile=new FileOutputStream(new File("C:\\Users\\Deepak\\Desktop\\Copy_Grid learning.txt"));
		OutputStreamWriter osr=new OutputStreamWriter(writeFile);
		BufferedWriter brw=new BufferedWriter(osr);
	
		String readLine;
		try {
			do
			{
				readLine = br.readLine();
				
				if(readLine==null)
				{
					break;
				}
				
				brw.write(readLine+"\n");

				System.out.println(readLine);
				
			}
			while(readLine!=null);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally
		{
		br.close();
		isr.close();
		readFile.close();
		
		brw.close();
		osr.close();
		writeFile.close();

		
		}
	}

}
