package TFI02;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Materia implements Informacion{
    private String nombre;
    private Profesor titular;
    private Set<Estudiante> coleccEstudiantes;

    public Materia(String nombre, Profesor titular){
        this.nombre=nombre;
        this.titular=titular;
        this.coleccEstudiantes=new TreeSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor getTitular() {
        return titular;
    }

    public void modificarProfesor(Profesor profesor) {
        titular = profesor;
    }

    public Set<Estudiante> getColeccEstudiantes() {
        return coleccEstudiantes;
    }

    public void setColeccEstudiantes(Set<Estudiante> coleccEstudiantes) {
        this.coleccEstudiantes = coleccEstudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante){
        coleccEstudiantes.add(estudiante);

    }

    public void eliminarEstudiante(String nombre){

        Iterator<Estudiante> estudianteIterador= coleccEstudiantes.iterator();
        while(estudianteIterador.hasNext()){
            if (estudianteIterador.next().getNombre().equals(nombre)) {
                estudianteIterador.remove();
                break;
            }

        }

    }

    @Override
    public String toString() {
        return "Materia{" +
                "Nombre='" + nombre + '\'' +
                ", Profesor=" + titular +
                ", Estudiantes=" + coleccEstudiantes +
                '}';
    }

    @Override
    public int verCantidad() {
        return coleccEstudiantes.size();
    }

    @Override
    public String listarContenidos() {
        String listaEstudiantes="";
        Iterator<Estudiante> estudianteIterador= coleccEstudiantes.iterator();

        while(estudianteIterador.hasNext()){
            listaEstudiantes +=estudianteIterador.next().getNombre();
        }

        return listaEstudiantes;
    }
}
