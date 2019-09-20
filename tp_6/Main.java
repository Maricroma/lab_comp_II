package tp_6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int quant;
		int length;
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Ingrese cantidad de contraseñas a generar: ");
		Password[] passwords=new Password[sc.nextInt()];
		System.out.print("Ingrese longitud de su contraseña: ");
		length=sc.nextInt();
		for(int i=0;i<passwords.length;i++) {
			Password newPass= new Password(length);
			passwords[i]=newPass;
		}
		
		for (Password password : passwords) {
			System.out.println(password.getPassword()+", FUERTE: "+password.isStrong());
			
		}
	
	}

}
