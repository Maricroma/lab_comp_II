package Tp_4;

import java.util.Scanner;

public class UsoCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		double saldo;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese nombre del titular: ");
		nombre = entrada.next();
		System.out.println("Ingrese saldo inicial: ");
		saldo = entrada.nextDouble();
		CuentaCorriente cuenta1 = new CuentaCorriente(nombre, saldo);
		
		System.out.println("Ingrese nombre del titular: ");
		nombre = entrada.next();
		System.out.println("Ingrese saldo inicial: ");
		saldo = entrada.nextDouble();
		CuentaCorriente cuenta2 = new CuentaCorriente(nombre, saldo);
		
		cuenta1.transferencia(cuenta2);
		cuenta1.mostrarDatos();
		cuenta2.mostrarDatos();

	}

}
