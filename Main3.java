package fr.dauphine.javaavance.td8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
		
		
		List<String> l2 = Arrays.asList("colonel", "reyel");
		System.out.println(listLength2(l2));
	}
	
	public static <T extends CharSequence> List<Integer> listLength(List<T> list) {
		ArrayList<Integer> length = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			CharSequence seq = (CharSequence)list.get(i);
			length.add(seq.length());
		}
		
		return length;
	}

	public static List<Integer> listLength2(List<? extends CharSequence> list) {
		ArrayList<Integer> length = new ArrayList<Integer>();
		
		for(int i=0; i<list.size(); i++) {
			CharSequence seq = (CharSequence)list.get(i);
			length.add(seq.length());
		}
		
		return length;
	}

}
