package ozt.generics;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		
		Map<Integer, String> integersNames = new HashMap<>();
		
		integersNames.put(1, "ONE");
		integersNames.put(2, "TWO");
		
		System.out.println(integersNames.size());

		integersNames.put(null, "null");	
		
		integersNames.put(42, null);
		integersNames.putIfAbsent(42, "fourty two"); // ---
		integersNames.putIfAbsent(42, "quarante deux");		
		
		System.out.println(integersNames);
		
	}

}
