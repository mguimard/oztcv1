package ozt.generics;

/*
 * - Une et une seule méthode abstraite
 * 
 * */

@FunctionalInterface
interface MyFunctionalI {
	default void f() {}
	void g();
}

@FunctionalInterface
interface I{
	Double add(Integer a, Integer b);
}

public class FunctionalInterfaces {
	public static void main(String[] args) {
		
		// Object
		//   Number
		//     Double
		//     Integer
		
		// I add = (a, b) -> a + b;
		
		
		MyFunctionalI i = () -> {}; // void g()
	}
}
