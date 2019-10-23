package ejercicio2;

public class instalacionDeportiva {
	private String tipo;
	private double superficie;
	private String nombre;
	private int cantOficinas;
	private int cantCanchas;
	private String[] canchas ;
	private int ultPos=0;
	
	
	public instalacionDeportiva(String tipo, double superficie, String nombre, int cantOficinas, int cantCanchas) {
		this.tipo = tipo;
		this.superficie = superficie;
		this.nombre = nombre;
		this.cantOficinas = cantOficinas;
		this.cantCanchas = cantCanchas;
		this.canchas= new String[cantCanchas];
	}

	public String getTipo() {
		return tipo;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void verNombre() {
		System.out.println("Nombre: "+this.nombre);
	}

	public int getCantOficinas() {
		return cantOficinas;
	}
	
	public void setCantOficinas(int cantOficinas) {
		this.cantOficinas = cantOficinas;
	}

	public int getCantCanchas() {
		return cantCanchas;
	}

	public void setCantCanchas(int cantCanchas) {
		this.cantCanchas = cantCanchas;
	}
	
	public void listarCanchas() {
			
		for (String string : canchas) {
			System.out.println(string);
		}
	}

	public void agregarCancha(String nombre) {
		if (ultPos<canchas.length) {
			this.canchas[ultPos]=nombre;

		}else {
			System.out.println("No se pueden agregar más canchas.");
		}
	}
	
	
	
	

}
