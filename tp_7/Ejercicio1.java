package tp_7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		int numero;
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Ingrese un n�mero: ");
			numero = sc.nextInt();
			
			if(numero%2 == 0) {
				System.out.println("\nEl n�mero ingresado es par.");
			}
			else {
				System.out.println("\nEl n�mero ingresado es impar.");
			}
		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("El valor introducido no es num�rico.");
		}
		sc.close();           //se utiliza para cerrar la variable scanner
		System.out.println("El programa se cerrar�.");
		

	}

}
