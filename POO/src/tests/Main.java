package tests;

import modelo.Color;
import modelo.Juguete;
import modelo.Perro;
import modelo.Persona;

public class Main {

	public static void main(String[] args) {
		Juguete jugetePlastico=new Juguete("hueso de plastico", 10, false);
		Perro perro1=new Perro("Lia",Color.NEGRO,null);
		Perro perro2=new Perro("Lusi",Color.MARRON,null);
		Persona persona=new Persona("Pepe",null);
		perro1.setJuguete(jugetePlastico);
//		persona.setPerros(perro1);
//		persona.setPerros(perro1);
//		System.out.println(p1);
		jugueteFavoritoDelPerro(persona);
	}
	
	
	
	
	
	private static void jugueteFavoritoDelPerro(Persona p) {
		Perro[] perro;
		Juguete juguete;
		if (p!=null) {
			perro=p.getPerros();
			if (perro!=null) {
				juguete=perro[0].getJuguete();
				if (juguete!=null) {
					System.out.println(juguete.getNombre());
				}
			}
		}
	}

}
