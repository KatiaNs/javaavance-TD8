package fr.dauphine.javaavance.td8;

import java.util.Arrays;
import java.util.List;

public class Main4 {

	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("C", "rc");
		List<StringBuilder> l2 = Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1 = fusion(l1,l2);
		List<?> r2 = fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);

	}

	private static <T> List<T> fusion(List<? extends T> l1, List<? extends T> l2) {
		// TODO Auto-generated method stub
		return null;
	}


}
