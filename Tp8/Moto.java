package Tp8;

public class Moto implements Vehiculo{
	
	private int velocidad;
	
	public Moto(int velocidad_inicial) {
		this.velocidad=velocidad_inicial;
	}

	@Override
	public int acelerar(int cant) {
		velocidad=+cant;
		if(velocidad>velocidad_max) {
			System.out.println("La velocidad m�xima ha sido superada.");
		}
		return velocidad;
	}

	@Override
	public int frenar(int cant) {
		velocidad=-cant;
		if(velocidad<0) {
			System.out.println("El veh�culo ha frenado.");
		}
		return velocidad;
	}
	
	
	@Override
	public String toString() {
		return "Moto [velocidad_inicial=" + this.velocidad + "]";
	}

	@Override
	public void plazas() {
		
		System.out.println("El n�mero de plazas es: 2.");
	}
	

}
