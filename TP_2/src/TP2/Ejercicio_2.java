package TP2;

import java.util.Scanner;

public class Ejercicio_2 {
	public static void main(String[] args) {
		int[] enteros = new int [10];
		int media = 0;
		int cant_pares = 0;
		Scanner entrada = new Scanner (System.in);
		
		for(int i=0;i<10;i++) {
			System.out.println("Ingrese un número entero: ");
			enteros[i] = entrada.nextInt(); 
		}
		
		for(int i=0;i<10;i++) {
			if(enteros[i] % 2 == 0) {
				cant_pares ++;
				media = (media + enteros[i])/cant_pares;
			}
			
		}
		
		System.out.println("La media de los números pares es "+media);
	}

}
