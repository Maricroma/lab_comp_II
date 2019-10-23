package Tp8;

import java.util.Scanner;

public class Menu {

	public static void menu() {
		int opcion=0;
		Scanner sc = new Scanner(System.in);

		try {

			do {
				System.out.println("Ingrese la opción elegida: ");
				System.out.println("1) Crear una moto.");
				System.out.println("2) Crear un auto.");
				System.out.println("3) Listar las motos.");
				System.out.println("4) Listar los autos.");
				System.out.println("5) Salir.");
				opcion = sc.nextInt();
				
				int velocidad;

				switch(opcion) {
				case 1:if(Main.ultimaposicion<Main.vehiculos.length) {
					System.out.println("Ingrese la velocidad inicial de la moto: ");
					velocidad = sc.nextInt();
					Moto moto01 = new Moto(velocidad);
					Main.vehiculos[Main.ultimaposicion]=moto01;
					Main.ultimaposicion++;
				}else {
					System.out.println("No se pueden ingresar más vehículos.");
				}
				break;
				case 2: if(Main.ultimaposicion<Main.vehiculos.length) {
					System.out.println("Ingrese la velocidad inicial de la moto: ");
					velocidad = sc.nextInt();
					Coche coche01= new Coche(velocidad);
					Main.vehiculos[Main.ultimaposicion]=coche01;
					Main.ultimaposicion++;
				}else {
					System.out.println("No se pueden ingresar más vehículos.");
				}
				break;
				case 3: for(int i=0;i<Main.vehiculos.length;i++) {
					if(Main.vehiculos[i].getClass().isInstance(new Moto(0))) {
						System.out.println(Main.vehiculos[i].toString());
					}
				}break;
				case 4: for(int i=0;i<Main.vehiculos.length;i++) {
					if(Main.vehiculos[i].getClass().isInstance(new Coche(0))) {
						System.out.println(Main.vehiculos[i].toString());
					}
				}break;
				case 5: break;
				}

			}while(opcion!=5);
		} catch(Exception e){

		}
	}

}