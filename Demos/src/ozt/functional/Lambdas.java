package ozt.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

@FunctionalInterface
interface MyConsumer {
	void f(Object o);

	default void g() {
	}

	default void h() {
	}
}

@FunctionalInterface
interface TriConsumer<T, U, V> {
	void accept(T t, U u, V v);
}

@FunctionalInterface
interface MyPredicate {
	boolean test(Integer i);
}

class Pizza {
	private String name;

	Pizza(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}



class MyPrinter { 
	static void Print(Object o) {
		System.out.println(o); // 
	}
}

public class Lambdas {
	
	public static void main(String[] args) {
		
		List<Pizza> pizzas = Arrays.asList(
				new Pizza("Reine"),
				new Pizza("saumon"), 
				new Pizza("saumon")
		);
		
		Map<String, List<Pizza>> pizzasByName = pizzas.stream()
			.collect(Collectors.groupingBy(Pizza::getName));		
		
		pizzasByName.forEach((key, pizzaList) -> {
			
		});
		
		
		pizzas.stream()
			.collect(Collectors.groupingBy(Pizza::getName))
			.forEach((k,v)->{});
		
		
		System.out.println(pizzasByName);
		
		pizzas.forEach(System.out::println);		
		pizzas.forEach(MyPrinter::Print);		
	}

	public static void main8(String[] args) {
		UnaryOperator<Integer> times2 = i -> i * 2;
		UnaryOperator<Integer> minus1 = i -> i - 1;

		Function<Integer, Integer> times2AndMinus1 = times2.andThen(minus1); // times 2 avant minus 1

		Integer result = times2AndMinus1.apply(2);
		System.out.println(result);

		Function<Integer, Integer> minus1AndTimes2 = times2.compose(minus1); // minus 1 avant times 2

		result = minus1AndTimes2.apply(2);
		System.out.println(result);
	}

	public static void main6(String[] args) {
		List<Integer> ints = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));

		UnaryOperator<Integer> times2 = i -> i * 2;

		ints.replaceAll(times2);

		System.out.println(ints);

		BinaryOperator<Integer> add = (a, b) -> a + b;

		Integer c = add.apply(1, 2);

		Predicate<Integer> estPair = i -> i % 2 == 0;
		estPair.test(12);
	}

	public static void main5(String[] args) {

		Function<Integer, Boolean> estPair = i -> i % 2 == 0;
		BiFunction<Integer, Long, Boolean> equals = (i, l) -> i == l.intValue();

		estPair.apply(123);
		equals.apply(12, Long.valueOf(123));

	}

	public static void main4(String[] args) {
		Predicate<Integer> estPair = i -> i % 2 == 0;
		Predicate<Integer> estSuperieurA2 = i -> i > 2;

		Predicate<Integer> estPairEtSuperieurA2 = estPair.and(estSuperieurA2);
		Predicate<Integer> estImpairEtInfOuEgalA2 = estPairEtSuperieurA2.negate();
	}

	public static void main3(String[] args) {
		List<Integer> ints = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6));

		ints.removeIf(i -> i > 5);

		Predicate<Integer> testSuperieurA5 = (i) -> i > 5;
		ints.removeIf(testSuperieurA5);

		ints.removeIf(new Predicate<Integer>() {
			@Override
			public boolean test(Integer i) {
				return i > 5;
			}
		});

	}

	public static void main2(String[] args) {
		System.out.println("Hello");
		// void f(Object)

		MyConsumer c = (Object o) -> {
			// ...
		};

		Supplier<String> cuisinier = () -> "saumon";
		cuisinier.get();

		Consumer<String> kevin = (pizza) -> {
			System.out.println("Miam");
		};

		kevin.accept("chorizo");

		BiConsumer<String, Integer> jeanKevin = (pizza, n) -> {

		};

		jeanKevin.accept("pizza", 12);

		TriConsumer<String, Integer, Boolean> gege = (pizza, n, b) -> {
			// ....
		};

		passFunction(cuisinier);

	}

	static void passFunction(Supplier<String> s) {

	}
}
