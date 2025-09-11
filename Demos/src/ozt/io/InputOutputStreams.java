package ozt.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

class Pizza implements Serializable {	
	private static final long serialVersionUID = 6159531022238938840L;
	
	static int prix = 0;
	String name;
	
	Pizza(String name){
		this.name = name;
		prix++;
	}
}

public class InputOutputStreams {

	public static void main(String[] args) throws Exception  {
		var oos = new ObjectOutputStream(new FileOutputStream("/tmp/ozt/pizza"));
		oos.writeObject(new Pizza("chorizo"));
		
		new Pizza("chorizo");
		new Pizza("chorizo");
		new Pizza("chorizo");
		
		var ois = new ObjectInputStream(new FileInputStream("/tmp/ozt/pizza"));
		Object o = ois.readObject();
		
		if(o instanceof Pizza p) {
			System.out.println(p.name);
			System.out.println(p.prix); // 4
		}
	}
	

	public static void main5(String[] args) throws IOException {

		var dis = new DataInputStream(new FileInputStream("/tmp/ozt/binaryfile"));

		System.out.println(dis.readByte()); // ?
		System.out.println(dis.readByte()); // ?
		System.out.println(dis.readByte()); // ?
		System.out.println(dis.readByte()); // ?
		System.out.println(dis.readByte()); // ?		
	}
	
	public static void main4(String[] args) throws IOException {

		var dos = new DataOutputStream(new FileOutputStream("/tmp/ozt/binaryfile"));

		// 00000000 00000000 00000000 00000001
		dos.writeInt(1);
	}

	public static void main2(String[] args) throws IOException {
		try (FileInputStream fis = new FileInputStream("/tmp/ozt/fichier.txt");
				FileOutputStream fos = new FileOutputStream("/tmp/ozt/fichier2.txt");) {

			byte[] bytes = new byte[20]; // [0,0,0,0,0,0,0,0...]
			fis.read(bytes);

			for (byte b : bytes) {
				System.out.println(b);
			}

			//fis.close();
			fis.read();
			
			fos.write(bytes);
			// fis.close()
		}
	}
}
