package comics.gestion;

import comics.ComicAmericano;
import comics.ComicEstandar;
import comics.Tienda;

public class Menu {
	public static void main(String[] args) {
		int opcion=0;
		do {
			mostrarMenu();
			opcion=utilidades.Teclado.recogerOpcionMenu(1, 3);
			gestionarOpcionesMenu(opcion);
		}while(opcion!=5);
		
	}
	
	
	
	private static void mostrarMenu() {
		System.out.println("¿Qué desea realizar?\n\r"
				+ "   1. Dar de alta un comic\n"
				+ "   2. Listar los cómics de un género\n"
				+ "   3. Listar los cómics cuyo nivel de relevancia está por debajo de \n      la media\n"
				+ "");
	}
	
	private static void preguntaElegirTipoComic() {
		System.out.println("¿Qué tipo de cómic quiere dar de alta?\n\r"
				+ "   1. Estándar\n"
				+ "   2. Americano\n"
				+ "");

	}
	private static void gestionarOpcionesMenu(int opcion) {
		switch (opcion) {
		case 1:
			preguntaElegirTipoComic();
			opcion=utilidades.Teclado.recogerOpcionMenu(1, 2);
			darDeAltaComic(opcion);
			break;

		default:
			break;
		}
	}



	private static void darDeAltaComic(int opcion) {
		ComicAmericano comicA;
		ComicEstandar comic;
		String titulo;
		String subtitulo;
		double precio;
		String genero;
		System.out.println("¿Cuál es el título?");
		titulo=utilidades.Teclado.pedirCadena();
		System.out.println("¿Cuál es el subtítulo?");
		subtitulo=utilidades.Teclado.pedirCadena();
		System.out.println("¿Cuál es el precio?");
		precio=utilidades.Teclado.pedirNumeroDecimalPositivo();
		System.out.println("¿Cuál es su género?");
		genero=utilidades.Teclado.pedirCadena();
		
		
		if (opcion==2) {
			int itb;
			
			System.out.println("¿Cuál es su american ITB?");
			itb=utilidades.Teclado.pedirNumeroPositivo();
			comicA= new ComicAmericano(titulo, subtitulo, genero, precio, itb);
//			comicA.setAmericanItq(itb);
			Tienda.aniadirComic(comicA);
			Tienda.mostarComicAniadido(comicA);
		}else {
			comic=new ComicEstandar(titulo, subtitulo, genero, precio);
			Tienda.aniadirComic(comic);
			Tienda.mostarComicAniadido(comic);
		}
		
	}
}
