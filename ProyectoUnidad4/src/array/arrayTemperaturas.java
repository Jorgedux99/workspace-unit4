package array;

import java.util.Locale;

public class arrayTemperaturas {

	public static void pintarArray(double [] array) {
		
		for (int i=0 ; i< array.length; i++) {
			
			if (i==array.length-1)
				System.out.format(Locale.ENGLISH, "|%-4.2f|", array[i]);
			else
				System.out.format(Locale.ENGLISH, "|%-4.2f", array[i]);
		
		}
		System.out.println();
	
	}	
	
	public static void rellenarConUnos(double[] array ) {
		
		
		
		for (int i=1 ; i< array.length; i++) {
			
			array[i] = 1.0;
			
		}
		
	}
	
	public static void main(String[] args) {
		
		double [] temperatures = new double [10];
		
		System.out.println("Longitud del array siempre uno más que el indice: " + temperatures.length);
		
			
		pintarArray(temperatures);
		
		rellenarConUnos(temperatures);
		
		pintarArray(temperatures);
		
	}

}
