package ozt.concurrent;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// Runnable -> void run()
// Callable<T> -> T call()

class MyThread extends Thread{
	String name;

	public MyThread(int x) {
		
	}
	
	void f(){}
}

class MyRunnable implements Runnable{

	String name;
	
	void f(){}

	public MyRunnable(int x, int y) {
	
	}

	@Override
	public void run() {
			
	}

}


public class CallableVsRunnable {
	
	public static void main(String[] args) throws InterruptedException {
	
		Callable<String> c = () -> {	
			System.out.println("T " + Thread.currentThread().threadId());	
			sleep(1000);		
			return "coucou";
		};
		
		ExecutorService es = Executors.newFixedThreadPool(1);	
		
		List<Future<String>> strings = es.invokeAll(Arrays.asList(c, c, c));
		
		es.shutdown();
		es.shutdown();
		es.shutdown();
		
		es.submit(c);
	}
	
	
	public static void main4(String[] args) throws InterruptedException, ExecutionException {
		Callable<String> c = () -> {	
			System.out.println("T " + Thread.currentThread().threadId());
			sleep((int)(Math.random() * 1000)); // 0->1s
			return "hello: " + Thread.currentThread().threadId();
		};
		
		ExecutorService es = Executors.newFixedThreadPool(2);	
		
		String s = es.invokeAny(Arrays.asList(c, c, c));
		System.out.println("Resultat: " + s);
		
	}
	
	
	public static void main3(String[] args) throws InterruptedException, ExecutionException {
		Callable<String> c = () -> {	
			System.out.println("C");
			sleep(1000); // 1s
			return "hello: " + Math.random();
		};
		
		ExecutorService es = Executors.newFixedThreadPool(2);	
		
		// invokeAll = exécute et bloque (attend la fin des exécutions)
		List<Future<String>> f = es.invokeAll(Arrays.asList(c, c, c));
		
		System.out.println(f.size()); // 3
		System.out.println(f);
		
		System.out.println(f.get(0).get());
		System.out.println(f.get(1).get());
		System.out.println(f.get(2).get());
		
		System.out.println("Fin de programme");	//	
	}

	public static void main2(String[] args) throws InterruptedException, ExecutionException {
		Runnable r = () -> {
			System.out.println("Je bosse mais ne renvoie rien");
		};
		
		Callable<String> c = () -> {
			System.out.println("Je bosse et renvoie un résultat");			
			return "hello";
		};
		
		ExecutorService es = Executors.newFixedThreadPool(2);		
		
		Future<?> f1 = es.submit(r);
		Future<String> f2 = es.submit(c);
		
		System.out.println(f1.get()); // ?
		System.out.println(f2.get()); // ?
		
		System.out.println("Fin de programme");
	}
	
	public static void sleep(int n) {
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			System.out.println("Ooops, canceled : " + Thread.currentThread().threadId());
		}
	}
	
}
