package Tp8;

public interface Vehiculo {
	
	final int velocidad_max=120;
	
	public int acelerar(int cant);
	public int frenar(int cant);
	public void plazas();
	public String toString();
		
	
}
