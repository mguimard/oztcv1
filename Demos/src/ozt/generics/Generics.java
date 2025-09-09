package ozt.generics;

import java.util.Arrays;
import java.util.List;

class Truc{}

class Boite<Truc> {
	
	void add(Truc t) {
		// ...
	}
	
	void remove(Truc t) {
		// ....
		String s = "hello";
	}
	
}

class BoiteBizarre<String>{
	void f() {
		// String s = "hello";
		
		
	}
}

class Pizza{}

public class Generics {
	public static void main(String[] args) {
		
		String s = "hello";
		
		List<String> strings = Arrays.asList("melon", "pizza");
		
		Boite<Pizza> pizzas = new Boite<>();
		pizzas.add(new Pizza());
	}
}
