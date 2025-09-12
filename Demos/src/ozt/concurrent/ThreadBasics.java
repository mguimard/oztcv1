package ozt.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@FunctionalInterface
interface DoSomething {
	void doIt();
}

/*
 * race condition
 * famine
 * deadlock
 * livelock
 * 
 * */


public class ThreadBasics {

	public static void sleep(int n) {
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(8);

		Runnable c = () -> {
			System.out.println("T");	
			sleep(1000);
		};

		Future<?> f1 = es.submit(c); // toujours pas bloquant		
		f1.get(); // bloque
		
		Future<?> f2 = es.submit(c); // toujours pas bloquant		
		f2.get(); // bloque
		
		System.out.println("Fin de programme");
	}

	public static void main7(String[] args) {

		ExecutorService es = Executors.newVirtualThreadPerTaskExecutor();
		
		try(es){

			Runnable c = () -> {
				System.out.println("I am a thread: " + Thread.currentThread().threadId());
				sleep(1000);
				System.out.println("J'ai fini");
			};

			es.submit(c);
			es.submit(c);
			es.submit(c);
			es.submit(c);

			System.out.println("Fin de programme");
		}

	}
	
	public static void main6(String[] args) {

		ExecutorService es = Executors.newFixedThreadPool(8);

		Runnable c = () -> {
			System.out.println("I am a thread: " + Thread.currentThread().threadId());
			sleep(1000);
			System.out.println("J'ai fini");
		};

		es.submit(c);
		es.submit(c);
		es.submit(c);
		es.submit(c);

		System.out.println("Fin de programme");
	}

	public static void main5(String[] args) {

		ExecutorService es = Executors.newSingleThreadExecutor();

		Runnable c = () -> {
			System.out.println("I am a thread: " + Thread.currentThread().threadId());
			sleep(1000);
		};

		es.submit(c);
		es.submit(c);
		es.submit(c);
		es.submit(c);

		System.out.println("Fin de programme");
	}

	public static void main4(String[] args) {

		// Attention, exec sur thread principal

		DoSomething d = () -> {
			System.out.println("Hello");
		};

		d.doIt();

		Runnable c = () -> {
			System.out.println("I am a thread: " + Thread.currentThread().threadId());
		};

		c.run();

	}

	public static void main3(String[] args) throws InterruptedException {

		Thread t = new Thread() {
			public void run() {
				System.out.println("A");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {

				}
				System.out.println("B");
			}
		};

		System.out.println("C");
		t.start();
		t.join();
		System.out.println("D");
	}

	public static void main2(String[] args) throws InterruptedException {
		System.out.println("A - Je suis le thread: " + Thread.currentThread().threadId());

		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println("B - Je suis le thread: " + Thread.currentThread().threadId());
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				System.out.println("D - Je suis le thread: " + Thread.currentThread().threadId());
			}
		};

		t1.start();
		t2.start();

		Thread.sleep(1000);

		System.out.println("C - Fin de programme");
	}
}
