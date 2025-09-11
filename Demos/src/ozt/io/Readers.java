package ozt.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Readers {
	public static void main(String[] args) {
		
		try {
			FileReader r = new FileReader("/tmp/ozt/fichier.txt");
			
						
		} catch (FileNotFoundException e) {
			
		}
	}
}
