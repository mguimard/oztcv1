package ozt.design;

abstract class Idee {	
	Idee(String topic){}
}

abstract class User{	
	abstract void f();
}

@FunctionalInterface
interface PeutSauter {
	/* ??? */ public abstract void saute();
}

class Kangourou implements PeutSauter{
	@Override
	public void saute() {
		
	}
}

public class Anonymous {
	public static void main(String[] args) {
		
		Idee i = new Idee("travailler") {
			
		};
		
		PeutSauter lapin = () -> {
			System.out.println("boing");
		};		
		
		PeutSauter grenouille = new PeutSauter() {			
			@Override
			public void saute() {
				// TODO Auto-generated method stub
				
			}
		};
		
		User u = new User() {
			@Override
			void f() {
				// ...
			}
		};
		
		System.out.println(u);
		
	}
}
