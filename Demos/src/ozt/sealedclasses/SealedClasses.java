package ozt.sealedclasses;

// sealed
// non-sealed
// permits = autorise et oblige


// meme fichier, permits non obligatoire
sealed interface I{}

sealed class A {
	// class C extends A{} // KO
}
final class B extends A implements I{}

sealed class Shape permits Rectangle, CustomRectangle{}
final class Rectangle extends Shape{}
non-sealed class CustomRectangle extends Shape{}

sealed interface PeutManger permits Animal {
	void mange();
}

sealed class Animal implements PeutManger permits Dog, Cat{
	@Override
	public void mange() {			
	}
}

final class Cat extends Animal{}
sealed class Dog extends Animal permits Labrador, Chihuahua {}

final class Labrador extends Dog{} // sealed, non-sealed, final
non-sealed class Chihuahua extends Dog{}

class Velo extends Chihuahua{}

public class SealedClasses {

	public static void main(String[] args) {	
		
		
	}
	
}
