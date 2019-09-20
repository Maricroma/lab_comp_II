package tp_7;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un n�mero entre 1 y 100: ");
		numero = sc.nextInt();
		
		try {
			Rango(numero);
		}catch (ExceptionFueraRango e) {
			System.out.println(e.getMessage());
		}

	}
	
	public static void Rango(int numero) throws ExceptionFueraRango {
		if(numero<1 || numero>100 ) {
			throw new ExceptionFueraRango("El n�mero est� fuera del rango.");
		}
		else {
			System.out.println("El n�mero ingresado es correcto.");
		}
	}

}
