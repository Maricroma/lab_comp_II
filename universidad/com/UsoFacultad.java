//Integrantes:
//Costantini, Néstor Matías
//Kosobucki, Mauricio Nicolás
//Roma, Maria Cristina

package universidad.com;

import java.util.Scanner;

public class UsoFacultad {
    public static void main(String[] args){
    	Scanner entrada= new Scanner(System.in);
    	//Se instancian las diferentes facultades, con sus nombres y cantidad máxima de alumnos
        Facultad informatica= new Facultad("Informática", 6);
        Facultad humanidades= new Facultad("Humanidades", 30);
        Facultad artes= new Facultad("Artes", 10);

        //Se agregan alumnos a la facultad de informatica.
        informatica.agregarAlumno(informatica);
        informatica.agregarAlumno(informatica);
        informatica.agregarAlumno(informatica);
        informatica.agregarAlumno(informatica);
        informatica.agregarAlumno(informatica);
        
        //listamos los alumnos agregados.
        informatica.listarAlumnos();
        
        //Buscamos alumnos por nombre
        System.out.println("\nIngrese el nombre a buscar en la facultad de Informática: ");
        String nombre= entrada.next();
        if (informatica.buscarAlumno(nombre)!=null) {
        	System.out.println("\nEl alumno buscado está en la posición: "+informatica.buscarAlumno(nombre));
		}else {
			System.out.println("\nEl alumno buscado no existe en la facultad de Informática.");
		}
        
        //Eliminamos el alumno segun su ID
        System.out.println("\nIngrese el ID del alumno a eliminar de la facultad de Informática: ");
        informatica.borrarAlumno(entrada.nextLong());
        
        //Se lista para mostrar el alumnos eliminado
        informatica.listarAlumnos();
        
      //Eliminamos el alumno segun su ID
        System.out.println("\nIngrese el ID del alumno a eliminar de la facultad de Informática: ");
        informatica.borrarAlumno(entrada.nextLong());
        
        //Se lista para mostrar el alumnos eliminado
        informatica.listarAlumnos();
        
        //se modifica la nota de un alumno que se lo encuentra segun el nombre
        System.out.println("\nPara modificar nota ingrese el nombre del alumno :");
        String nomb=entrada.next();
        System.out.println("\nIngrese la nota :");
        informatica.modificarNotaMedia(nomb, entrada.nextDouble());
        
        //Se lista los alumnos para visualizar el cambio de la nota
        informatica.listarAlumnos();


    }
}
