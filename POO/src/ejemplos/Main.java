package Ejemplos;

import Vehiculos.Bicicleta;
import modelo.Atleta;
import modelo.Karateka;

public class Main {

	public static void main(String[] args) {
//		Perro lia;
//		lia = new Perro();
//		lia.setNombre("LIA");
//		lia.comer();
////		lia.getNombre();
//		System.out.println(lia.getNombre());
//		System.out.println(lia.getHambriento());
//		lia.ladrar();
//		
//		Libro libro1 = new Libro("11AS888-555","pepe","La cosa",20);
//		libro1.mostrarEstado();
//		Libro libro2 = new Libro();
//		libro2.mostrarEstado();
//		System.out.println(libro1.);
//		Perro perraDeAnton=new Perro("Lia","negro","Chiuaua",false);
//		Perro clonDeLia= new Perro(perraDeAnton);
//		perraDeAnton.setColor("naranja");
//		System.out.println(clonDeLia.getColor());
//		System.out.println(perraDeAnton);
//		Cubo cubo1 =new Cubo("plastico", false, "gris", 10, 4);
//		cubo1.pintar();
//		cubo1.llenar(2);
//		System.out.println();
//		cubo1.pintar();
//		cubo1.vaciar(8);
//		System.out.println();
//		cubo1.pintar();
//		cubo1.llenar(20);
//		System.out.println();
//		cubo1.pintar();
//		System.out.println(cubo1.pintaLinea(1));
//		System.out.println(cubo1.pintaLinea(2));
		
//		
//		modelo.Persona cristian=new modelo.Persona("Cristian", null);
//		System.out.println("Su nombre "+cristian.getNombre());
//		
//		
//		Superheroe ironMan=new Superheroe("Tony",null,"...");
//		System.out.println("El nombre del heroe es "+ironMan.getNombre());
//		
//		SuperheroeConIdentidadSecreta spiderman=new SuperheroeConIdentidadSecreta("Peter",null,"...");
//		System.out.println("El nombre del heroe es "+spiderman.getNombre());
		
		//		Moto miMoto=new Moto("1234EEE", "HONDA", null, null, 55,5, 190);
		
		Atleta a1 =new Atleta("Atleta", 19);
		Karateka k1= new Karateka("Karateka", 17);
		atletaRelizaAccion(k1);
		System.out.println("*********");
		atletaRelizaAccion(a1);
//		a1=k1;
//		a1.accion();
		
		
	}
	private static void atletaRelizaAccion(Atleta a1) {
		System.err.println(a1.getNombre());
		a1.accion();
	}

}
