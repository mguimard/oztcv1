package ozt.generics;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Voiture {
	String model;

	Voiture(String model){
		this.model = model;
	}

	@Override
	public int hashCode() {
		return Objects.hash(model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Voiture other = (Voiture) obj;
		return Objects.equals(model, other.model);
	}
	
	
}

public class HashSets {
	
	public static void main(String[] args) {
		Set<Integer> ints = new HashSet<>();
		ints.add(Integer.valueOf(123));
		ints.add(Integer.valueOf(123));
		System.out.println(ints.size());
	}
	
	
	public static void main3(String[] args) {		
		Set<Voiture> voitures = new HashSet<>();
		
		voitures.add(new Voiture("306"));
		voitures.add(new Voiture("306"));
		
		System.out.println(voitures.size()); // 1	
	}
	
	public static void main2(String[] args) {
		
		Set<String> pizzas = new HashSet<>();	// null possible	
		
		pizzas.add(null);
		pizzas.add(null);
		pizzas.add(null);
		
		pizzas.add("saumon");
		pizzas.add("saumon");
		
		System.out.println(pizzas);
		
		for(String p : pizzas) {
			System.out.println(p);
		}
		
	}
}

