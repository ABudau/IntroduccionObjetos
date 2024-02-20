package boletin8_2;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Saltador {
	private String nombre;
	private String apellidos;
	private Nacionalidad nacionalidad;
	private double totalPuntosCompeticion;
	private Entrenador datosEntrenador;
	public static Saltos [] saltos;
//	public static Saltador getSaltosSaltador();
	
	
	
	
//	public Saltador(String nombre, String apellidos, Nacionalidad nacionalidad, double totalPuntosCompeticion,
//			Entrenador datosEntrenador) {
//		super();
//		this.nombre = nombre;
//		this.apellidos = apellidos;
//		this.nacionalidad = nacionalidad;
//		this.totalPuntosCompeticion = totalPuntosCompeticion;
//		this.datosEntrenador = datosEntrenador;
//	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Saltador other = (Saltador) obj;
		return Objects.equals(apellidos, other.apellidos) && nacionalidad == other.nacionalidad
				&& Objects.equals(nombre, other.nombre);
	}



	public Saltador(String nombre, String apellidos, Nacionalidad nacionalidad, double totalPuntosCompeticion,
		Entrenador datosEntrenador) {
	super();
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.nacionalidad = nacionalidad;
	this.totalPuntosCompeticion = totalPuntosCompeticion;
	this.datosEntrenador = datosEntrenador;
}



	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(Nacionalidad nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public double getTotalPuntosCompeticion() {
		return totalPuntosCompeticion;
	}
	public void setTotalPuntosCompeticion(double totalPuntosCompeticion) {
		if (totalPuntosCompeticion>0) {
			this.totalPuntosCompeticion =totalPuntosCompeticion;
		}
		
	}
	public Entrenador getDatosEntrenador() {
		return datosEntrenador;
	}
	public void setDatosEntrenador(Entrenador datosEntrenador) {
		if (datosEntrenador!=null) {
			this.datosEntrenador = datosEntrenador;
		}
	}
	
	
	public static Saltos[] getSaltos() {
		return saltos;
	}



	public void setSaltos(Saltos[] saltos) {
		this.saltos = saltos;
	}


	
//	private int calcularPuntosCompeticionMaxMin(int opcion,int valor) {
//		Saltos saltoAux= new Saltos();
//		boolean condicional;
//		saltoAux.setVotacionJurado(valor);
//		 int i = 0;
//		 int posicion=0;
//		 if (opcion==0) {//si es 0 calculo el mayor
//				condicional=saltos[i].isValido()&&saltos[i].getVotacionJurado()>saltoAux.getVotacionJurado();
//			}else {//si es 1 calculo el menor
//				condicional=saltos[i].isValido()&&saltos[i].getVotacionJurado()<=saltoAux.getVotacionJurado();
//			}
//		 
//		for (i=0 ; i < saltos.length; i++) {
//			
//			if (saltos[i]!=null) {
//				if (condicional) {
//					posicion=i;
//				}
//			}
//		}
//		return posicion;
//	}
//	
	
	private int calcularPuntosCompeticionMax() {
		Saltos saltoAux= new Saltos();
		saltoAux.setVotacionJurado(-1);
		 int posicion=0;
		 
		for (int i=0 ; i < saltos.length; i++) {
			
			if (saltos[i]!=null) {
				if (saltos[i].isValido()&&saltos[i].getVotacionJurado()>saltoAux.getVotacionJurado()) {
					saltoAux=saltos[i];
					posicion=i;
				}
			}
		}
		return posicion;
	}
	private int calcularPuntosCompeticionMin() {
		Saltos saltoAux= new Saltos();
		saltoAux.setVotacionJurado(10);
		 int posicion=0;
//		
		for (int i=0 ; i < saltos.length; i++) {
			
			if (saltos[i]!=null) {
				if (saltos[i].isValido()&&saltos[i].getVotacionJurado()<=saltoAux.getVotacionJurado()) {
					saltoAux=saltos[i];
					posicion=i;
				}
			}
		}
		return posicion;
	}
	
	public double calcularPuntos() {
		int max;
		int min;
		int contador=0;
		double puntuacion=0;
		
		max=calcularPuntosCompeticionMax();
		min=calcularPuntosCompeticionMin();
		
		for (int i = 0; i < saltos.length; i++) {
			if (saltos[i]!=null&&saltos[i].isValido()) {
				if (i!=max&&i!=min) {
					puntuacion+=saltos[i].getVotacionJurado();
					contador++;
				}
				
				
				
			}
		}
		setTotalPuntosCompeticion(puntuacion/contador);
		return puntuacion/contador;

	}




	@Override
	public String toString() {
		return "Saltador [nombre=" + nombre + ", apellidos=" + apellidos + ", nacionalidad=" + nacionalidad
				+ ", totalPuntosCompeticion=" + totalPuntosCompeticion + ", datosEntrenador=" + datosEntrenador
				+ ", saltos=" + Arrays.toString(saltos) + "]";
	}




	/**
	 * Método que cambia el entrenador del primer saltador por el del segundo saltador
	 * @param s1 es el salatador que intercambiará su entrenado con el saltador s2
	 * @param s2 es el saltador que intercambiará su entrenador con el saltador s1
	 */
	public static void cambiarEntrenador(Saltador s1,Saltador s2) {
		
		Entrenador entrenadorAux=new Entrenador(0,Nacionalidad.ESP);
		entrenadorAux=s1.getDatosEntrenador();
		
		s1.setDatosEntrenador(s2.getDatosEntrenador());
		s2.setDatosEntrenador(entrenadorAux);
		
		
	}
	
	public static Saltador saltadorConMasPuntuacion() {
		Saltador s1=new Saltador(null, null, null, 0, null);
		Saltos salto1=new Saltos();
		salto1.setVotacionJurado(0);		
		
		for (int i = 0; i < saltos.length; i++) {
			if (Saltador.getSaltos()[i]!=null) {
				if (Saltador.getSaltos()[i].getVotacionJurado()>=salto1.getVotacionJurado()) {
					
				}
			}
		}
		
		return s1;
		
	}
	
	
	
	
	
}
