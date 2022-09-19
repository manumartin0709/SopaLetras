package es.mmm.SopaLetras;
import es.mmm.SopaLetras.*;
public class Coordenada {
	
	private final int fila;
	private final int columna;
	private final String Sentido;
	
	public Coordenada(int fila, int columna, String Sentido) throws TableroException {
		
		
		
		this.fila= fila;
		this.columna= columna;
		this.Sentido= Sentido;
		
		
	}
   
	protected int getFila() {
		return this.fila;
	}


	protected int getColumna() {
		return this.columna;
	}


	protected String getSentido() {
		return this.Sentido;
	}

	
	
	/**new Coordenada(0,1,Sentido.Normal);
	 * 
	 */
	
	
	
	

}
