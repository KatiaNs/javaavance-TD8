package fr.dauphine.javaavance.td8;

public class Main1 {

	public static void main(String[] args) {
		
		System.out.println(myMax(42,1664)); //1664
		System.out.println(myMax(2014,86,13)); //2014
		
		System.out.println(myMax2(8.6,16.64)); //16.64
		System.out.println(myMax2("Denis", "Cornaz")); //Denis
		//System.out.println(myMax2(8.6, "Denis")); //ne doit pas compiler !

	}

	private static int myMax(int... params) {
		int max = params[0];
		
		for(int i=0; i<params.length; i++) {
			if(params.length == 0) {
				throw new IllegalArgumentException("params is empty");
			}
			else if(params[i] > max) {
				max = params[i];
			}
		}

		return max;

	}
	
	private static <T extends Comparable<T>> T myMax2(T... params) {
		T max = params[0];
		
		for(int i=0; i<params.length; i++) {
			if(params.length == 0) {
				throw new IllegalArgumentException("params empty");
			}
			
			else if(params[i].compareTo(max) > 0) {
				max = params[i];
			}
		}
		
		return max;
		
	}

	




}
