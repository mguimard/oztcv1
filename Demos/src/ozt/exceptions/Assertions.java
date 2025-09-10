package ozt.exceptions;

class MyLib {
	
	/**
	 * This method blablabla
	 * @param workers : number of workers, MUST NOT BE NEGATIVE.
	 * */
	static void work(int workers) {
		assert workers >= 0 : "READ THE FUCKING MANUAL";
		
		// code critique ....
		System.out.println("critical code");
	}
}


public class Assertions {	
	
	// -ea : enable assertions JVM argument
	public static void main(String[] args) {		
		System.out.println("A");
		MyLib.work(-1); 
		System.out.println("B");
	}
	
	public static void main2(String[] args) {
		Long speedOfLight = 1_000_000_000_000_000l;				
		assert speedOfLight < 3_000_000l : "Impossible !!!";			
		
	}
	
}
