package ozt.exceptions;

enum MyEnum {
	A, B, C
}

public class Wrappers {

	static Integer i; // null
	static Boolean b; // null

	public static void main(String[] args) {
		
		Object o = i;
		Double d = (Double) o; // ??????
		System.out.println(d);		
		
		String[] arr = null;
		for(String x : arr){}
 		
		String s  = null;
		
		switch(s) {
			case null: System.out.println("test");break;
			default: break;
		}

		MyEnum e = null;		

		switch (e) {
		case A: {
			System.out.println("A");
		}
		default:
			System.out.println("B");
		}

		if (b) { // BOOOM NPE
			System.out.println("never happens");
		}

		if (i > 2) { // BOOOM NPE
			System.out.println("A");
		} else {
			System.out.println("B");
		}

		if (i.intValue() > 2) {

		}

	}
}
