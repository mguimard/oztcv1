package ozt.exceptions;

public class InnerCatch {
	public static void main2(String[] args) {

		Object o = null;
		
		try {
			System.out.println(o.toString()); // NPE -> catch block B
			
			try {
				System.out.println(o.toString());
			} catch (NullPointerException e) {
				System.out.println("A");
			}finally {
				System.out.println("A2");
			}

		} catch (NullPointerException e) {
			System.out.println("B");
			throw e;
		} finally {
			System.out.println("B2");
		}
		
		System.out.println("C");
	}
}
