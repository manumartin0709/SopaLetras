package es.mmm.SopaLetras;

import java.util.*; 
import es.mmm.SopaLetras.Coordenada;

public class SopaLetras {
		
	public int tamanio=0;
		
	public List<List <Character>> SopaLetras= new ArrayList<List<Character>>();
	
	/**
	 * Constructor
	 * @param tamanio
	 */
	public SopaLetras(int tamanio) {
		this.tamanio= tamanio;
		
	}
	
	public void llenarArray() {
		for(int i=0; i<tamanio ;i++ ) {
			SopaLetras.add(new ArrayList<Character>());
			for(int j=0; j<tamanio; j++){
				SopaLetras.get(i).add('*');
			}
		}
	}
     
	public void colocarPalabraHorizontal(String Palabra, Coordenada Coordenada)throws Exception {
		if(Palabra == null || Palabra.isEmpty()) {
			throw new TableroException ("Palabra nula o vacia");
		}
		if(Palabra.length()>this.tamanio) {
			throw new TableroException("El tamaño de la palabra es superior a la dimension");
		}
		if(fila<0) {
			throw new TableroException("");
		}
		if(columna<0) {
			throw new TableroException("");
		}
		else if(Coordenada.getFila()> tamanio) {
			throw new TableroException("");
			else if (Coordenada.getColumna()> tamanio) {
				 throw new TableroException("");
			}
			else if () {
				throw new TableroException("");
			}
			
			if(this.tamanio -(Coordenada.getColumna()+ Palabra.length()>0)) {
				throw new TableroException("");
			}
			this.colocarPalabraHorizontalSentidoNormal(Palabra, Coordenada);
		}
		
	}
	
	
	

	
		
}
