package TFI01Recup;

public class Lugares implements ParaMostrar {
	private String nombre;
	private String direccion;
	
	public Lugares(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String getNombreClase() {
		// TODO Auto-generated method stub
		return "Clase: Lugares";
	}
	@Override
	public String toString() {
		return "Lugares [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
	

	
	

}
