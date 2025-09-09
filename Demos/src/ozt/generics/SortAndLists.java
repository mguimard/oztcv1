package ozt.generics;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Processeur implements Comparable<Processeur> {
	int Ghz;

	Processeur(int h) {
		Ghz = h;
	}

	@Override
	public String toString() {
		return Ghz + "";
	}
	
	@Override
	public int compareTo(Processeur other) {

		if(other != null && other instanceof Processeur p) {
			return Ghz - p.Ghz; // ASC
		}
				
		return 0;
	}
	
}

class Cat{}

public class SortAndLists {

	
	public static void main(String[] args) {
		
		NavigableMap<Integer, String> pizzas = new TreeMap<>((a,b) -> b-a);
		
		pizzas.put(3, "Chorizo");
		pizzas.put(2, "Saumon");
		pizzas.put(1, "Reine");
		
		pizzas.putIfAbsent(3, "4 fromages");
		
		System.out.println(pizzas); // ??
		
	}
	
	
	public static void main6(String[] args) {
		
		TreeSet<Integer> ints = new TreeSet<>();
		
		ints.add(3);
		ints.add(2);
		ints.add(1);
		ints.add(3);
		
		System.out.println(ints); // [1,2,3]
		
		System.out.println(ints.headSet(2, true)); // [1,2]
		System.out.println(ints.tailSet(2, true)); // [2, 3]
		
	}
	
	
	public static void main5(String[] args) {		
		//Set<Cat> cats = new TreeSet<>();
		//cats.add(new Cat()); // (Comparable) c -> ClassCastException
		Set<Cat> cats = new TreeSet<>((a,b) -> (int) Math.random() * 1000);
		cats.add(new Cat());
	}	
	
	public static void main4(String[] args) {

		List<Processeur> procs = Arrays.asList(new Processeur(3), new Processeur(2), new Processeur(1));
		// procs.sort(null); // (Comparable) p -> ClassCastException

		procs.sort((p1, p2) -> p1.Ghz - p2.Ghz); // ASC
		System.out.println(procs); //

		procs.sort((p1, p2) -> p2.Ghz - p1.Ghz); // DESC
		System.out.println(procs); //
		
		procs.sort(null); 
		System.out.println(procs);

	}

	public static void main2(String[] args) {
		List<Integer> ints = Arrays.asList(3, 2, 1);
		ints.sort(null);
		System.out.println(ints); // [1,2,3]

		ints.sort((a, b) -> a - b);
		System.out.println(ints);

		ints.sort((a, b) -> b - a);
		System.out.println(ints);
	}
}
