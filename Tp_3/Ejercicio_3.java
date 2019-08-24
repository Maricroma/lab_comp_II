package Tp_3;

import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
		String[][] persona = new String[3][3];    //Se crea matriz para cargar datos de personas, columnas para c/ persona y filas para c/ dato
		Scanner entrada = new Scanner(System.in);
		
		for(int i=0;i<persona.length;i++) {
			System.out.println("Ingrese Nombre: ");   //Se piden los datos al usuario
			persona[i][0] = entrada.next();
			System.out.println("Ingrese DNI: ");
			persona[i][1] = entrada.next();
			System.out.println("Ingrese edad: ");
			persona[i][2] = entrada.next();
			
		}
		
		for(int i=0;i<persona.length;i++) {
			System.out.println("\n----------------\n");
			System.out.println("Nombre: "+persona[i][0]);
			System.out.println("DNI: "+persona[i][1]);     //Se muestran los datos por consola
			System.out.println("Edad: "+persona[i][2]);
			System.out.println("\n----------------\n");
		}
		
	}

}
