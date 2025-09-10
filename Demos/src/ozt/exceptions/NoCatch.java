package ozt.exceptions;

public class NoCatch {
	public static void main(String[] args) throws Exception {
		
		try {
			System.out.println("A");
		} finally {
			System.out.println("B");
		}
		
		try {
			f();
		} finally {
			System.out.println("C");
		}
	}
	
	static void f() throws Exception {}
}
