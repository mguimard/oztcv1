package ozt.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Animal{}
class Dog extends Animal{}

public class Wildcards {
	public static void main(String[] args) {		
		// tous les objets étendent Animal
		List<? extends Animal> animals = new ArrayList<>(); // <? extends Truc> => read only
		// animals.add(new Dog());
		
		print(Arrays.asList(new Dog(), new Dog()));
		
		List<? super Dog> objects = new ArrayList<>(); // <? super Truc> write only, que des Dog
		objects.add(new Dog());
		// objects.add(new Animal()); // KO
		
		Object o = objects.get(0);
		
		for(Object o2 : objects) {
			System.out.println(o2);
		}
	}
	
	static void print(List<? extends Animal> animals) {
		for(Animal a : animals) {
			System.out.println(a);
		}
	}
}
