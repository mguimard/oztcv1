package ozt.exceptions;

class C implements AutoCloseable {
	void f() {
		System.out.println("A");
		System.out.println(1 / 0); // BOOOM AritmethicException
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("B");
		throw new Exception("Peut pas fermer pour x raison !");
	}
}
public class Suppressed {
	
	public static void main(String[] args) {
		
		try(C c = new C()){			
			c.f();
			System.out.println("C");
			// c.close()			
		} 
		catch(Exception e) {
			System.out.println("D");
			System.out.println(e.getMessage());
			
			for(Throwable suppressed : e.getSuppressed()) {
				System.out.println(suppressed.getMessage());
			}
		}
	}

}
