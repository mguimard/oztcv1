package ozt.texts;

//class MyString extends String{}

public class Strings {

	static class Animal extends Object {
		@Override
		public String toString() {
			return "miaou";
		}
	}

	public static void main(String[] args) {
		String json = """
				ABC
				Z
				""";
		System.out.println(json.strip().length());
	}

	public static void main12(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("abc");
		sb.reverse().reverse();
		System.out.println(sb.toString());
	}

	public static void main11(String[] args) {
		System.out.println(new StringBuilder().capacity());
	}

	public static void main10(String[] args) {
		StringBuilder sb = new StringBuilder(200);
		sb.append("hello");

		System.out.println(sb.toString());
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

	public static void main9(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.delete(1, 3); // inc/excl
		System.out.println(sb.toString());
	}

	public static void main8(String[] args) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb2 = sb.append("hello");
		System.out.println(sb == sb2); // true
	}

	public static void main7(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.insert(5, "e"); // Attention !
		System.out.println(sb.toString()); // ?
	}

	public static void main6(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append(" ");
		sb.append(new Animal());
		System.out.println(sb.toString());
	}

	public static void main5(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		String s = "hello";
		System.out.println(sb.toString() == sb.toString()); // false
		System.out.println(sb.toString().equals(s)); // true
	}

	public static void main4(String[] args) {

		System.out.println("  zeaeaz  ".trim());
		System.out.println("  zeaeaz  ".strip());

		String s = "hello";
		System.out.println(s == s.toString());

	}

	public static void main3(String[] args) {
		String s1 = "hello";
		String s2 = s1.replace("h", "H");

		s1.replace("h", "H");
		s1.toLowerCase();

		System.out.println(s1); //
		System.out.println(s2); //
	}

	public static void main2(String[] args) {

		String s1 = "hello";
		String s2 = "hello";

		System.out.println(s1 == s2); // true
		System.out.println(s1.equals(s2)); // true

		String s3 = new String("hello");
		System.out.println(s1 == s3); // == compare les références

		String s4 = "hel";
		s4 += "lo";
		System.out.println(s1 == s4); // ?
	}
}
