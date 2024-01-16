package Vehiculos;

//ESTE MAIN ES DE LA BICICLETA
public class Main {

	public static void main(String[] args) {
//		Bicicleta b1;
//		int velocidadActual,cadencia,marcha;
////		System.out.println("Introduce la velocidad actual de la bicicleta");
//		
//		b1= new Bicicleta(10,10,3,"Bici1");
//		Bicicleta b2=new Bicicleta();
//		b2.setNombre("bici2");
//		bicicletaMasRapida(b1, b2);
//	bicicleta1.acelerar();
//	bicicleta1.acelerar();
//	bicicleta1.acelerar();
//	bicicleta1.frenar();
//	bicicleta1.frenar();
//	bicicleta1.frenar();
//	bicicleta1.subirMarcha();
//	bicicleta1.bajarMarcha();
//	bicicleta1.bajarMarcha();
//	bicicleta1.bajarMarcha();
//	bicicleta1.mostrarEstado();
		
		Coche cocheDeJC=new Coche("Passat","34567");
		Coche cocheDeCristian=new Coche("Focus","54678");
		
		cocheDeJC.setKm(200000);
		cocheDeCristian.setKm(210000);
		System.out.println(Coche.getKmTotales());
		System.out.println(Coche.getCochesCreados());
	}
	public static void bicicletaMasRapida(Bicicleta bici1,Bicicleta bici2) {
		if (bici1.getVelocidaActual()>bici2.getVelocidaActual()) {
			System.out.println(bici1.getNombre());
		}else {
			System.out.println(bici2.getNombre());
		}
	}

}
