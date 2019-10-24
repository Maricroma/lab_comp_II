package TFI01Recup;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int respuesta;

		try {
			do {
				System.out.println("DATOS DEL CHOFER");
				System.out.println("Ingrese nombre: ");
				String nombre = sc.next();
				System.out.println("Ingrese dni: ");
				int dni = sc.nextInt();
				Choferes nuevoChofer = new Choferes(nombre, dni);
				System.out.println(nuevoChofer.toString());

				System.out.println("DATOS DEL VEHICULO");
				System.out.println("Origen del recorrido");
				nombre = sc.next();
				System.out.println("Direccion: ");
				String direccion = sc.next();
				Lugares nuevoOrigen = new Lugares (nombre,direccion);
				System.out.println("Destino del recorrido: ");
				nombre = sc.next();
				System.out.println("Direccion: ");
				direccion = sc.next();
				Lugares nuevoDestino = new Lugares (nombre,direccion);
				System.out.println("Matricula: ");
				String matricula = sc.next();
				System.out.println("Capacidad: ");
				int capacidad = sc.nextInt();
				
				System.out.println("PASAJEROS");
				System.out.println("Indique cantidad de pasajeros a ingresar: ");
				int cant = sc.nextInt();
				if(cant<=capacidad) {
					Pasajeros[] listaPasajeros = new Pasajeros[cant];
					for(int i=0;i<listaPasajeros.length;i++) {
						System.out.println("Pasajero "+(i+1));
						System.out.println("Ingrese nombre: ");
						nombre=sc.next();
						System.out.println("Ingrese dni: ");
						dni=sc.nextInt();
						Pasajeros nuevoPasajero = new Pasajeros(nombre,dni);
						listaPasajeros[i]= nuevoPasajero;
						
					}
					Vehiculos nuevoVehiculo = new Vehiculos(nuevoDestino, nuevoDestino, nuevoChofer, listaPasajeros, matricula, capacidad);
					System.out.println(nuevoVehiculo.ToString());
				}else {
					System.out.println("LA LISTA DE PASAJEROS ES SUPERIOR A LA CAPACIDAD DEL VEHÍCULO.");
				}


				System.out.println("\nIngrese:");
				System.out.println("1) Cargar otro viaje.");
				System.out.println("2) Salir");
				respuesta=sc.nextInt();

			}while(respuesta == 1);

		}catch(Exception e) {
			System.out.println("ERROR EN EL INGRESO DE DATOS");
		}

	}

}


