package arrayEjercicios;

import java.util.Locale;

public class Ejercicio2 {

public static void pintarArray(int [] array) {
		
		for (int i=0 ; i< array.length; i++) {
			
			if (i==array.length-1)
				System.out.format(Locale.ENGLISH, "|%4d|", array[i]);
			else
				System.out.format(Locale.ENGLISH, "|%4d", array[i]);
		
		}
		System.out.println();
	
	}	
	

	
	
	public static void main(String[] args) {
	
		int [] num = new int [12];
		
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		pintarArray(num);
		
	}

}
