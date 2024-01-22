package arrayEjercicios;

import java.util.Scanner;

import array.arrayLiterales;


public class Ejercicio6 {

	public static int [] leer10yGuardarEnArray () {
		
		int [] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<arr.length; i++) {
			System.out.println("Introduce un número: ");
			
			arr[i]=sc.nextInt();
			
		}
		
		arrayLiterales.pintarArrayEnteros(arr);
		
		return arr;
		
	}
	
	public static int[] leerNyGuardarEnArray(int n) {
		
		int [] arr = new int[n];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<arr.length; i++) {
			System.out.println("Introduce un número: ");
			
			arr[i]=sc.nextInt();
			
		}
		
		arrayLiterales.pintarArrayEnteros(arr);
		
		return arr;
		
		
	}
	
	public static int[] leerNyGuardarParesEnArray(int n) {
		
		int posicion = 0;
		int num = 0;
		
		int [] arr = new int[n];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i<arr.length; i++) {
			System.out.println("Introduce un número: ");
			
			num=sc.nextInt();
			
			if (num%2==0) {
				arr[posicion] = num;
				posicion++;	
			}
		}
		
		arrayLiterales.pintarArrayEnteros(arr,0);
		
		return arr;
		
		
		
	}
	
	public static String[] leerArray(int n) {
		String [] arr = new String[n];
			
			Scanner sc = new Scanner(System.in);
		
			
			for (int i = 0; i<arr.length; i++) {
				
				System.out.println("Introduce un nombre: ");
				
				arr[i] =sc.next();
				
			}
			
			arrayLiterales.pintarArrayCadenas(arr);
			
			return arr;
			
}


	
	
	
	public static void main(String[] args) {
		
		leerNyGuardarParesEnArray(1);
		
		System.out.println();
		
		leerArray(4);
		
	}
	
		
}
