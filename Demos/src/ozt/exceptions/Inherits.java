package ozt.exceptions;

// checked
class VehiculeException extends Exception{}
class PasDEssenceException extends VehiculeException{}

interface PeutAvancer {
	/* public abstract */ void avance() throws VehiculeException;
}

abstract class Vehicule{
	abstract void demarre() throws VehiculeException;
}

class Voiture extends Vehicule implements PeutAvancer {	
	@Override
	void demarre() throws PasDEssenceException {// baisse le niveau d'exception		
	}	
	
	@Override
	public void avance() {// baisse le niveau d'exception
	}
}

class Velo extends Vehicule {
	@Override
	void demarre() {
	}
}

public class Inherits {

	public static void main(String[] args) {
		Vehicule twingo = new Voiture();		
		try {
			twingo.demarre();
		} catch (VehiculeException e) {
		}
		
		Voiture twingo2 = new Voiture();
		try {
			twingo2.demarre();
		} catch (PasDEssenceException e) {
		}
		
		Velo v = new Velo();
		Vehicule v2 = (Vehicule) v;
		v.demarre();
		
		try {
			v2.demarre();
		} catch (Exception e) {
		}
		
		PeutAvancer tesla = new Voiture();
		try {
			tesla.avance();
		} catch (VehiculeException e) {

		}
		
	}
	
}
