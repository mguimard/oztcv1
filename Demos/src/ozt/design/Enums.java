package ozt.design;

enum Lights {
	ON, OFF;
	
	boolean state = false;
	
	Lights(){
		if(state) {
			// ...
		}
	}
	
	void f() {}
	
}

enum MyEnum{
	A, B, C, TRUE, FALSE; 
	
	MyEnum (){
		System.out.println("coucou");
	}
}

enum MySuperEnum{
	A("coucou"), B("bybye");
	
	MySuperEnum(String s) {	
		// ....
		// if else....
	}
}


public class Enums {
	public static void main(String[] args) {
		
		MyEnum e = MyEnum.A;
		System.out.println(e);
		
		Lights l = Lights.ON;
		l.f();
		
	}
}
