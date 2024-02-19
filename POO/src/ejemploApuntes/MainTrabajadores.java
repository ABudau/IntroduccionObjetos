package ejemploApuntes;

public class MainTrabajadores {

	public static void main(String[] args) {
		Fijo trabajador1 = new Fijo("12345678H", "PEPE", 1200, 2);
		Fijo trabajador2 = new Fijo("555555555F", "MARIA", 1200, 2);
//		System.out.println(trabajador1.calcularRetenciones());
//		trabajador1.cobrar();
//		System.out.println(trabajador1.cobrar());
		//System.out.println(trabajador1);
		Comisionista trabajador3=new Comisionista("1111111111S", "Laura", 1200, 2.5,200);
		
		System.out.println(trabajador1);
		System.out.println(trabajador2);
		
		trabajador2=new Fijo(trabajador1);
		System.out.println(trabajador2);
//
////
//		Trabajador t1= trabajador1;
//		
//		System.out.println(t1.cobrar());
////		t1.calcularRetenciones();
//		System.out.println(t1.calcularRetenciones());
////		System.out.println(trabajador2.calcularRetenciones());
////		System.out.println(	trabajador2.calcularComision());
//		System.out.println(trabajador1.cobrar());


	}

}
