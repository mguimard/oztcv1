package ozt.functional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Animal {

	Integer age;

	Animal(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal: " + age;
	}
}

class MyException extends Exception{
	
}

public class Streams {
	
	
	public static void main(String[] args) {
		IntStream.range(10, 15).forEach(System.out::println); // 10 -14
		IntStream.rangeClosed(10, 15).forEach(System.out::println); // 10 -15
		
		OptionalInt maybeResult = IntStream.of(1,2,3,4)
			.reduce((acc, i) -> acc + i);
		
		if(maybeResult.isPresent()) {
			System.out.println(maybeResult.getAsInt());
		}
		
		
			
		//BinaryOperator<Integer> operation = (a,b) -> 12; 
	}

	public static void main8(String[] args) {		
		Optional<Animal> o = Optional.ofNullable(null);  // boom
		System.out.println(o);
		
		o = Optional.of(new Animal(1));
		System.out.println(o); // Optional[value.toString()]
		System.out.println(o.get());
	}
	
	public static void main7(String[] args) throws MyException{
		
		Optional<Animal> animalPeutLaPeutEtrePasLa = Optional.empty();
		
		if(animalPeutLaPeutEtrePasLa.isPresent())
			System.out.println(animalPeutLaPeutEtrePasLa.get());
		
		Optional<Animal> o = Optional.empty();
		
		System.out.println(o.or(() -> Optional.of(new Animal(12))).get());
		System.out.println(o.orElse(new Animal(12)));		
		System.out.println(o.orElseThrow(MyException::new));	
		
	}
	
	public static void main6(String[] args) {		
		Stream<Integer> stream = Stream.iterate(0, i -> i +1);
		stream
		.takeWhile(i -> i < 10)
		.forEach(System.out::println);		
	}
	
	public static void main5(String[] args) {
		IntStream s = IntStream.of(1, 2, 3, 4, 5, 6);
			
		List<Animal> animals = s.filter(i -> i % 2 == 0)
			.map(i -> i * 2)
			.mapToObj(Animal::new)
			.toList();			
		
	}

	public static void main4(String[] args) {
		IntStream s = IntStream.generate(() -> Integer.valueOf((int) (100 * Math.random())));
		// s.forEach(System.out::println);

		OptionalInt o = s.findFirst();

		if (o.isPresent()) {
			Integer i = o.getAsInt();
			System.out.println(i);
		}

	}

	public static void main3(String[] args) {
		Boolean b = IntStream.of(1, 2, 3).anyMatch(i -> i == 4);
		System.out.println(b);

		b = IntStream.of(1, 2, 3).noneMatch(i -> i == 4);
		System.out.println(b);

		b = IntStream.of(1, 2, 3).allMatch(i -> i == 4);
		System.out.println(b);

		System.out.println("-----");

		b = Arrays.stream(new Integer[] {}).anyMatch(i -> i == 4);
		System.out.println(b);

		b = Arrays.stream(new Integer[] {}).noneMatch(i -> i == 4);
		System.out.println(b);

		b = Arrays.stream(new Integer[] {}).allMatch(i -> i == 4);
		System.out.println(b);
	}

	public static void main2(String[] args) {

		// Stream cycle de vie
		IntStream s = IntStream.of(1, 2, 3);
		Integer somme = s.sum(); // termine
		System.out.println(somme);

		s.forEach(System.out::println);
		s.forEach(System.out::println); // IllegalStateException
	}
}
