package ejemplos;

import java.util.Iterator;

public class Cubo {
	//definir los atributos/estados
	private String material;
	private boolean asa;
	private String color;
	private double capacidadMax;
	private double capacidadActual;
	
	/**
	 * constructor que crea una instancia de la clase(objeto) con los valores por defecto
	 */
	
	public Cubo() {//defino un constructor
		this.material="plastico";
		this.asa=false;
		this.color="negro";
		this.capacidadMax=10;
		this.capacidadActual=0;
	}
	/**
	 * Constructor que crea una instancia de la clase(objeto) con los valores que se sustituyen
	 * por los valores de los parámetros
	 * @param material es el material del cubo(String)
	 * @param asa es donde se indica si el cubo tiene (true) o no(false) asa.
	 * @param color es el color del asa(String)
	 * @param capacidadMax es la capacidad máxima del cubo(double)
	 * @param capacidadActual es la capacidad actual ocupada del cubo(double)
	 * @author Budau
	 */
	
	public Cubo(String material,boolean asa,String color,double capacidadMax,double capacidadActual) {
		this.material=material;
		this.asa=asa;
		this.color=color;
		this.capacidadMax=capacidadMax;
		this.capacidadActual=capacidadActual;
	}
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public boolean isAsa() {
		return asa;
	}
	public void setAsa(boolean asa) {
		this.asa = asa;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getCapacidadMax() {
		return capacidadMax;
	}
	public void setCapacidadMax(double capacidadMax) {
		this.capacidadMax = capacidadMax;
	}
	public double getCapacidadActual() {
		return capacidadActual;
	}
	public void setCapacidadActual(double capacidadActual) {
		this.capacidadActual = capacidadActual;
	}
	
	/**
	 * Método que llena el cubo, si la cantidad a llenar más la cantidad actual de agua
	 * en el cubo es menor o igual a la cantidad máxima, llenamos el cubo, sino la capacidad
	 * actual del cubo será la máxima.
	 * @param cantidad es la cantidad de litros a llenar
	 */
	
	public void llenar(double cantidad) {
		if (cantidad>0) {
			if ((cantidad+getCapacidadActual())<=getCapacidadMax()) {//si la cantidad a llenar más la cantidadActual es menor o igual a la capacidad
				setCapacidadActual(getCapacidadActual()+cantidad);
			}else{
				setCapacidadActual(getCapacidadMax());
			}
		}
		

	}
	/**
	 * Método que vacía el cubo, si la cantidad a vaciar es mayor o igual
	 * a la capacidad actual, entonces la capacidad actual será 0, sino
	 * la capacidad actual será la capacidad actual menos la cantidad a vaciar,
	 * @param cantidad es la cantidad a vaciar(double).
	 * @author Budau
	 */
	public void vaciar(double cantidad) {
		if (cantidad>0) {
			if (cantidad>=getCapacidadActual()) {//si la cantidad es mayor o igual a la capacidad acutal
				setCapacidadActual(0);//la capacidad actual es 0
			}else {//sino
				setCapacidadActual(getCapacidadActual()-cantidad);//la capacidad actual es el resultado de la capacidad actual menos la cantidad.
			}
		}
		
	}
	
	private String pintaLinea(int opcion) {
		String cadena="";//declaro una cadena y la inicializo
		cadena+="*";//Añado este caracter al principio de la cadena
		String caracter="";
		if (opcion==1) {
			caracter=" ~ ";
		}else if (opcion==2) {
			caracter="   ";
		}else {
			caracter=" * ";
		}

		for (int i =1; i <=getCapacidadMax()-2 ; i++) {
			cadena+=caracter;//a la variable cadena se le concatena este caracter
		}

		cadena+="*";//por último concatenamos el carácter al final de la cadena
		return cadena;

	}
	/**
	 * Método que dibuja el cubo con la cantidad de liquido que contiene actualmente
	 */
	public void pintar() {
		String cadena="";
		int capacidadMax=(int)getCapacidadMax();
		int capacidadAcutal=(int)getCapacidadActual();
//		int fondo=(int) Math.round(getCapacidadMax()/2);

		for (int i = 1; i <=capacidadMax-capacidadAcutal; i++) {//este bucle dibuja las paredes del cubo
			System.out.println(pintaLinea(2));
		}
		for (int i = 1; i <= capacidadAcutal; i++) {//este bucle dibuja el agua
			System.out.println(pintaLinea(1));
		}
		
		System.out.println(pintaLinea(3));//esta linea se encarga de imprimir la linea final
		
		
	}
}
