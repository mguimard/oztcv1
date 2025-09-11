package ozt.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FilesBasics {

	public static void main(String[] args)  throws IOException {
		
		BufferedReader br = new BufferedReader(new
				InputStreamReader(System.in));
				System.out.print("Enter any number between 1 and 10: ");
				int num = br.read();
				System.out.println((char)num);
		
	}
	
	public static void main2(String[] args) throws IOException {
		
		File f1 = new File("/tmp/ozt/existepas");		
		System.out.println(f1);
		
		File f2 = new File("bkzhjahazze//vbfzsa dniamzd kjah zbvdh");		
		System.out.println(f2);
		
		System.out.println(f1.exists()); // false
		System.out.println(f1.createNewFile()); // true
		
		f2.createNewFile();
	}
	
}
