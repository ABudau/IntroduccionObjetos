package Boletin8_2;

import utilidades.Teclado;

public class Saltos {
	private int votacionJurado;
	private boolean valido;
	
	public static final int VOTACION_MAXIMA=10;
	public static final int VOTACION_MINIMA=0;
	
	public Saltos() {
		super();
		this.votacionJurado = Teclado.genearNumeroAleatorio(VOTACION_MINIMA, VOTACION_MAXIMA);//cada vez que se cree un salto se rellena con valores aleatorios
		this.valido = calcularSaltoValido();//aquí se calcula si un salto es válido o no
		
	}
	
	
	
	public int getVotacionJurado() {
		return votacionJurado;
	}



	public void setVotacionJurado(int votacionJurado) {
		this.votacionJurado = votacionJurado;
	}



	public boolean isValido() {
		return valido;
	}



//	public void setValido(boolean valido) {
//		this.valido = valido;
//	}



	private boolean calcularSaltoValido() {
		double rand=Math.random();//declaro una variable y almaceno en ella el valor generado de 0.0 a 1.0
		boolean esValido=true;//declaro un booleano con un valor true
		if (rand>0.85) {//si el número aleatorio creado es mayor que 0.85 
			esValido=false; //la variable coge un valor de false
		}
		return esValido;//devuelvo el valor de la variable
	}



	@Override
	public String toString() {
		return "Saltos [votacionJurado=" + votacionJurado + ", valido=" + valido + "]";
	}
	

}
