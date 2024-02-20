package boletin8_1;

import java.util.Iterator;
//Ejercicio 2:  Implementa una clase Cuadrado, la cual tendrá como atributos: 
//int lado
//y como métodos:
//public Cuadrado()
//public void setLado(int lado)
//public int getLado()
//public int getArea() //Devuelve el área del Cuadrado
//public void printCuadrado()// Muestra por pantalla un cuadrado dibujado con *, 
////teniendo en cuenta el valor de su atributo lado
public class Cuadrado {

	private int lado;
	public Cuadrado() {
		this.lado=2;
	}
	public int getLado() {
		return lado;
	}
	public void setLado(int lado) {
		if (lado>0) {
			this.lado = lado;
		}
		
	}
	public double getArea() {
		return Math.pow(lado, 2);

	}
	public void printCuadrado() {
		String cadena="";
		for (int i = 0; i < getLado(); i++) {//bucle que se usa para rellenar las lineas
			cadena+="* ";//añado el caracter a la cadena

		}
		for (int i = 0; i < getLado(); i++) {//bucle que se usa para mostrar las lineas 

			System.out.println(cadena);//muestro el valor de la cadena
		}
	}
	
	
	
	
}
