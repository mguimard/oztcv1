package ozt.others;

class Pizza {
}

class Dog {
}

public class PatternMatching {

	public static void main(String[] args) {

		Object o = new Pizza();

		if (o instanceof String) {
			// ..
		}
		// else if ....

		String s = switch (o) {
		case String str -> "un string";
		case Dog d -> "un dog";
		case Pizza p -> "une pizza";
		default -> "inconnu";
		};

		System.out.println("o est " + s); //

		Object o2 = "Je suis une string qui finit par un E";

		boolean match = switch (o2) {
		case String st when st != null && st.endsWith("E") && f() -> true;
		case String st when st != null && st.endsWith("E") -> false;
		case String st when st != null && st.endsWith("E") -> false;
		case String st when st != null && st.endsWith("E") -> false;

		default -> false;
		};

		System.out.println(match);

		Object o3 = null;

		match = switch (o3) {
		case null -> true;
		case String st when st != null && st.endsWith("E") && f() -> true;
		default -> false;
		};
		
		
		
	}

	static boolean f() {
		return true;
	};
	
	boolean g(int i ) {
		return switch(i) {
			case 0 -> true;
			default -> false;
		};
	}

	public static void main5(String[] args) {

		String s = "whatever";

		int i = switch (s) {
		case "hello":
			yield 1;
		default:
			yield 2;
		case "whatever":
			yield 3;
		};

		System.out.println(i); // 3

		Pizza p = switch (s) {
		case "hello":
			yield new Pizza();
		default:
			yield null;
		case "whatever":
			yield new Pizza();
		};

		Pizza p2 = switch (s) {
		case "whatever" -> new Pizza();
		default -> null;
		};

		Pizza p3 = switch (s) {
		case "whatever" -> new Pizza();
		default -> throw new RuntimeException();
		};
	}

	public static void main4(String[] args) {

		// 8 bits signé
		// -128 -> 127
		byte b = 127;
		b += 1;

		switch (b) {
		case 1: // ....
			break;
		// case 132:
		// ....
		// break;
		default:
			break;
		}

	}

	public static void main3(String[] args) {

		int i = 1;

		switch (i) {
		default:
			System.out.println("default");
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");

		case 4:
			System.out.println("4");
		}

	}

	public static void main2(String[] args) {

		Object s = "hello";

		if (s instanceof String someString) {
			System.out.println(someString.toUpperCase());
		}

		if (s instanceof String) {
			System.out.println(((String) s).toUpperCase());
		}
	}
}
