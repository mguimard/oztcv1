package ozt.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListStudy {
	
	public static void main(String[] args) {
		
		List<String> fruits = new ArrayList<>(Arrays.asList("melon", "lemon", "apple"));
		
		for(int i = 0; i < fruits.size(); i++) {
			//..
		}
		
		/*
		for(String s : fruits) { 
			if(s.startsWith("m")) {
				fruits.remove(s); // java.util.ConcurrentModificationException
			}
		}
		*/
		
		Iterator<String> it = fruits.iterator();
		
		while(it.hasNext()) {
			String s = it.next();
			if(s.startsWith("m")) {
				// fruits.remove(s); // java.util.ConcurrentModificationException
				it.remove();
			}
		}
		
		System.out.println(fruits);
		
	}
	
	public static void main3(String[] args) {		
		List<Integer> ints = new ArrayList<>(Arrays.asList(4,5,6));
		ints.add(4);	
		ints.remove(null);
		ints.remove(Integer.valueOf(22)); // remove(Object o)
		ints.remove(6);		  		     // remove(int index)
		System.out.println(ints.size());
	}
	
	public static void main2(String[] args) {		
		List<Integer> ints = Arrays.asList(1, 2, 3);		
		ints.set(0, 1);
		
		ints.add(4); // BOOM UnsupportedOperationException 
		
		System.out.println(ints.size()); // 4		
	}
}
