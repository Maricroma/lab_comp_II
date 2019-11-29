package tfi02;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Carrera implements Informacion{
    private String nombre;
    private Set<Materia> coleccMaterias;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.coleccMaterias=new TreeSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Materia> getColeccMaterias() {
        return coleccMaterias;
    }

    public void setColeccMaterias(Set<Materia> coleccMaterias) {
        this.coleccMaterias = coleccMaterias;
    }

    public void agregarMateria(Materia materia){
        coleccMaterias.add(materia);
    }

    public void eliminarMateria(String nombre){

        Iterator<Materia> materiaIterador= coleccMaterias.iterator();
        while(materiaIterador.hasNext()){
            if (materiaIterador.next().getNombre().equals(nombre)) {
                materiaIterador.remove();
                break;
            }

        }

    }

    public void encontrarMateria(String nombre){
        Iterator<Materia> materiaIterador= coleccMaterias.iterator();
        while(materiaIterador.hasNext()){
            if (materiaIterador.next().getNombre().equals(nombre)) {
                System.out.println("Se ha encontrado la materia exitosamente.");
                Scanner scan = new Scanner(System.in);
                int entrada;
                try {
                    System.out.println("Si desea eliminar la materia presione 1, sino presione otro número para salir.");
                    entrada= scan.nextInt();
                    if (entrada==1) {
                        materiaIterador.remove();
                    }
                } catch (Exception e) {
                    System.out.println("<Error> Caracter ingresado inválido.");
                }

            }
        }
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "Nombre='" + nombre + '\'' +
                ", Materias=" + coleccMaterias +
                '}';
    }

    @Override
    public int verCantidad() {
        return coleccMaterias.size();
    }

    @Override
    public String listarContenidos() {
        String listaMaterias="";
        Iterator<Materia> materiaIterador= coleccMaterias.iterator();

        while(materiaIterador.hasNext()){
            listaMaterias +=materiaIterador.next().getNombre();
        }

        return listaMaterias;
    }
}
