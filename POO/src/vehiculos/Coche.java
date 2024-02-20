package vehiculos;

public class Coche {
	private String modelo;
	private Marca marca;
	private String matricula;
	private int km;
	
	private static int kmTotales;
	private static int cochesCreados=0;
	
	//Constructor
	public Coche(String modelo,String matricula) {
		this.modelo=modelo;
		this.matricula=matricula;
		this.cochesCreados++;
	}
	
	
	//Setter y Getters
	public void setKm(int km) {
		int kmDeMas=km-this.km;
		this.km = km;
		this.kmTotales+=kmDeMas;
	}
	
	public int getKm() {
		return km;
	}
	public static int getKmTotales() {
		return kmTotales;
	}
	public static int getCochesCreados() {
		return cochesCreados;
	}
	
}
