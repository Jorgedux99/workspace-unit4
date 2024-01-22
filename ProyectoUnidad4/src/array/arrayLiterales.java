package array;

import java.util.Locale;

public class arrayLiterales {

public static void pintarArrayEnteros(int [] array) {
		
		for (int i=0 ; i< array.length; i++) {
			
			if (i==array.length-1)
				System.out.format(Locale.ENGLISH, "|%-4d|", array[i]);
			else
				System.out.format(Locale.ENGLISH, "|%-4d", array[i]);
		
		}
		System.out.println();
	
	}	
	
public static void pintarArrayEnteros(int [] array, int numFinal) {
	
	for (int i=0 ; i< array.length && array[i]!= numFinal; i++) {
		
		if (i==array.length-1)
			System.out.format(Locale.ENGLISH, "|%-4d|", array[i]);
		else
			System.out.format(Locale.ENGLISH, "|%-4d", array[i]);
	
	}
	System.out.println();

}	

public static void pintarArrayCadenas(String [] array, String cadFinal) {
	
	for (int i=0 ; i< array.length && array[i]!= cadFinal; i++) {
		
		if (i==array.length-1)
			System.out.format(Locale.ENGLISH, "|%-20S|", array[i]);
		else
			System.out.format(Locale.ENGLISH, "|%-20S", array[i]);
	
	}
	System.out.println();

}	

public static void pintarArrayCadenas(String [] array) {
	
	for (int i=0 ; i< array.length; i++) {
		
		if (i==array.length-1)
			System.out.format(Locale.ENGLISH, "|%-20S|", array[i]);
		else
			System.out.format(Locale.ENGLISH, "|%-20S", array[i]);
	
	}
	System.out.println();

}	
	
	public static void main(String[] args) {
		
		int [] arrayDias = {1,2,3,4,5,6,7};
		
		int [] arrayDias2 = new int[4];
		
		pintarArrayEnteros(arrayDias);

	}

}
