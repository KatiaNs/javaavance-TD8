package fr.dauphine.javaavance.td8;

import java.util.List;
import java.util.Random;

public class Main5 {
	public static void main(String[] args) {

	}

	public static <T> void echange(List<T> list, int nb1, int nb2) {
		T temp = list.get(nb1);

		list.set(nb1, list.get(nb2));
		list.set(nb2, temp);

	}

	public static <T> void melanger(List<T> list) {
		Random rand = new Random();
		
		for(int i = 0; i< list.size(); i++) {
			int j = rand.nextInt(i);
			echange(list, i, j);
		}

	}
	
	
	public static <T> void melanger2(List<T> list) {
		Random rand = new Random();
		
		T[] o = (T[]) list.toArray();
		List list2 = new ArrayList<>();
		
		for(int i = 0; i< list.size(); i++) {
			int j = rand.nextInt(i);
			//echange(list, i, j);
			T temp = o[i-1];
			o[i-1] = o[j];
			o[j] = temp;
		}
		
		for(int i=0; i<o.length; i++) {
			list2.add(o[i]);
		}

		
	}
	
	public static <T> void melanger3(List<T> list) {
		Collections.shuffle(list);
		
	}


}
