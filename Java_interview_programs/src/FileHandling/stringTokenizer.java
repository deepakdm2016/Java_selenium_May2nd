package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class stringTokenizer {

	public static void main(String[] args) throws IOException {

		String s = "hello! GOD how ,are you doing today";
		StringTokenizer st = new StringTokenizer(s);
		StringTokenizer st1 = new StringTokenizer(s,",");

		while (st.hasMoreTokens()) {
			String nextToken = st.nextToken();
			System.out.println(nextToken);
		}

		System.out.println();

		
		while (st1.hasMoreTokens()) {
			String nextToken = st1.nextToken();
			System.out.println(nextToken);
		}

	}

}
