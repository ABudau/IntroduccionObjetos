package tests;

import Modelo.Persona;
import Modelo.Color;
import Modelo.Juguete;
import Modelo.Perro;

public class Main {

	public static void main(String[] args) {
		Juguete jugetePlastico=new Juguete("hueso de plastico", 10, false);
		Perro perro1=new Perro("Lia",Color.NEGRO,null);
		Persona persona=new Persona("Pepe",null);
		perro1.setJuguete(jugetePlastico);
//		persona.setPerro(perro1);
//		System.out.println(p1);
		jugueteFavoritoDelPerro(persona);
	}
	
	
	
	
	
	private static void jugueteFavoritoDelPerro(Persona p) {
		Perro perro;
		Juguete juguete;
		if (p!=null) {
			perro=p.getPerro();
			if (perro!=null) {
				juguete=perro.getJuguete();
				if (juguete!=null) {
					System.out.println(juguete.getNombre());
				}
			}
		}
	}

}
