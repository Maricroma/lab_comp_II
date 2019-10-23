package ejercico1;

import java.util.Scanner;

public class Menu {

	public static void menuPrincipal(Numero[] numeros) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese el numero correspondiente: ");
		System.out.println("   1) Sumar todos los numeros naturales.");
		System.out.println("   2) Sumar todos los numeros complejos.");
		System.out.println("   3) Listar todos los numeros naturales.");
		System.out.println("   4) Listar todos los numeros complejos.");
		int op=sc.nextInt();
		switch (op) {
		case 1:
				recorrerArreglo(numeros, op);
			break;
		case 2:
				recorrerArreglo(numeros, op);
			break;
		case 3:
				listar(numeros, op);
			break;
		case 4:
				listar(numeros, op);
	
			break;
		default:
			System.out.println("La opcion ingresada es invalida!!!.");
			break;
		}
	}
	
	private static void recorrerArreglo(Numero[] arreglo, int op) {
		double complejo=0;
		int entero=0;
		for (Numero numero : arreglo) {
			if (op==1) {
				if (numero.getEntero() !=null) {
					entero=entero+numero.getEntero();
				}
			}else {
				complejo=complejo+numero.getDouble();
			}
			
		}
		if (op==1) {
			System.out.println("La suma de los numeros enteros en el arreglo es de : "+entero);
		}else {
			System.out.println("La suma de los numeros compleos en el arreglo es de : "+complejo);

		}
		
	}
	private static void listar(Numero[] arreglo, int op) {
		for (Numero numero : arreglo) {
			if (op==3) {
				if(numero.getEntero()!=null) {
					System.out.print(numero.getEntero()+", ");
				}
			}else {
				if(numero.getDouble()!=null) {
					System.out.print(numero.getDouble()+", ");
				}

			}
		}
	}
}
