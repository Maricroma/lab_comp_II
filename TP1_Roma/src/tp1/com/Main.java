package tp1.com;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);

		String nombre;
		int edad;
		do{
			
			
			System.out.println("Ingrese su nombre: ");
			nombre = entrada.next();
			System.out.println("Ingrese su edad: ");
			edad = entrada.nextInt();
			
			if(edad>17) {
				System.out.println(""+nombre+" es mayor de edad. \n");
			}
			else {
				System.out.println(""+nombre+" es menor de edad. \n");
			}
		}while(edad>0);
	        
	}

}
