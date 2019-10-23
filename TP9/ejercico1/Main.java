package ejercico1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		System.out.println("Ingrese la longitud del arreglo de numeros: ");
		int longitud= sc.nextInt();
		//Se crea el arreglo
		Numero[] numeros= new Numero[longitud];
		//Se carga el arreglo
		for (int i = 0; i < longitud; i++) {
			System.out.println("Ingrese el numero deseado: ");
			Double numero=sc.nextDouble();
			if (numero - numero.intValue()==0.0) {
				numeros[i]=new Numero(numero.intValue());
			}else{
				numeros[i]=new Numero(numero.doubleValue());
			}
		}
		int salir=1;
		while(salir!=0) {
			Menu.menuPrincipal(numeros);
			System.out.println("\nVolver a elegir: si 1 / no 0");
			salir=sc.nextInt();
		}
	}

}
