package ozt.design;

class E {
	void f() {}
	//String f() {};
	//void f(int i) {};	
	//void f(Skateboard s) {};
}

class F extends E {
	/*String f() {
		return "test";
	}*/
}

// f();

class Z {
	Z(){
		
		this(1233);
	}
	
	Z (int i ){
		// super()
	}
}

class Skateboard {
	static {
		// au chargement de la classe par la JVM
	}
	
	static {
		// ..
	}
	
	{
		// bloc instance (avant le new)
	}
	
	{
		// ...
	}
	
	public Skateboard() {
	
	}
}


class Velo {
	
	String model;
	
	Velo(String model){
		this.model = model;
	}
	
	 
	
	@Override
	public boolean equals(Object other) {
		
		/*if(other instanceof Velo) {
			Velo otherVelo = (Velo) other;
			return otherVelo.model.equals(model);
		}
		*/
		
		if(other instanceof Velo otherVelo) {
			return otherVelo.model.equals(model);
		}
		
		return false;
	}
}

public class ObjectInherits {
	
	public static void main(String[] args) {
	
		Object v1 = new Velo("BTWIN");
		Object v2 = new Velo("MBK");
		Object v3 = new Velo("BTWIN");
		
		System.out.println(v1 == v2); // compare références
		
		System.out.println(v1.equals(v2)); // false
		System.out.println(v1.equals(v3)); // false Object.equals ou Velo.equals?
	}
}

