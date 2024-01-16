package Boletin8_1;

import Vehiculos.Teclado;

public class Main {

	public static void main(String[] args) {
//		ejercicio1();
//		ejercicio2();
		ejercicio3();

	}
	private static void ejercicio1() {
		Triangulo triangulo1 = new Triangulo();

		triangulo1.setAltura(8);
		triangulo1.setBase(5);

		System.out.println(triangulo1.getAltura());
		System.out.println(triangulo1.getBase());

		triangulo1.setAltura(0);
		triangulo1.setBase(0);

		System.out.println(triangulo1.getAltura());
		System.out.println(triangulo1.getBase());

	}
	private static void ejercicio2() {
		Cuadrado cuadrado1 =new Cuadrado();
		cuadrado1.setLado(4);
		cuadrado1.printCuadrado();

	}
	private static void ejercicio3() {
		Persona p1=new Persona();
		Persona p2;
		String nombre,apellidos;
		int edad;
		char sexo;
		
		System.out.println("Introduce un nombre");
		nombre=Teclado.pedirCadena();
		p1.setNombre(nombre);
		
		System.out.println("Introduce un apellidos");
		apellidos=Teclado.pedirCadena();
		p1.setApellidos(apellidos);
		
		System.out.println("Introduce edad");
		edad=Teclado.pedirNumeroPositivo();
		p1.setEdad(edad);
		
		System.out.println("Introduce sexo H/M");
		sexo=Teclado.pedirChar();
		
		System.out.println(p1.saludar());
		
		
	}

}
