package modelo;

//import Atleta;

public class Karateka extends Atleta {

	public Karateka(String nombre, int edad) {
		super(nombre, edad);
		
	}

	@Override
	public void accion() {
		System.out.println("KIA!!");
	}
	
	
	
}
