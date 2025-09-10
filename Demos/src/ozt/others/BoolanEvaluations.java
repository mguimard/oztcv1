package ozt.others;

public class BoolanEvaluations {
	public static void main(String[] args) {

		int i = 0;
		
		System.out.println(i++ == 0 || ++i == 1); // true || jamais exécuté
		System.out.println(i); // 1
		
		i = 0;
		
		System.out.println(i++ == 1 && ++i == 2); // false && jamais exécuté 
		System.out.println(i); // ?
		
		
		// false || toujours exec
		// true && toujours exec
		
		i = 0;
		System.out.println(i++ == 0 && i++ == 0); // vrai, i = 1 && 1 == 0
	}
}
