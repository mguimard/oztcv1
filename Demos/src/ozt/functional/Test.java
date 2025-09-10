package ozt.functional;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
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

		Map<Integer, Integer> map = new LinkedHashMap<>();
		map.put(1, 10);
		map.put(2, 20);
		BiConsumer<Integer, Integer> consumer = (k, v) -> {
			System.out.println(k + ":" + v);
		};
		
		/*BiFunction<Integer, Integer, Void> function = (k, v) -> {
			System.out.println(k + ":" + v);
			
		};
		*/
		//map.forEach(function);

	}
}