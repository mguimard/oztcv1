package ozt.design;

/*
 * public
 * protected
 * package friendly (pas de mot clé)
 * private 
 * */

/*
final class Dog {}
class Labrador extends Dog{}*/
//class SuperString extends String{}

abstract class Kebab{
	abstract int getPrix();
	
	public String toString() {
		return "kebab";
	}
}

class A {
	public void f1() {}
	protected void f2() {}
	void f3() {}
	private void f4() {}
}

class B extends A {
	@Override
	public void f1() {
		// TODO Auto-generated method stub
		super.f1();
	}
	
	@Override
	protected void f2() {
		// TODO Auto-generated method stub
		super.f2();
	}
	
	@Override
	public void f3() {
		// TODO Auto-generated method stub
		super.f3();
	}
	
	void f4() {
		// TODO Auto-generated method stub

	}
}



public class Visibility {	
	public static void main(String[] args) {
		
		// private int i = 12;
		
		
		
	}
}
