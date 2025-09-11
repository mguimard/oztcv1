package ozt.io;

import java.io.File;
import java.io.IOException;

public class FilesBasics {

	public static void main(String[] args) {
		
		File dossier = new File("/tmp/ozt");
		
		for(File f : dossier.listFiles()) {
			System.out.println(f);
			System.out.println(f.isDirectory());
			
		}
		
		
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
