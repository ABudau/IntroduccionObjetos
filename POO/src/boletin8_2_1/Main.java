package boletin8_2_1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
		ejercicio4();
	}
	
	
	
	private static void ejercicio1() {
		RelojDigital r1= new RelojDigital();
		r1.establecerAlarma(20, 12);
//		r1.desactivarAlarma();
		
		System.out.println(r1.isAlarma());
		System.out.println("Hora Alarma "+r1.getHoraAlarma());
		
		RelojAnalogico r2 = new RelojAnalogico();
		
		r1.mostrarHora();
		r2.mostrarHora();
		

	}
	private static void ejercicio2() {
		Rectangulo r1= new Rectangulo(2, 4);
		Rectangulo r2= new Rectangulo(3, 5);
		Rectangulo r3= new Rectangulo(4, 6);
		Rectangulo r4= new Rectangulo(5, 7);
		Rectangulo r5= new Rectangulo(6, 8);
		
		Circulo c1= new Circulo(1);
		Circulo c2= new Circulo(2);
		Circulo c3= new Circulo(2.5);
		Circulo c4= new Circulo(3);
		Circulo c5= new Circulo(5.5);
		
		Figura[] f12=new Figura[15];
		
		f12[0]=r1;
		f12[1]=r2;
		f12[2]=r3;
		f12[3]=r4;
		f12[4]=r5;
		f12[5]=c1;
		f12[6]=c2;
		f12[7]=c3;
		f12[8]=c4;
//		f12[9]=c5;
		Figuras.setFigura(f12);
		
		System.out.println(Figuras.figuraConMasArea());
		
	}
	private static void ejercicio3() {
		Cliente c1= new Cliente("PEPE", "PEREZ", LocalDate.now(), "123455687H");
		Pelicula p1=new Pelicula("pelicula1", 10, null, Categoria.ACCION);
		Alquiler a1=new Alquiler(c1, p1, LocalDate.now());
		
		System.out.println(a1);
		

	}
	private static void ejercicio4() {
		Cliente c1= new Cliente("PEPE", "PEREZ", LocalDate.now(), "123455687H");
		Cliente c2= new Cliente("Maria", "apellido1", LocalDate.now(), "123455687H");
		
		Velero v1=new Velero("1111HHH", 5.5, LocalDate.of(2013, 05, 04), 2);
		EmbarcacionesDeportivasAMotor embarcacion1 = new EmbarcacionesDeportivasAMotor("1111HHH", 5.5, LocalDate.of(2013, 05, 04), 200);
		YatesLujo yate1=new YatesLujo("1111HHH", 5.5, LocalDate.of(2013, 05, 04), 300,10);
		
		AlquilerBarco a1= new AlquilerBarco(c1.getNombre(), c1.getDni(), LocalDate.of(2024, 01, 01), LocalDate.of(2024, 1, 10), 05, v1);
		AlquilerBarco a2= new AlquilerBarco(c2.getNombre(), c2.getDni(), LocalDate.of(2024, 01, 01), LocalDate.of(2024, 1, 10), 05, embarcacion1);
		AlquilerBarco a3= new AlquilerBarco(c1.getNombre(), c1.getDni(), LocalDate.of(2024, 01, 01), LocalDate.of(2024, 1, 10), 05, yate1);
		
		System.out.println(a1.getPrecioAlquiler());
		System.out.println(a2.getPrecioAlquiler());
		System.out.println(a3.getPrecioAlquiler());
		
	}

}
