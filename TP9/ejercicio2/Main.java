package ejercicio2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		instalacionDeportiva nuevaInstalacion =new instalacionDeportiva( "Deportiva",  430.24,  "Jaime Zapata",  10, 5);
		
		System.out.println(nuevaInstalacion.getCantCanchas());
		System.out.println(nuevaInstalacion.getCantOficinas());
		System.out.println(nuevaInstalacion.getSuperficie());
		System.out.println(nuevaInstalacion.getTipo());
	
		nuevaInstalacion.agregarCancha("Futbol");
		nuevaInstalacion.agregarCancha("Tenis");
		nuevaInstalacion.agregarCancha("Basquet");
		nuevaInstalacion.agregarCancha("Jockey");
		
	}

}
