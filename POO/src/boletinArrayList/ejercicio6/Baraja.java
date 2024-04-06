package boletinArrayList.ejercicio6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baraja {
	public static String[]palos={"bastos","copas","espadas","oros"};
	public static String[]numeros= {"as","2","3","4","5","6","7","sota","caballo","rey",};
//	public static String[]numeros= {"1","2","3","4","5","6","7","10","11","12",};
//	private Carta[][] baraja;// =new Carta[palo.length][numero.length];
	private ArrayList<Carta>cartas;
	
	
	
	public Baraja() {
	super();
	this.cartas = new ArrayList<Carta>();
}
	public ArrayList<Carta> getBaraja() {
		return cartas;
	}
	public void setBaraja(ArrayList<Carta> baraja) {
		this.cartas = baraja;
	}

	public void rellenarBaraja() {
		for (String palo : palos) {
			for (String numero : numeros) {
				this.cartas.add(new Carta(palo, numero)) ;
			}
		}
//		return this.baraja;
	}
	
	public  void mostrarCartas() {
		for (Carta carta : cartas) {
			System.out.println(carta);
		}
	}
	public List<Carta> escogerCartasAzar() {
		List<Carta>cartasAleatorias= new ArrayList<Carta>();
//		this.getBaraja()
		int numeroAleatorio=utilidades.Teclado.genearNumeroAleatorio(0, 39);
		if (numeroAleatorio+10>this.getBaraja().size()) {
			numeroAleatorio-=10;
		}else if (numeroAleatorio-10<0) {
			numeroAleatorio+=10;
		}
		Collections.shuffle(this.getBaraja());
		cartasAleatorias=this.getBaraja().subList(numeroAleatorio, numeroAleatorio+10);
		return cartasAleatorias;
	}
	public void ordenarCartasAleatorias(List<Carta>cartasAleatorias){
		 Collections.sort(cartasAleatorias);
	}
}

	
	
	
	
	
	
	
	
