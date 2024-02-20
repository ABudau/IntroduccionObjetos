package vehiculos;

public class Bicicleta {
	private String nombre;
	private int velocidaActual;
	private int cadenciaDePedaleoActual;
	private int marchaActual;
	public static final int MARCHA_MAXIMA=6;
	public static final int MARCHA_MINIMA=1;
	public static final int VELOCIDAD_MINIMA = 0;
	public static final int VELOCIDAD_MAXIMA = 50;
	
	//Metodos
	
//	public Bicicleta() {
//		this.velocidaActual=0;
//		this.cadenciaDePedaleoActual=0;
//		this.marchaActual=1;
//	}
	
	public Bicicleta() {
		this.velocidaActual=VELOCIDAD_MINIMA;

	}
	public Bicicleta(int velocidaActual, int cadenciaDePedaleoActual, int marchaActual,String nombre) {
		this.velocidaActual = velocidaActual;
		this.cadenciaDePedaleoActual = cadenciaDePedaleoActual;
		this.marchaActual = marchaActual;
		this.nombre=nombre;
	}
	//getters y setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getVelocidaActual() {
		return velocidaActual;
	}
	public void setVelocidaActual(int velocidaActual) {
		if (velocidaActual>VELOCIDAD_MINIMA&&velocidaActual<=VELOCIDAD_MAXIMA) {
			this.velocidaActual = velocidaActual;
		}
		
	}
	public void setMarchaActual(int marchaActual) {
		this.marchaActual = marchaActual;
	}
	public int getMarchaActual() {
		return marchaActual;
	}
	public int getCadenciaDePedaleoActual() {
		return cadenciaDePedaleoActual;
	}
	public void setCadenciaDePedaleoActual(int cadenciaDePedaleoActual) {
		this.cadenciaDePedaleoActual = cadenciaDePedaleoActual;
	}
	
	public void acelerar() {
		this.velocidaActual++;
	}
	public void frenar() {
		if (this.velocidaActual>0) {
			this.velocidaActual--;
		}

	}
	public void subirMarcha() {
		if (this.marchaActual<MARCHA_MAXIMA) {
			this.marchaActual++;
		}
	}
	public void bajarMarcha() {
		if (this.marchaActual>MARCHA_MINIMA) {
			this.marchaActual--;	
		}
	}
	
	@Override
	public String toString() {
		return "velocidaActual=" + velocidaActual + "\ncadenciaDePedaleoActual=" + cadenciaDePedaleoActual
				+ "\nmarchaActual=" + marchaActual ;
	}
	public void mostrarEstado() {
		System.out.println("La velocidad actual es: "+this.velocidaActual);
		System.out.println("La cadencia actual es: "+this.cadenciaDePedaleoActual);
		System.out.println("La marcha actual es: "+this.marchaActual);
	}
}
