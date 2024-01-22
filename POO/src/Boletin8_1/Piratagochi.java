package Boletin8_1;

import Vehiculos.Teclado;

/*Ejercicio 4 (Opcional):  Implementa la clase Piratagochi (copia pirata de Tamagochi) 
con los siguientes atributos: 
String nombre
int energia;// Siempre será un valor entre 1 y 10
boolean estaHambriento;
int nivelFelicidad;// Siempre será un valor entre 1 y 10
y métodos:
public Piratagochi(String nombre); //Al resto de atributos se le asigna un valor válido
de forma aleatoria
public void comer()//Si estaHambriento es true, pasa a valer false. Si estaHambriento es 
false, se resta 1 al nivel de felicidad.

public void dormir(int horasDurmiendo)//Aumenta el nivel de energía por cada hora dormida.
Sin embargo, si se llega al nivel máximo de energía, 10, cada hora de más dormida, se resta
del nivel de felicidad. Es decir, si por ejemplo el nivel de energía es 9, el nivel de
felicidad 4, y se duermen 3 horas, el nivel de energía sería 10, y el nivel de felicidad 2. 

public void jugar(int horasJugando)//Si estaHambriento es false, aumenta el nivel de felicidad
las horas que está jugando, hasta un máximo de 10, y se resta ese mismo numero de la energia,
y estaHambriento se pone a true.  Si por el contrario, estaHambriento es true, se resta el número
 de horas de la energia, y de la felicidad.
 
public String getNecesidades()//El método devolverá un String en el que se indicará que es
lo que le gustaría hacer al Piratagochi, según su estado (Pensad en las posiblidades). 
Por ejemplo: “¡Lucas quiere jugar! 😺”*/

public class Piratagochi {
	private String nombre;
	private int energia;// Siempre será un valor entre 1 y 10
	private boolean estaHambriento;
	private int nivelFelicidad;// Siempre será un valor entre 1 y 10
	public static final int NIVEL_MAXIMO=10;
	public static final int NIVEL_MINIMO=1;
	
	public Piratagochi(String nombre) {
		this.nombre=nombre;
		this.energia=Teclado.genearNumeroAleatorio(1, 10);
		this.estaHambriento=true;
		this.nivelFelicidad=Teclado.genearNumeroAleatorio(1, 10);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		if (energia>=NIVEL_MINIMO&&energia<=NIVEL_MAXIMO) {
			this.energia = energia;
		}
		
	}
	public boolean getEstaHambriento() {
		return estaHambriento;
	}
	public void setEstaHambriento(boolean estaHambriento) {
		this.estaHambriento = estaHambriento;
	}
	public int getNivelFelicidad() {
		return nivelFelicidad;
	}
	public void setNivelFelicidad(int nivelFelicidad) {
		if (nivelFelicidad>=NIVEL_MINIMO&&nivelFelicidad<=NIVEL_MAXIMO) {
			this.nivelFelicidad = nivelFelicidad;
		}
		
		
	}
	
	/**
	 * Método que modifica el valor de los atributos estaHambriento y nivelFelicidad
	 */
	
	public void comer(){
		if (getEstaHambriento()) {//Si estaHambriento es true, pasa a valer false.
			setEstaHambriento(false);
		}else {//Si estaHambriento es false, se resta 1 al nivel de felicidad.
			setNivelFelicidad(getNivelFelicidad()-1);
		}		
	}
	
	/**
	 * Aumenta el nivel de energía por cada hora dormida. Sin embargo, si se llega
	 *al nivel máximo de energía, 10, cada hora de más dormida, se resta del nivel
	 *de felicidad. Es decir, si por ejemplo el nivel de energía es 9, el nivel de 
	 *felicidad 4, y se duermen 3 horas, el nivel de energía sería 10, y el nivel de
	 *felicidad 2. 
	 * @param horasDurmiendo es el valor de las horas que duerme
	 */
	public void dormir(int horasDurmiendo){
		int horasDeMas=(getEnergia()+horasDurmiendo)-NIVEL_MAXIMO;//calculo las horas por encima del nivel máximo de energía
		if (getEnergia()+horasDurmiendo<=NIVEL_MAXIMO) {//si el valor de la energía mas las horas durmiendo no superan el valor máximo
			setEnergia(getEnergia()+horasDurmiendo);//asigno a energia el valor de la energía más las horas dormidas
		}else {//si se supera el nivel maximo
			setEnergia(NIVEL_MAXIMO);//a la energia le asigno el valor máximo
			setNivelFelicidad(getNivelFelicidad()-horasDeMas);//y a la felicidad le resto las horas por encima del máximo
		}
	}
	/**
	 *Si estaHambriento es false, aumenta el nivel de felicidad las horas
//	 *que está jugando, hasta un máximo de 10, y se resta ese mismo numero de
//	 *la energia, y estaHambriento se pone a true.  Si por el contrario,
//	 *estaHambriento es true, se resta el número de horas de la energia,
//	 *y de la felicidad.
	 * @param horasJugando
	 */
	
	public void jugar(int horasJugando){
		if (getEstaHambriento()==false) {//si esta hambriento es false
			condicionalGetHambrientoFalse(horasJugando);
			setEstaHambriento(true);
		}else {//true
			condicionalGetHambrientoTrue(horasJugando);
		}
	}
	private void condicionalGetHambrientoFalse(int horasJugando) {
		if (getNivelFelicidad()+horasJugando<=NIVEL_MAXIMO) {//si el nivel de felicidad más las horas jugando es menor o igual al nivel máximo
			setNivelFelicidad(getNivelFelicidad()+horasJugando);//nivelFelicidad coge el valor de la suma del valor del nivelFelicidad más las horas jugando
			condicionalEnergiaHorasJugando(horasJugando);
		}else{///si el nivel de felicidad más las horas jugando es mayor al nivel máximo
			setNivelFelicidad(NIVEL_MAXIMO);//se establece el nivel de felicidad máximo
			condicionalEnergiaHorasJugando(horasJugando);
		}
	}
	private void condicionalEnergiaHorasJugando(int horasJugando) {
		if (getEnergia()-horasJugando>=NIVEL_MINIMO) {//si el nivel de energia menos las horas jugando es mayor o igual al nivel minimo
			setEnergia(getEnergia()-horasJugando);//al nivel de energía se le resta el nivel de energía menos las horas jugando
		}else {//Si no se cumple la condición
			setEnergia(NIVEL_MINIMO);//se establece el nivel minimo de energía
		}
	}
	private void condicionalGetHambrientoTrue(int horasJugando) {
		if (getNivelFelicidad()-horasJugando>=NIVEL_MINIMO) {//si el nivel de felicidad menos las horas jugando es mayor o igual al nivel minimo
			setNivelFelicidad(getNivelFelicidad()-horasJugando);//asigno a nivel de felicidad el nivel de felicidad menos las horas jugando
		}else if (getNivelFelicidad()-horasJugando<NIVEL_MINIMO) {//si el nivel de felicidad menos las horas jugando es inferior al nivel mínimo 
			setNivelFelicidad(NIVEL_MINIMO);//le asigno el nivel de felicidad mínimo
		} else
			condicionalEnergiaHorasJugando(horasJugando);
	}
	//El método devolverá un String en el que se indicará que es lo que le gustaría hacer al Piratagochi, según su estado (Pensad en las posiblidades). 
		//Por ejemplo: “¡Lucas quiere jugar! 😺”
	public String getNecesidades(){
		String mensaje="";
		char ico='\u2602';
		if (getEnergia()>=5) {
			mensaje+="¡"+getNombre()+" quiere jugar! 😺\n";//almaceno en la cadena el mensaje
//			mensaje="¡"+getNombre()+" quiere jugar!"+ ico;
		}else {
			mensaje+="¡"+getNombre()+" quiere dormir!  😺\n";//concateno y almaceno en la cadena el mensaje
//			mensaje+="¡"+getNombre()+" quiere comer!\n";
		}
		if (getNivelFelicidad()<5&&getEstaHambriento()==false) {
			mensaje+="¡"+getNombre()+" quiere jugar para ser feliz!  😺\n";
		}
		if (getEstaHambriento()) {
			mensaje+="¡"+getNombre()+" quiere comer!  😺\n";
		}
		return mensaje;//devuelvo el mensaje
	}
	@Override
	public String toString() {
		return "Piratagochi [nombre=" + nombre + ", energia=" + energia + ", estaHambriento=" + estaHambriento
				+ ", nivelFelicidad=" + nivelFelicidad + "]";
	}
	
	
	

	
	
	
	
	
}
