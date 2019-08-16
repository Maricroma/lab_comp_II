package TP2;

import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String[] args) {
		int[] enteros = new int [10];
		int negativos = 0;
		int positivos = 0;
		int ceros = 0;
		Scanner entrada = new Scanner (System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("Ingrese un número entero: ");
			enteros[i] = entrada.nextInt();
			
			if(enteros[i] > 0) {
				positivos++;
			}
			else if(enteros[i] < 0) {
				negativos++;
			}
			else {
				ceros++;
			}
		}
		
		System.out.println("\nEn el arreglo hay "+positivos+" números positivos, "+negativos+" números negativos y "+ceros+" -1ceros");
	}

}
