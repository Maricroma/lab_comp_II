package tfi02;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Facultad implements Informacion{
    private String nombre;
    private Set<Carrera> coleccCarreras;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.coleccCarreras=new TreeSet<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Carrera> getColeccCarreras() {
        return coleccCarreras;
    }

    public void setColeccCarreras(Set<Carrera> coleccCarreras) {
        this.coleccCarreras = coleccCarreras;
    }

    public void agregarCarrera(Carrera carrera){
        coleccCarreras.add(carrera);
    }

    public void eliminarCarrera(String nombre){

        Iterator<Carrera> carreraIt= coleccCarreras.iterator();
        while(carreraIt.hasNext()){
            if (carreraIt.next().getNombre().equals(nombre)) {
                carreraIt.remove();
                break;
            }

        }

    }

    public void eliminarEstudiante(Estudiante estudiante){

        for (Carrera carrera : coleccCarreras) {

            for(Materia materia : carrera.getColeccMaterias()){

                for(Estudiante estudiante2 : materia.getColeccEstudiantes()){

                    if (estudiante2.equals(estudiante)) {
                        materia.eliminarEstudiante(estudiante2.getNombre());
                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Facultad{" +
                "Nombre='" + nombre + '\'' +
                ", Carreras=" + coleccCarreras +
                '}';
    }

    @Override
    public int verCantidad() {
        return coleccCarreras.size();
    }

    @Override
    public String listarContenidos() {
        String listaCarreras="";
        Iterator<Carrera> carreraIterador= coleccCarreras.iterator();

        while(carreraIterador.hasNext()){
            listaCarreras +=carreraIterador.next().getNombre();
        }

        return listaCarreras;
    }
}
