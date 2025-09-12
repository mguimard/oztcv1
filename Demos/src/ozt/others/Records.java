package ozt.others;

class Animal{
	String name;
	
	public Animal(String name) {
	
	}
}

interface PeutManger {
	void mange();
}

record User(String name, int age, boolean enabled) implements PeutManger{
	
	static final String nourriture = "Pizza";
	static int a = 0;
	
	@Override
	public void mange() {
		// ...		
	}
	
	void f() {}
}

public class Records {		
	public static void main(String[] args) {
		
		User u = new User("alice", 22, true);
		User v = new User("alice", 22, true);
		
		System.out.println(u == v);
		System.out.println(u.equals(v));
		
		System.out.println(u);
		
		System.out.println(u.name());
		System.out.println(u.age());
					
	}
}
