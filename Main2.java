package fr.dauphine.javaavance.td8;

import java.util.Arrays;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		List<?> list = Arrays.asList("foo", "toto");
		// Exercice 2 -- 1- method print does not compile because we specified in the method
		// the type of List object, but in the main, we specified it with a String 
		print(list);

		List<String> list2 = Arrays.asList("foo", "toto");
		print2(list2);


	}


	private static void print(List<?> list) {
		for(Object o: list)
			System.out.println(o);
	}

	private static void print2(List<? extends CharSequence> list) {
		int count = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) != null) {
				count = list.get(i).length();
				System.out.println(list.get(i) + ": " + count);
			}
			
		}
	}



}
