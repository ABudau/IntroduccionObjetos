package Boletin8_1;

public class Main {

	public static void main(String[] args) {
		ejercicio1();

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

}
