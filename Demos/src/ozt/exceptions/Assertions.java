package ozt.exceptions;

class MyLib {
	
	/**
	 * This method blablabla
	 * @param workers : number of workers, MUST NOT BE NEGATIVE.
	 * */
	static void work(int workers) {
		assert workers >= 0 : "READ THE FUCKING MANUAL";
		
		assert false: null;
		assert false: false; 
		assert false: true;
		assert false: 123;
		
		// code critique ....
		System.out.println("critical code");
	}
}


public class Assertions {	
	
	public static void main(String[] args) {
		try {
			assert false: true;
		} catch(AssertionError e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		
		try {
			System.out.println(1/0);
		} catch(Exception e) {
			System.out.println(e.getCause());
		}
	}
	
	// -ea : enable assertions JVM argument
	public static void main3(String[] args) {		
		System.out.println("A");
		MyLib.work(-1); 
		System.out.println("B");
		
		try {
			
		}catch(AssertionError e) {
			System.out.println(e.getMessage()); // "READ THE FUCKING MANUAL"
		}
	}
	
	public static void main2(String[] args) {
		Long speedOfLight = 1_000_000_000_000_000l;				
		assert speedOfLight < 3_000_000l : "Impossible !!!";			
		
	}
	
}
