package TFI01Recup;

public class Personas implements ParaMostrar{
	private String nombre;
	private int dni;
	
	public Personas(String nombre, int dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", DNI=" + dni + "]";
	}
	@Override
	public String getNombreClase() {
		// TODO Auto-generated method stub
		return "Clase: Personas";
	}
	
	

}
