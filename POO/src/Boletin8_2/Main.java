package Boletin8_2;

public class Main {

	public static void main(String[] args) {
		
		ejercicio1();

	}
	
	private static void ejercicio1() {
		Cerrojo cerrojo1 =new Cerrojo();
		cerrojo1.cambiarCombinacion(123,456);
		System.out.println(cerrojo1.getCombinacion());
		
		cerrojo1.abrirCerrojo(789);
		System.out.println(cerrojo1.isAbierto());
		cerrojo1.abrirCerrojo(456);
		System.out.println(cerrojo1.isAbierto());

	}

}
