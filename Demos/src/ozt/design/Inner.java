package ozt.design;



class X {
	class Y{
		private int a;
		
	}
	
	void f() {
		new Y();
	}
}

public class Inner {
	public static void main(String[] args) {		
		X.Y y = new X().new Y();	
		
	}
}
