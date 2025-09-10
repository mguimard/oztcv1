package ozt.exceptions;

class MyReader implements AutoCloseable {
	String name;

	MyReader(String name) {
		System.out.println("NEW " + name);
		this.name = name;
	}

	// public abstract void close() throws Exception -> checked
	public void close() {
		System.out.println("CLOSE " + name);
	}
}

public class TryWith {

	public static void main(String[] args) {
		try (MyReader r1 = new MyReader("R1"); MyReader r2 = new MyReader("R2")) {

			// r2.close()
			// r1.close();
		}
	}

	public static void main2(String[] args) {

		try (MyReader reader = new MyReader("R1")) {
			System.out.println("B");

			reader.close();
			// ...
			// reader.close();
		} finally {
			System.out.println("C");
		}

	}
}
