package ozt.generics;

import java.util.ArrayList;

@FunctionalInterface
interface MathOperation{
	Integer f(Integer a, Integer b);
}

@FunctionalInterface
interface MathOperation2{
	Integer f(Integer a, Integer b);
}

@FunctionalInterface
interface StringOperation{
	String f(String a, Integer b);
}

class ClassQuiAUnNomARallonge{}

public class InferenceLocale {

	public static void main(String[] args) {
		
		ClassQuiAUnNomARallonge classQuiAUnNomARallonge = new ClassQuiAUnNomARallonge();
		var classQuiAUnNomARallonge2 = new ClassQuiAUnNomARallonge();
		// classQuiAUnNomARallonge2 = "hello";
		
		var i = 123; // 32 bits signé
		byte b = 12; // 8 bits signé
		
		var var = var();
		
		var integers = new ArrayList<Integer>();
		
		StringOperation op = (x , y) -> x + y;
		
		var lambda = (MathOperation)((x , y) -> x + y);
		
		//var l = (Integer a, Integer b) -> a + b;
		
	}
	
	static String var() {
		return "var";
	}
	
}
