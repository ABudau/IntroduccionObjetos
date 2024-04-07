package boletin_HasMap;


import java.util.HashMap;
import java.util.List;
import java.util.Set;

import boletin_HasMap.ejercicio4.*;
import boletinArrayList.ejercicio6.Baraja;
import boletinArrayList.ejercicio6.Carta;
import utilidades.Teclado;

public class EjerciciosHasMap {

	public static void main(String[] args) {
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
		ejercicio4();
	}
	
	private static void ejercicio1() {
		
		HashMap<String, String> diccionario = crearDiccionario();
		traduceLaPalabra(diccionario);
	}

	private static HashMap<String, String> crearDiccionario() {
		HashMap<String, String> diccionario = new HashMap<String, String>();
		diccionario.put("amigo", "friend");
		diccionario.put("casa", "house");
		diccionario.put("perro", "dog");
		diccionario.put("gato", "cat");
		diccionario.put("libro", "book");
		diccionario.put("tiempo", "time");
		diccionario.put("comida", "food");
		diccionario.put("agua", "water");
		diccionario.put("trabajo", "work");
		diccionario.put("familia", "family");
		diccionario.put("escuela", "school");
		diccionario.put("dinero", "money");
		diccionario.put("amor", "love");
		diccionario.put("música", "music");
		diccionario.put("viaje", "trip");
		diccionario.put("bueno", "good");
		diccionario.put("mal", "bad");
		diccionario.put("feliz", "happy");
		diccionario.put("triste", "sad");
		diccionario.put("sueño", "dream");
		diccionario.put("dulce", "sweet");
		return diccionario;
	}
	private static void traduceLaPalabra(HashMap<String, String> diccionario) {
		System.out.print("Introduce la palabra a traducir");
		String palabra=utilidades.Teclado.pedirNombre().toLowerCase();
		System.out.print(diccionario.get(palabra));

	}
	private static void ejercicio2() {
		HashMap<String, String> diccionario = crearDiccionario();
		HashMap<String, String> diccionarioCinco=generarDiccionarioCincoPalabras(diccionario);
		comprobarPalabra(diccionarioCinco);
		
	}

	private static HashMap<String, String> generarDiccionarioCincoPalabras(HashMap<String, String> diccionario) {
		HashMap<String, String> diccionarioCinco = new HashMap<String, String>();
		Set<String> claves= diccionario.keySet();//Obtengo las claves y las almaceno
		
		Object[] keys=new Object[claves.size()];//Creo un array de tipo object 
		keys= claves.toArray();//almaceno las claves en el array de Object
		int numero;
		for (int i = 0; i < keys.length&&diccionarioCinco.size()<5; i++) {
			numero=utilidades.Teclado.genearNumeroAleatorio(0, keys.length-1);//genero un numero aleatorio
			diccionarioCinco.put(keys[numero].toString(), diccionario.get(keys[numero].toString()));//añado al nuevo diccionario la clave y el valor aleatorio que corresponde
		}
		return diccionarioCinco;
	}
	public static void comprobarPalabra(HashMap<String, String> diccionario){
		Set<String>palabrasEspaniol=diccionario.keySet();
		int contadorCorrecta=0;
		int contadorIncorrecta=0;
		String respuesta;
		System.out.println("Escribe la traducción de la palabra al inglés");
		for (String palabra : palabrasEspaniol) {
			System.out.println(palabra);
			respuesta=utilidades.Teclado.pedirNombre();
			if (diccionario.containsKey(palabra)&&diccionario.containsValue(respuesta)) {
				contadorCorrecta++;
			}else {
				contadorIncorrecta++;
			}
		}
		System.out.println("Las respuestas correctas son "+ contadorCorrecta);
		System.out.println("Las respuestas incorrectas son "+ contadorIncorrecta);
	}
	/*Escribe un programa que genere una secuencia de 5 cartas de la
	baraja española y que sume los puntos según el juego de la brisca.
	El valor de las cartas se debe guardar en una estructura
	HashMap que debe contener parejas (figura, valor), por
	ejemplo (“caballo”, 3).
	La secuencia de cartas que se generen debe de guardarse en una
	estructura de la clase ArrayList que contiene objetos de la clase
	Carta. El valor de las cartas es el siguiente: as → 11, tres → 10, sota
	→ 2, caballo → 3, rey → 4; el resto de cartas no vale nada.*/
	public static void ejercicio3() {
		Baraja baraja= new Baraja();
		baraja.rellenarBaraja();
		
		List<Carta> barajaAleaotria=baraja.escogerCartasAzar(5);//lleno la baraja con cartas aleatorias
		HashMap<String, Integer> barajaValor = crearBarajaConValor();//creo la baraja con los valores

		mostrarYCalcularResultado(barajaValor, barajaAleaotria);//calculo y muestro el resultado
		
	}

	private static HashMap<String, Integer> crearBarajaConValor() {
		HashMap<String, Integer>barajaValor= new HashMap<String, Integer>();
		barajaValor.put("as", 11);
		barajaValor.put("3", 10);
		barajaValor.put("sota", 2);
		barajaValor.put("caballo", 3);
		barajaValor.put("rey", 4);
		return barajaValor;
	}

	private static void mostrarYCalcularResultado(HashMap<String, Integer> barajaValor,
			List<Carta> barajaAleaotria) {
		int suma=0;
		for (Carta carta : barajaAleaotria) {
			System.out.print(carta);
			if (barajaValor.containsKey(carta.getNumero())) {
				suma+=barajaValor.get(carta.getNumero());
			}
		}
		System.out.println("La puntuación de las cartas generadas es: "+suma);
	}
	private static void ejercicio4() {
		int opcion=0;
		Almacen almacen = new Almacen();
		
		do{
			Menu.mostrarMenuPrincipal();
			 opcion=utilidades.Teclado.recogerOpcionMenu(1, 7);
			realizarAccionSeleccionada(opcion,almacen);
		}while(opcion!=7);
	}
	
	private static void realizarAccionSeleccionada(int opcion,Almacen almacen) {
		switch (opcion) {
		case 1:
			almacen.mostrarProductos();
			break;
		case 2:
			try {
				if (almacen.darAltaProducto(gestionAlta())) {
					System.out.println("El producto se ha añadido correctamente");
				}
			} catch (ProductoAlreadyExistsException e) {
				System.out.println("ERROR El producto que intenta añadir ya existe");
			}
			break;
		case 3:
			gestionBaja(almacen);
			break;
		case 4:
			gestionModificacion(almacen);
			break;
		case 5:
			gestionMercancia(almacen,opcion);
			break;
		case 6:
			gestionMercancia(almacen,opcion);
			break;
		}
	}
	/**
	 * Método que gestiona el stock de los productos del almacen
	 * @param almacen es el almacen donde están almacenados los
	 * productos
	 * @param opcion es la opcion que se le pasa y dependiendo de la opcion
	 * aumenta o disminuye el stock
	 */
	public static void gestionMercancia(Almacen almacen,int opcion) {
		String codigo;
		int cantidad;
		System.out.print("Introduce el código de la mercancía");
		codigo=utilidades.Teclado.pedirCadena();
		if (almacen.getProductos().containsKey(codigo)) {//Si encuentra un producto con ese codigo
			System.out.print("Introduce la cantidad de productos: ");
			cantidad=utilidades.Teclado.pedirNumeroPositivo();
			if (opcion==5) {
				if (almacen.entradaMercancia(codigo, cantidad)) {//Si se cumple 
					System.out.println("El stock a aumentado");//Muestro el mensaje
				}
			}else if (opcion==6) {
				if (almacen.salidaMercancia(codigo, cantidad)) {
					System.out.println("El stock ha bajado");
				}
			}
		}else {
			System.out.println("ERROR NO SE HA ENCONTRADO EL PRODUCTO");
		}
	}

	private static Producto gestionAlta() {
		System.out.println("Introduce el código del Producto");
		String codigo=utilidades.Teclado.pedirCadena();
		System.out.println("Introduce descripcion");
		String descripcion=utilidades.Teclado.pedirCadena();
		System.out.println("Introduce un precio de venta");
		double precio=utilidades.Teclado.pedirNumeroDecimalPositivo();
		System.out.println("Introduce stock del producto");
		int stock= utilidades.Teclado.pedirNumeroPositivo();
		return new Producto(codigo, descripcion, precio, stock);
		 
		
	}
	private static void gestionBaja(Almacen almacen) {
		System.out.print("Introduce el codigo del producto que desea borrar: ");
		String codigoProducto= utilidades.Teclado.pedirCadena();
		if (almacen.darBajaProducto(codigoProducto)) {
			System.out.println("EL PRODUCTO HA SIDO BORRADO");
		}else {
			System.out.println("No se encuentra el producto");
		}

	}
	private static void gestionModificacion(Almacen almacen) {
		System.out.print("Introduce el codigo del producto que desea modificar: ");
		String codigoProducto= utilidades.Teclado.pedirCadena();
		comprobarExistenciaProducto(almacen, codigoProducto);
		
	}

	private static void comprobarExistenciaProducto(Almacen almacen, String codigoProducto) {
		if (!almacen.getProductos().containsKey(codigoProducto)) {
			System.out.println("No se encuentra el producto ");
			
		}else {
			System.out.println(almacen.getProductos().get(codigoProducto));
			Menu.mostrarMenuModificar();
			int opcion=utilidades.Teclado.recogerOpcionMenu(1, 3);
			Producto producto= almacen.getProductos().get(codigoProducto);

			if(almacen.modificarProducto(gestionarOpcionesModificar(opcion,producto))) {
				System.out.println("Producto modificado correctamente");
			}
		}
	}

	private static Producto gestionarOpcionesModificar(int opcion,Producto p) {
		//Obtengo los datos almacenados del producto
		String codigo=p.getCodigo();
		String descripcion=p.getDescripcion();
		double precio=p.getPrecioVenta();
		int stock=p.getStock();
		
		if (opcion==1) {
			System.out.println("La descripción actual es: "+descripcion);
			System.out.println("Introduce la nueva descripción");
			descripcion=utilidades.Teclado.pedirCadena();
		}else if (opcion==2) {
			System.out.println("El precio actual es: "+precio);
			System.out.println("Introduce el nuevo precio");
			precio=utilidades.Teclado.pedirNumeroDecimalPositivo();
		}else if (opcion==3) {
			System.out.println("El stock actual es: "+stock);
			System.out.println("Introduce el nuevo stock");
			stock=utilidades.Teclado.pedirNumeroPositivo();
		}
		//Dependiendo de la opción escogida, devuelve un producto con el dato modificado
		return new Producto(codigo, descripcion, precio, stock);
	}
}
