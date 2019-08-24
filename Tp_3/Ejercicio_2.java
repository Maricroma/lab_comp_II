package Tp_3;

public class Ejercicio_2 {
	
	public static void main(String[] args) {
		int[][] matriz_elem = new int[3][3];          //Se crea una matriz de 3x3
		
		for(int i=0;i<matriz_elem.length;i++) {
			  for(int j=0;j<matriz_elem.length;j++) {        //Se asignan valores aleatorios a la matriz 
				  matriz_elem[i][j] = (int) (Math.random()*100);
			  }
		}
		for (int[] arreglo : matriz_elem) {
			for (int numero : arreglo) {                   //Se muestran los valores almacenados
				System.out.println(numero);
			}
		}
	}

}
