package ozt.design;

import java.lang.*;

class Animal extends Object {
	Animal() {
		super();
	}
	
	void Animal(int age){} // methode
}

// new Animal(22);

// outer
class Voiture {
	
	// inner
	class BoiteDeVitesse{
		private int vitesse = 1;
	}
	
	BoiteDeVitesse b = new BoiteDeVitesse();
	
	Voiture(){}
	
	void demarre() {
		b.vitesse++;
	}
}

class Pizza {
	static int count = 0;
	
	static {
		count++;
	}	
		
	Pizza(int prix){}
}


public class Main {
	public static void main(String[] args) {
		Pizza p2 = new Pizza(123);
		
		System.out.println("Hello Java");
		Animal a = new Animal();		
		System.out.println(a);
		
		Object b = null;		
		Animal c = (Animal) b;
		System.out.println(c);
		
		Integer i = (Integer) b;
		System.out.println(i);
		
		Pizza.count++;
		System.out.println(Pizza.count);
		
		Pizza p = null;
		System.out.println(p.count);
	}
}
