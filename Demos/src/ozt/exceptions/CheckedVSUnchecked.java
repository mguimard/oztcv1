package ozt.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class Animal {		
}

public class CheckedVSUnchecked {
	
	static int i = 1 / 0;
	
	static {
		System.out.println("Static bloc 1");
		int i = 1 / 0;		
	}
	
	static {
		System.out.println("Static bloc 2");
	}

	public static void main(String[] args) {
		/*
		try {
			
		}
		catch (NullPointerException | RuntimeException e) {
			
		}*/
		
	}
	
	public static void main10(String[] args) {
		System.out.println("début de programme");
	}
	
	public static void main9(String[] args) {
		
		try{
			g();
		} catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("Fin de programme");
	}
	
	static void g() {
		throw null;
	}

	public static void main7(String[] args) throws Exception {
		Exception e = null;
		
		throw null;
		//throw e;
	}
	
	public static void main6(String[] args) {
		try {
			f();
		} catch (Exception e) {
			// ....
		}
	}
	
	static void f() throws Exception{} // checked
	
	public static void main5(String[] args) {
		
		try {
			// du code
		} catch(Exception e) {
			
		}
		/*
		try {
			// du code qui ne leve pas une IOException
		} catch(IOException e) {
			// unreachable
		}
		 */
		// checked => vérifié à la compilation
		// Exception
		// - IOException
		// -- FileNotFoundException
		// ...
		try {
			var fis = new FileInputStream(new File("/tmp/existepas"));
			fis.read();
		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		} catch (Exception e) {

		} catch (Throwable e) {

		}
		// unchecked => non vérifié à la compilation
		// RuntimeException
		// NullPointerException
		// IllegalStateException
		// UnSupportedOperationException
		// ClassCastException
		// ...

		Object o = null;
		System.out.println(o.toString()); // NPE

	}

	public static void main4(String[] args) {
		try {
			// ....
		} catch (OutOfMemoryError e) {
			// .... ????
		}
	}

	public static void main3(String[] args) throws Exception {
		throw new Exception();
	}

	public static void main2(String[] args) throws Throwable {

		// throw new Animal();

		if (Math.random() > 0.5)
			throw new Throwable();

	}
}
