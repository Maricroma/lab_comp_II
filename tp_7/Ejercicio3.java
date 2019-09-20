package tp_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int numero;
		boolean opcion = false;
		
		do {
			Scanner sc = new Scanner(System.in);
			try {
				System.out.println("Ingrese un número: ");
				numero = sc.nextInt();
				
				if(numero%2 == 0) {
					System.out.println("\nEl número ingresado es par.");
				}
				else {
					System.out.println("\nEl número ingresado es impar.");
				}
				opcion = true;
			} catch (InputMismatchException e) {
				// TODO: handle exception
				System.out.println("El valor introducido no es numérico.");
			}
		}while(!opcion);
		
		System.out.println("El programa se cerrará.");
	}

}


