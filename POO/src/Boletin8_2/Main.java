package Boletin8_2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
		ejercicio8();

	}
	
	private static void ejercicio1() {
		Cerrojo cerrojo1 =new Cerrojo();
		cerrojo1.cambiarCombinacion(123,456);
//		System.out.println(cerrojo1.getCombinacion());
		
		cerrojo1.abrirCerrojo(789);
		System.out.println(cerrojo1.isAbierto());
		cerrojo1.abrirCerrojo(456);
		System.out.println(cerrojo1.isAbierto());

	}
	private static void ejercicio2() {
//		Ordenador o1=new Ordenador(TipoOrdenador.ALL_IN_ONE, 2000, null, null, null, null, null, null, null)
		Ordenador o1=new Ordenador(32, TipoMemoria.DIMM_DDR2, 2500, 500, TipoDisco.SSHD, ModeloProcesador.INTEL_CORE_I3, 3200, 1000.00, 15.0);
		System.out.println(o1.calularPrecioMercado());
		System.out.println(o1.getModeloProcesador());
	}
	private static void ejercicio3() {
		LocalDate fecha;
		fecha=LocalDate.of(2024, 05, 17);
		calcularFecha(fecha);

	}
	/**
	 * Método que calcula y muestra la fecha de quincena en quincena
	 * @param fecha es la fecha inicial que se le pasa a partir de la cual
	 *  se calculan las quincenas
	 */
	public static void calcularFecha(LocalDate fecha) {
		final  int QUINCENA=15;//declaro una constante 
		
		for (int i = 0; i < 10; i++) {
			System.out.println(fecha=fecha.plusDays(QUINCENA));//le sumo a la fecha el valor de la constante
		}
		
	}
	
	private static void ejercicio8() {
		Inquilino i1=new Inquilino("Pepe pepito", "12345687q");
		Inquilino i2=new Inquilino("Manoli manolita", "859746225f");
		Inquilino i3=new Inquilino("fran francisco", "88888222G");
		Inquilino i4=new Inquilino("lucia gutierrex", "99885582h");
		Piso piso1=new Piso("bajo", "2b",550);
		Piso piso2=new Piso("primera", "4",650);
		Piso piso3=new Piso("segunda", "3",400);
		
		Alquiler[] alquileres=new Alquiler[1000];
		Alquiler alquiler1=new Alquiler(i4, piso3, LocalDate.of(2023, 05, 1));
		Alquiler alquiler2=new Alquiler(i3, piso2, LocalDate.of(2024, 01, 15));
		Alquiler alquiler3=new Alquiler(i2, piso1, LocalDate.of(2024, 01, 15));
		alquileres[0]=alquiler1;
		alquileres[1]=alquiler2;
		alquileres[2]=alquiler3;
		Alquiler.setAlquileres(alquileres);
//		System.out.println(piso1.getPrecioBase());
		System.out.println(alquiler1.getPrecioAlquiler());
//		Alquiler.getAlquilerMasCaro();
//		Arrays.toString(Alquiler.getAlquilerMasCaro());
		System.out.println(Alquiler.getAlquilerMasCaro());
//		mostrarAlquileres();

	}

	private static void mostrarAlquileres() {
		Alquiler [] alquileres= Alquiler.getAlquileres();
		for (Alquiler alquiler : alquileres) {
			if (alquiler!=null) {
				System.out.println(alquiler);
			}
			
		}

	}
}
