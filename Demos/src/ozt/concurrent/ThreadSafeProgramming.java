package ozt.concurrent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

class Pizza{
	int nombreIngredients = 0;	
	
	synchronized void ajouteIngredient() {
		this.nombreIngredients = this.nombreIngredients + 1;
	}
	
	AtomicInteger nombreIngredientsAtomic = new AtomicInteger(0);
}

public class ThreadSafeProgramming {

	public static void main(String[] args) throws InterruptedException {
		
		Pizza p = new Pizza();
		
		Callable<Void> cuisinier = () -> {
			//System.out.println("J'ajoute un ingrédient");
			 p.nombreIngredients = p.nombreIngredients + 1; // pas bien
			// p.ajouteIngredient(); // bien
			p.nombreIngredientsAtomic.getAndIncrement();
			return null;
		};
		
		List<Callable<Void>> cuisiniers = new ArrayList<>();
		
		int n = 100;
		
		for(int i = 0; i < n; i++) {
			cuisiniers.add(cuisinier);
		}
		
		ExecutorService cuisine = Executors.newFixedThreadPool(n);
		
		cuisine.invokeAll(cuisiniers);
		
		System.out.println(p.nombreIngredients);
		System.out.println(p.nombreIngredientsAtomic);
		
	}
	
}
