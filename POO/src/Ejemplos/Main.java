package Ejemplos;

import Vehiculos.Bicicleta;

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
//		Bicicleta bicicleta1= new Bicicleta();
////		bicicleta1.acelerar();
////		bicicleta1.acelerar();
////		bicicleta1.acelerar();
//		bicicleta1.frenar();
//		bicicleta1.frenar();
//		bicicleta1.frenar();
//		bicicleta1.subirMarcha();
//		bicicleta1.bajarMarcha();
//		bicicleta1.bajarMarcha();
//		bicicleta1.bajarMarcha();
//		bicicleta1.mostrarEstado();
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
		Cubo cubo1 =new Cubo("plastico", false, "gris", 10, 4);
		cubo1.pintar();
		cubo1.llenar(2);
		System.out.println();
		cubo1.pintar();
		cubo1.vaciar(8);
		System.out.println();
		cubo1.pintar();
		cubo1.llenar(20);
		System.out.println();
		cubo1.pintar();
//		System.out.println(cubo1.pintaLinea(1));
//		System.out.println(cubo1.pintaLinea(2));
	}

}
