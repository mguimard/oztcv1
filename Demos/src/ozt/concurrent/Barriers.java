package ozt.concurrent;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Formation implements Runnable {
	@Override
	public void run() {
		System.out.println("La formation peut démarrer");
	}
}

class Participant extends Thread {
	CyclicBarrier c;
	
	public Participant(CyclicBarrier c) {
		this.c = c;
		this.start();
	}
	
	@Override
	public void run() {
		System.out.println("Je lance firefox");
		// charge la feuille d'émargement..
		try {
			Thread.sleep((int)(Math.random() * 1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Je signe");
		// signe la feuille
		try {
			c.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class Barriers {

	public static void main(String[] args) {
		
		CyclicBarrier feuilleEmargement = new CyclicBarrier(4, new Formation());
		
		Participant Robert = new Participant(feuilleEmargement);
		Participant Nicolas = new Participant(feuilleEmargement);
		Participant Victor = new Participant(feuilleEmargement);
		Participant Morgan = new Participant(feuilleEmargement);
				
		System.out.println("Fin de programme");
		
	}
	
}
