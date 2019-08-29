 package Tp_4;

import java.util.Random;
import java.util.Scanner;

public class CuentaCorriente {
	private double saldo;
	private String nombreTitular;
	private long numeroCuenta;
	
	public CuentaCorriente(String nombre, double saldo) {
		Random randomizar= new Random(System.nanoTime());
		numeroCuenta=randomizar.nextLong();
		this.saldo = saldo;
		this.nombreTitular = nombre;
	}
	
	public String getNombre() {
		return nombreTitular;
	}

	public void setNombre(String nombre) {
		this.nombreTitular = nombre;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Long  getNroCuenta() {
		return numeroCuenta;
	}
	
	public void extraer(double cantidad) {
		if(saldo<cantidad) {
			System.out.println("No se pudo realizar la operación. Saldo insuficiente.");
		}else {
			System.out.println("Extracción realizada.");
			saldo -=cantidad;
			System.out.println("Saldo actual: "+saldo);
		}
	}
	
	public void depositar(double cantidad) {
		System.out.println("Depósito realizado.");
		saldo +=cantidad;
		System.out.println("Saldo actual: "+saldo);
	}
	
	public void transferencia(CuentaCorriente cuentaDepositada) {
		Scanner entrada=new Scanner(System.in);
		System.out.println("Ingrese la cantidad a depositar: ");
		Double deposito=entrada.nextDouble();
		cuentaDepositada.depositar(deposito);
		this.extraer(deposito);
		System.out.println("Transferencia realizada.");
	}
	
	public void mostrarDatos() {
		System.out.println("\nNombre del Titular: "+this.nombreTitular+"\nNúmero de Cuenta: "+this.numeroCuenta+"\nSaldo: "+this.saldo);
	}

}
