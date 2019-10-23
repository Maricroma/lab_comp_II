package Tp8;

import java.util.Scanner;

public class Main {
	
	static Vehiculo[] vehiculos ;
	static int ultimaposicion=0;

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Ingrese tamaño de su lista de vehiculos: ");

		 int dim=sc.nextInt();
		 vehiculos= new Vehiculo[dim];
		 
		 Menu.menu();
		
		
	}

}