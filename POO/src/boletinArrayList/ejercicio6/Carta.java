package boletinArrayList.ejercicio6;

import java.util.Objects;

/*Realiza un programa que escoja al azar 10 cartas de la baraja
española (10 objetos de la clase Carta). Emplea un objeto de la clase
ArrayList para almacenarlas, y asegúrate de que no se repite
ninguna.*/
public class Carta implements Comparable<Carta> {
	
	private String palo;
	private String numero;
	
	public Carta(String palo, String numero) {
		super();
		this.palo = palo;
		this.numero = numero;
	}

	public String getPalo() {
		return palo;
	}

	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numero=" + numero + "]\n";
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero, palo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carta other = (Carta) obj;
		return Objects.equals(numero, other.numero) && Objects.equals(palo, other.palo);
	}


	@Override
	//TODO no esta correcto
	public int compareTo(Carta otro) {
		int resultado=0;
		if (this.getPalo().equals(otro.getPalo())) {//Si los palos son iguales
			if (this.getNumero().equals("as")) {
				resultado=-1;
			}else if (otro.getNumero().equals("as")) {
				resultado=1;
			}else if (this.getNumero().compareTo(otro.getNumero())<=0) {
				resultado=-1;
			}else {
				resultado=1;
			}
		}else if(!this.getPalo().equals(otro.getPalo())){//si los palos no son iguales
			if (this.getPalo().compareTo(otro.getPalo())<=0) {
				resultado=-1;
			}else {
				resultado=1;
			}
		}else {
			resultado=1;
		}
		return resultado;
	}
	
	
	
	
	
//	 @Override
//	    public int compareTo(Carta otraCarta) {
//	        // Primero, compara por palo
//	        int comparacionPorPalo = this.palo.compareTo(otraCarta.palo);
//	        if (comparacionPorPalo != 0) {
//	            return comparacionPorPalo;
//	        }
//
//	        // Si los palos son iguales, compara por número
//	        if (this.numero.equals("as")) {
//	            return -1; // El "As" es el más pequeño
//	        } else if (otraCarta.numero.equals("as")) {
//	            return 1;
//	        }else if (this.numero.equals("rey")) {
//				return 1;
//			}else if (otraCarta.numero.equals("rey")) {
//				return -1;
//			}else if (this.numero.equals("caballo")&&otraCarta.equals("sota")) {
//				return 1;
//			}
//	            // Compara los números como cadenas de texto
//	            return this.numero.compareTo(otraCarta.numero);
//	        
//	    }
	
}
