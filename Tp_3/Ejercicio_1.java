package Tp_3;

import java.util.Random;

public class Ejercicio_1 {

	public static void main(String[] args) {
		int[] numeros = new int[100];                       //Se crea un array de 100 elementos
		Random randomizer = new Random(System.nanoTime()); 

		for(int i=0;i<numeros.length;i++) {
		numeros[i] = randomizer.nextInt(numeros.length);    //Se guardan valores aleatorios entre 1 y 100 no repetidos
		}
		
		System.out.println("Los valores almacenados son: ");

		for(int num:numeros) {                          //Con un bucle for each se muestran los valores
		System.out.println(num+" ");

		}
	
	}	
}
