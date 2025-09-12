package ozt.concurrent;

import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;


// RecursiveAction (Runnable mais forkable)
// RecursiveTask<T> ( Callable<T> mais forkable)

// [.............. 5000000000 .... ]
// [..............] [..............]
// [......][......] [......][......]
// 

class MySuperCalculator extends RecursiveAction {
	
	int getResult() { return 0;}
	
	MySuperCalculator(int [] arr, int from, int to){
		
	}
	
	
	@Override
	protected void compute() {		
		// if(arr.length <= 10000)
		// work.... and return
		// else fork !
		/*var m1 = new MySuperCalculator(arr, newFrom, newTo);
		m1.fork();
		
		var m2 = new MySuperCalculator(arr, newFrom, newTo);
		m2.fork();
		m1.join();
		m2.join();*/
	}
}


public class Tasks {
	public static void main(String[] args) {
		int[] arr = new int[1_000_000];
		
		MySuperCalculator m = new MySuperCalculator(arr, 0, arr.length);
		m.getResult();// ...
	}
}
