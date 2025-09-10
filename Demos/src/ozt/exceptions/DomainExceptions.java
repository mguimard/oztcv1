package ozt.exceptions;


class EnfantException extends Exception {	
	private String message;
	
	public EnfantException(String message) {
	}
	
	public void f() {}
}

class EnfantAFaimException extends EnfantException {
	EnfantAFaimException(){
		super("Peu importe le message");
	}
	
	@Override
	public void f() {		
		super.f();
	}
}

class EnfantPasContentException extends EnfantException {
	public EnfantPasContentException() {
		super("Coucou");
	}
}

class MyRException extends RuntimeException{} // unchecked

public class DomainExceptions {
	
	public static void main(String[] args) {
		g();
	}
	
	static void g() throws MyRException {
		// ...
	}
	
	public static void main2(String[] args) {

		try {
			jouer();
		} catch (EnfantException e) {

		}

		try {
			jouer();
		} catch (EnfantAFaimException | EnfantPasContentException e) {

		} catch (EnfantException e) {
			// should not happen
		}

		try {
			jouer();
		} catch (EnfantAFaimException e) {

		} catch (EnfantPasContentException e) {

		} catch (EnfantException e) {
			// should not happen
		}
	}

	static void jouer() throws EnfantException {
	}
}
