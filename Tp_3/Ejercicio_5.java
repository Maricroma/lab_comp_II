package Tp_3;

import java.util.Scanner;

public class Ejercicio_5 {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];          //Se crea una matriz de 3x3
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0;i<matriz.length;i++) {
			  for(int j=0;j<matriz.length;j++) {   //Se pide al usuario que ingrese los valores
				  System.out.println("Ingrese un número: ");
				  matriz[i][j] = entrada.nextInt();
			  }
		}
		
		System.out.println("MATRIZ con valores desordenados: ");
		for (int[] arreglo : matriz) {
			for (int numero : arreglo) {                   //Se muestran los valores almacenados
				System.out.println(numero);
			}
		}
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz.length; j++) {
				for(int k=0; k<matriz.length; k++) {
					for(int m=0; m<matriz.length; m++) {     //Se ordenan valores de mayor a menor con metodo burbuja
						if(matriz[i][j] > matriz [k][m]) {
							int aux = matriz[i][j];
							matriz[i][j] = matriz[k][m];
							matriz[k][m] = aux; 
						}
					}
				}
			}
		}
		
		System.out.println("MATRIZ con valores ordenados: ");
		for (int[] arreglo : matriz) {
			for (int numero : arreglo) {                   //Se muestran los valores almacenados
				System.out.println(numero);
			}
		}
	}
}


