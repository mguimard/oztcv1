package ozt.generics;

import java.util.ArrayDeque;

public class Dequeues {

	public static void main(String[] args) {
		
		
		
		
		
		
		ArrayDeque<Integer> d = new ArrayDeque<>();
		
		
		d.push(1);
		d.push(2);
		d.push(3);
		d.push(4);
		
		// [4,3,2,1]
		
		// [true,  false, true, false]
		// pop = true  [false, true, false]
		// peek = false [false, true, false]
		
		
		d.push(1);
		d.push(2);
		
		System.out.println(d);
		
		Integer x = d.poll(); // removes + retrieves head
		
		System.out.println(x); // 2
		System.out.println(d); // [1]
		
		d.push(2); // [2, 1]
		
		Integer y = d.pop();

		System.out.println(x); // 2
		System.out.println(d); // [1]
		
		d.removeIf(i -> i % 2 == 1);
		
	}

}
