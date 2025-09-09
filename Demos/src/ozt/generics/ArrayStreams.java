package ozt.generics;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayStreams {
	
	public static void main(String[] args) {
		
		Arrays.asList("alice", "bob").stream().forEach(s -> System.out.println(s));
		Arrays.asList("alice", "bob").stream().forEach(System.out::println);
		
		Arrays.asList(1,2,3).forEach(System.out::println);
		Arrays.asList(1,2,3).stream().forEach(System.out::println);	
	
		Stream<Integer> s = Arrays.asList(1,2,3).stream();		
		s.forEach(System.out::println); // stream terminé		
		System.out.println(s.count()); // boom IllegalStateException
		
	}
	
}
