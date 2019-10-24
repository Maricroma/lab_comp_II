package TFI01Recup;

import java.util.Arrays;

public class Vehiculos extends Automovil implements ParaMostrar{

	private Lugares origen;
	private Lugares destino;
	private Choferes chofer;
	private Pasajeros[] listaPasajeros;
	private String matricula;
	private int capacidad;
	
	public Vehiculos(Lugares origen, Lugares destino, Choferes chofer, Pasajeros[] listaPasajeros, String matricula,
			int capacidad) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.chofer = chofer;
		this.listaPasajeros = listaPasajeros;
		this.matricula = matricula;
		this.capacidad = capacidad;
	}


	@Override
	public void setChofer(Choferes chofer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDestino(Lugares destino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setlistaPasajeros(Pasajeros[] listaPasajeros) {
		// TODO Auto-generated method stub
		if(listaPasajeros.length>this.capacidad) {
			System.out.println("CAPACIDAD DE PASAJEROS SUPERADA");
		}else {
			this.listaPasajeros = listaPasajeros;
		}		
	}
	
	public String getPasajeros() {
		try {
			
			String listaPasajeros ="LISTADO DE PASAJEROS: \n";
			for (Pasajeros pasajeros : this.listaPasajeros) {
				
			}
			return listaPasajeros;
			
		} catch (Exception e) {
			// TODO: handle exception
			return "NO TIENE PASAJEROS CARGADOS";
		}
	}

	@Override
	public String ToString() {
		// TODO Auto-generated method stub
		return "Vehiculos [origen=" + origen + ", destino=" + destino + ", chofer=" + chofer + ", listaPasajeros="
		+ Arrays.toString(listaPasajeros) + ", matricula=" + matricula + ", capacidad=" + capacidad + "]";
	}


	@Override
	public String getNombreClase() {
		// TODO Auto-generated method stub
		return "Clase: Vehiculos";
	}




	
	
	
	
	
	

}
