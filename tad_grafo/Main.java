package tad_grafo;


public class Main {

	public static void main(String[] args) {
		
		String[] vertices = { "A", "B", "C", "D", "E", "F"};
        String[][] aristas =
                {
                    {"A", "B"},{"B", "C"},{"C", "B"},{"D", "F"},{"F", "A"},
                    {"A", "E"},{"E", "A"},{"B", "E"},{"C", "E"},{"C", "D"},
                    {"F", "D"},{"D", "E"},{"F", "E"}
                };
		
        //Inicializar
		Grafo nuevoGrafo = new Grafo();
		String vertice = null;
		String vertice1 = null;
		String vertice2 = null;
		int peso = 0;
		
		nuevoGrafo.construir(vertices, aristas);
		nuevoGrafo.conectar(vertice1, vertice2);
		nuevoGrafo.conectar(vertice1, vertice2, peso);
		
		

	}

}
