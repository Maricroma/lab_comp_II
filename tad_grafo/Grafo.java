package tad_grafo;

public class Grafo {

	    private String[] vertices;
	    private String[][] aristas;
	    private int[][] matriz;
	    private int[][] matrizPesos;

	    // Construir grafo
	    public void construir(String[] vertices, String[][] aristas){

	        this.vertices = vertices;
	        this.aristas = aristas;

	        matriz = new int[vertices.length][vertices.length];
	        matrizPesos = new int[vertices.length][vertices.length];

	        // Inicializar grafo
	        for (int i = 0; i < vertices.length; i++) {
	            // columnas
	            for (int j = 0; j < vertices.length; j++) {
	                matriz[i][j] = 0;
	                matrizPesos[i][j] = 0;
	            }
	        }

	        // cargar grafo
	        for (int i = 0; i < aristas.length; i++) {

	            String vertice1 = aristas[i][0];
	            String vertice2 = aristas[i][1];

	            int iVertice1 = buscarVertice(vertice1);
	            int iVertice2 = buscarVertice(vertice2);
	            
	            if (iVertice1 != -1 && iVertice2 != -1) {
	 	           if(matriz[iVertice1][iVertice2] < 2) {
	 	        	   matrizPesos[iVertice1][iVertice2] = 1;
	 		           matrizPesos[iVertice2][iVertice1] = 1; 
	 		           
	 		           matriz[iVertice1][iVertice2]++;
	 		           matriz[iVertice2][iVertice1]++;
	 	           }
	 	        } else {
	 	        	System.out.println("No se pueden realizar más conexiones.");
	 	        }
	        }
	    }

	    // Nuevas conexiones
	    public void conectar(String vertice1, String vertice2){
	        int iVertice1 = buscarVertice(vertice1);
	        int iVertice2 = buscarVertice(vertice2);
	        
	        if (iVertice1 != -1 && iVertice2 != -1) {
	        	matriz[iVertice1][iVertice2]++;
	            matriz[iVertice2][iVertice1]++;
	        }
   
	    }

	    // Nuevas conexiones con Ponderacion
	    public void conectar(String vertice1, String vertice2, int peso) {
	        int iVertice1 = buscarVertice(vertice1);
	        int iVertice2 = buscarVertice(vertice2);

	        if (iVertice1 != -1 && iVertice2 != -1) {
	           if(matriz[iVertice1][iVertice2] < 2) {
	        	   matrizPesos[iVertice1][iVertice2] = peso;
		           matrizPesos[iVertice2][iVertice1] = peso; 
		           
		           matriz[iVertice1][iVertice2]++;
		           matriz[iVertice2][iVertice1]++;
		           
		           System.out.println("Se ha realizado una nueva conexión.");
	           }
	        } else {
	        	System.out.println("No se pueden realizar más conexiones.");
	        }
	    }
	    
	    // Eliminar conexiones
	    public void eliminarConexiones(String vertice1, String vertice2) {
	    	int iVertice1 = buscarVertice(vertice1);
	        int iVertice2 = buscarVertice(vertice2);
	        
	        if (iVertice1 != -1 && iVertice2 != -1) {
	        	if(matriz[iVertice1][iVertice2] > 0) {
	        		matriz[iVertice1][iVertice2]--;
			        matriz[iVertice2][iVertice1]--;
			        System.out.println("Se ha eliminado la conexión.");
	        	} else {
		        	System.out.println("No hay una conexión entre estos vértices");
		        }	
	        } 
	        
	    }
	    
	    // Buscar vertices adyacentes
	    public String buscarVerticesAdy(String vertice) {
	    	int iVertice = buscarVertice(vertice);
	    	String retorno = "";
	    	
	    	for(int i = 0; i < matriz.length; i++) {
	    		if(matriz[iVertice][i] > 0) {
	    			retorno += vertices[i]+", ";
	    		}
	    	}
	    	return retorno;
	    }

	    // Recorrerlo
	    public void imprimir() {

	        for (int i = 0; i < vertices.length; i++) {
	            // columnas
	            for (int j = 0; j < vertices.length; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	

	    // Insertar Nuevo
	    public void insertar(String vertice) {
	    	for (int i = 0; i < vertices.length; i++) {
	    		if(this.vertices[i].equals(null)) {
	    			this.vertices[i] = vertice;
	    			return;
	    		}
	    	}
	    }

	    // Eliminar
	    public void eliminar(String vertice){
	    	for (int i = 0; i < vertices.length; i++) {
	    		if(this.vertices[i].equals(vertice)) {
	    			this.vertices[i] = null;
	    			return;
	    		}
	    	}
	    }

	    private int buscarVertice(String vertice) {
	        for (int i = 0; i < this.vertices.length; i++) {
	            if (this.vertices[i].equals(vertice)) {
	                return i;
	            }
	        }

	        return -1;
	    }

}



