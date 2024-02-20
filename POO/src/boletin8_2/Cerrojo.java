package boletin8_2;

import utilidades.Teclado;

//Ejercicio 1:  Diseñe e implemente una clase Cerrojo con combinación que tiene
//los siguientes requisitos:
//Tiene una combinación, que es una secuencia de tres números y está oculta. 
//La combinación puede cambiarse, pero sólo por alguien que conoce la combinación actual. 
//El cerrojo se puede abrir proporcionando la combinación. 
//Deshabilite la copia de cerrojos con combinación. 
//Del cerrojo interesa saber si está cerrado o abierto.

public class Cerrojo {
	private int combinacion;
	private boolean abierto;


	public Cerrojo() {
		super();
		this.combinacion = 123;
		this.abierto=false;
	}



	private int getCombinacion() {
		return combinacion;
	}



	private void setCombinacion(int combinacion) {
		this.combinacion = combinacion;
	}

	public boolean isAbierto() {
		return abierto;
	}



	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}



	public void abrirCerrojo(int combina) {
		if (getCombinacion()==combina) {
			setAbierto(true);
		}
		

	}

/**
 * Metodo que cambia la combinación del cerrojo, para la cual se pide la combinación 
 * antigua y la nueva combinación.
 * @param combinacionAntigua es la combinacion antigua que se le pasa
 * @param nuevaCombinacion es la nueva combinación que se quiere poner
 */
	public void cambiarCombinacion(int combinacionAntigua,int nuevaCombinacion) {
		//si la combinacion antigua coincide con la combinacion que tenemos ahora mismo y 
		//comprobarLongitudCombinacion es true se asigna la nueva combinación.
		if (combinacionAntigua==getCombinacion()&&comprobarLongitudCombinacion(nuevaCombinacion)) {
			setCombinacion(nuevaCombinacion);
		}
	}

/**
 * Método que comprueba la longitud(3) de la nueva combinación
 * @param nuevaCombinacion es la combinación que se le pasa para comprobar su longitud
 * @return devuelve true si la combinación tiene una longitud de 3 digitos y false si no la tiene
 */
	private boolean comprobarLongitudCombinacion(int nuevaCombinacion) {
		boolean valido=false;
		String nuevaCombinacionAux="";//declaro una cadena y la inicializo
		nuevaCombinacionAux+=nuevaCombinacion;//añado a la cadena la combinación
	if (nuevaCombinacionAux.length()==3) {//si la cadena mide 3
		valido=true;//valido pasa a valer true
	}
		return valido;//devuelvo valido.
	}





}
