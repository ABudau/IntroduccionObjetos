package modelo;

//import Atleta;

public class Karateka extends Atleta implements Comparable<Karateka> {

	public Karateka(String nombre, int edad) {
		super(nombre, edad);
		
	}

	@Override
	public void accion() {
		System.out.println("KIA!!");
	}

	@Override
	public String toString() {
		return  getNombre();
	}

	@Override
	public int compareTo(Karateka otro) {//implemento la interfaz para poder comparar un karateka con otro
		int resultado=0;
		if (this.getEdad()==otro.getEdad())
			resultado=0;
		else if(this.getEdad()<otro.getEdad())
			resultado=-1;
		else
			resultado=1;
		return resultado;
	}
	
	
	
}
