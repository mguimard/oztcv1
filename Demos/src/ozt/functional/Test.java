package ozt.functional;

import java.util.function.Consumer;
import java.util.function.Supplier;

class Document {
	void printAuthor() {
		System.out.println("Document-Author");
	}
}

class RFP extends Document {
	@Override
	void printAuthor() {
		System.out.println("RFP-Author");
	}
}

interface StringConsumer extends Consumer<String> {
	@Override
	public default void accept(String s) {
		System.out.println(s.toUpperCase());
	}
}

public class Test {

	public static void main(String[] args) {
		
		//StringConsumer s = (x) -> {};
		
		check(Document::new);
		check(RFP::new);
	}

	private static void check(Supplier supplier) {
		supplier.get().printAuthor();
	}
}