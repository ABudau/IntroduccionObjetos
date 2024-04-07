package boletinArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import boletinArrayList.ejercicio4.Empleado;
import boletinArrayList.ejercicio5.Almacen;
import boletinArrayList.ejercicio5.Menu;
import boletinArrayList.ejercicio5.Producto;
import boletinArrayList.ejercicio5.ProductoAlreadyExistsException;
import boletinArrayList.ejercicio6.Baraja;
import boletinArrayList.ejercicio6.Carta;
import vehiculos.Teclado;

public class EjerciciosColecciones {

	public static void main(String[] args) {

//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
		ejercicio7();

	}
	
	/*
	 *Ejercicio 1 Crea un ArrayList con los nombres de 6 compañeros de clase que se
	   introduzcan por consola. A continuación, muestra esos nombres por
	   pantalla. Utiliza para ello un bucle for (for-each) que recorra todo el
	   ArrayList. Imprimir la misma lista también en orden inverso 
	 */
	private static void ejercicio1() {
		String nombre;
		ArrayList<String> nombres= new ArrayList<String>();//declaro mi lista de tipo Sring
	do {
		nombre=utilidades.Teclado.pedirNombre();//pido que se introduzca nombre y lo almaceno
		nombres.add(nombre);//añado el nombre a la lista
	}while(nombres.size()<=5);
	
	
	mostrarNombres(nombres);
	System.out.println("\nOrden inverso\n");
	Collections.reverse(nombres);
	mostrarNombres(nombres);
	}

	private static void mostrarNombres(ArrayList<String> nombres) {
		if (nombres!=null) {
			for (String nombreCompi : nombres) {
				System.out.println(nombreCompi);//muestro los nombres de la lista de tipo String
			}
		}
	}
	
	/*Ejercicio 2 Realiza un programa que introduzca valores aleatorios (entre 0 y
	100) en un ArrayList y que luego calcule la suma, la media, el
	máximo y el mínimo de esos números. El tamaño de la lista también
	será aleatorio y podrá oscilar entre 10 y 20 elementos ambos
	inclusive.*/
	
	private static void ejercicio2() {
		int tamanio=utilidades.Teclado.genearNumeroAleatorio(10, 20);//tamaño del arraylist
		int valorAleatorio;
		
		ArrayList<Integer> numeros= new ArrayList<Integer>();
		
		for (int i = 0; i < tamanio; i++) {
			valorAleatorio=utilidades.Teclado.genearNumeroAleatorio(0, 100);
			numeros.add(valorAleatorio);//añado a la lista el valor generado
		}
		

		mostrarResultados(numeros);//muestro los resultados si numeros no es null
		
	}
	private static void mostrarResultados(ArrayList<Integer> numeros) {
		if (numeros!=null) {
			System.out.println("La suma es: "+obtenerSumaListaNumeros(numeros));
			System.out.printf("La media es: %.2f\n",obtenerMediaListaNumeros(numeros));
			System.out.println("El mayor es: "+ obtenerElNumeroMinMax(numeros, 1));
			System.out.println("El menor es: "+ obtenerElNumeroMinMax(numeros, 2));
		}
	}
	/**
	 * Este método devuelve el número mayor o menor de una lista dependiendo
	 * de la opción escogida
	 * @param numeros es la lista de números que se le pasa como parámetro
	 * @param opcion es la opción que deseemos, si se le pasa un 1 devuelve el número 
	 * más grande de la lista, su se le pasa un 2 devuelve el número más pequeño.
	 * @return devuelve el valor mayor o menor de una lista.
	 */
	
	public static int obtenerElNumeroMinMax(ArrayList<Integer> numeros,int opcion) {
		int valor = 0;
		if (opcion==1) {
			valor=Collections.max(numeros);//almaceno en valor el numero mas grande
		}else if (opcion==2) {
			valor=Collections.min(numeros);//almaceno en valor el numero mas pequeño
		}
		 return valor;

	}
	/**
	 * Método que obtiene la suma de todos los numeros de una lista que se
	 * le pasa como parámetro
	 * @param numeros es la lista de numeros que se le pasa
	 * @return devuelve la suma de los números
	 */
	public static int obtenerSumaListaNumeros(ArrayList<Integer> numeros) {
			int suma = 0;
			for (Integer numero : numeros) {
				suma+=numero;
			}
		return suma;
		
	}
	/**
	 * Método que devuelve la media de una lista de números que se le pasa
	 * como parámetro
	 * @param numeros es la lista de números que se le pasa como parámetro
	 * @return devuelve la media de los números de la lista
	 */
	public static double obtenerMediaListaNumeros(ArrayList<Integer> numeros) {
		
		return (double)obtenerSumaListaNumeros(numeros)/numeros.size();
	}
	
	/*Ejercicio 3 Escribe un programa que ordene 10 números enteros introducidos
		por teclado y almacenados en un objeto de la clase ArrayList.*/
	
	private static void ejercicio3() {
		ArrayList<Integer> numeros=new ArrayList<Integer>();
		boolean tamanioNumeros;//declaro una bandera
		int contador=1,numero;
		System.out.println("Introduce 10 numeros: ");
		do {
			System.out.println("Introduce el numero "+contador++);
			numero=utilidades.Teclado.pedirNumero();
			numeros.add(numero);
			tamanioNumeros= numeros.size()<10;//asigno a la bandera la condicion de que el tamaño del arrayList sea menor que 10
		}while(tamanioNumeros);//cuando el tamaño del arrayList sea 10 el bucle para

		Collections.sort(numeros);//ordeno los números
		
		mostrarNumeros(numeros);
	}
	private static void mostrarNumeros(ArrayList<Integer> numeros) {
		for (Integer integer : numeros) {
			System.out.println(integer);//muestro los números
		}
	}
	/*	Ejercicio 4
		Crear una clase llamada Empleado, con los atributos nombre y
		sueldo. Realizar un programa que pida por pantalla 4 empleados y
		hacer un listado donde se muestre un listado ordenado en orden
		ascendente y descendente teniendo en cuenta el sueldo como criterio
		de ordenación*/
	
	
	private static void ejercicio4() {
		ArrayList<Empleado>empleados= new ArrayList<Empleado>();
		int contador=1,sueldo;
		String nombre;
		System.out.println("Introduce 4 empleados: ");
		Empleado empleado1;
		do {
			System.out.println("Introduce los datos del empleado "+contador++);
			nombre=pedirNombreEmpleado();
			sueldo=pedirSalarioEmpleado();
			empleado1= new Empleado(nombre, sueldo);
			empleados.add(empleado1);
	
		}while(empleados.size()<4);
		
		mostrarEmpleados(empleados);
		
		System.out.println("\nEmpleados ordenados de menor a mayor");
		Collections.sort(empleados);//Hay que implementar la interfaz Comparable<Empleado>
		mostrarEmpleados(empleados);
		
		System.out.println("\nEmpleados ordenados de mayor a menor");
		Collections.reverse(empleados);
		mostrarEmpleados(empleados);

	}
	
	private static void mostrarEmpleados(ArrayList<Empleado> empleados) {
		if (empleados!=null) {
			for (Empleado empleado : empleados) {
				System.out.println(empleado);
			}
		}
		
	}
	private static int pedirSalarioEmpleado() {
		int sueldo = 0;
//		boolean errorSueldo;
//		do {//se repite hasta que el sueldo sea correcto/sea un número positivo
//			try {
				System.out.println("Introduce salario: ");
//				sueldo=utilidades.Teclado.pedirNumeroPositivo();
				return utilidades.Teclado.pedirNumeroPositivo();
//				errorSueldo=false;
//			}catch (Exception e) {//si el usuario introduce algun dato que no sean números, salta la excepcion
//				System.out.println("Error. Vuelve a introducir el salario");
//				errorSueldo=true;
//			}
//		}while(errorSueldo);
//		return sueldo;//devuelvo el sueldo correcto
	}
	private static String pedirNombreEmpleado() {
		String nombre=null;
		do {
			System.out.println("Introduce nombre:");
			nombre=Teclado.pedirCadena();
				
		}while(!comprobarSiTodoSonLetrasOEspacio(nombre));
		return nombre;
	}
	/**
	 * Método que se le pasa una cadena de texto y devuelve true si la cadena de texto 
	 * se compone de letras o espacios. Si encuentra un número u otro caracter devuelve false
	 * @param nombre es la cadena de texto a examinar
	 * @return devuelve true si todo son letras o espacios, devuelve false si no es lo comentado
	 * anteriormente
	 * @author Budau
	 */
	
	public static boolean comprobarSiTodoSonLetrasOEspacio(String nombre) {
		boolean valido=true;
		
		for (int i = 0; i < nombre.length()&&valido; i++) {//recorro cada una de las posiciones de la cadena de texto
			
			if (!Character.isLetter(nombre.charAt(i))&&nombre.charAt(i)!=' ') {//comparo cada posicion de la cadena de texto comprobando que sea una letra o un espacio
				valido=false;//si no lo es valido vale false
			}
		}
		return valido;//devuelvo el valor
	}
	/*Ejercicio 5
	Crea el programa GESTISIMAL (GESTIón SIMplificada de Almacén)
	para llevar el control de los artículos de un almacén. De cada artículo
	se debe saber el código, la descripción, el precio de venta y el stock
	(número de unidades). El menú del programa debe tener, las
	siguientes opciones:
	1. Listado
	2. Alta
	3. Baja
	4. Modificación
	5. Entrada de mercancía
	6. Salida de mercancía
	7. Salir
	La entrada y salida de mercancía supone respectivamente el
	incremento y decremento de stock de un determinado artículo. Hay
	que controlar que no se pueda sacar más mercancía de la que hay en
	el almacén.
	Habría que crear la clase Producto con los atributos que dice el
	enunciado. Por otro lado estaría la clase Almacen, que tendría una
	lista de Artículos, y tendría una seríe de método para gestionar cada
	una de las operaciones que se muestran en el menú. En la clase
	principal del proyecto habría una instancia del almacen, y un menú
	que iria llamando a los distintos métodos de la clase almacen*/
	private static void ejercicio5() {
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
		if (almacen.buscarProducto(codigo)!=null) {//Si encuentra un producto con ese codigo
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
		if (almacen.buscarProducto(codigoProducto)==null) {
			System.out.println("No se encuentra el producto ");
			
		}else {
			System.out.println(almacen.buscarProducto(codigoProducto));
			Menu.mostrarMenuModificar();
			int opcion=utilidades.Teclado.recogerOpcionMenu(1, 3);
			Producto producto= almacen.buscarProducto(codigoProducto);

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
	/*Realiza un programa que escoja al azar 10 cartas de la baraja
	española (10 objetos de la clase Carta). Emplea un objeto de la clase
	ArrayList para almacenarlas, y asegúrate de que no se repite
	ninguna.*/
	
	private static void ejercicio6() {
		Baraja b1 = new Baraja();
		b1.rellenarBaraja();
		b1.mostrarCartas();
		System.out.println(b1.escogerCartasAzar(10));

	}
	private static void ejercicio7() {
//		ejercicio6();
		List<Carta> cartas= new ArrayList<Carta>();
		Baraja b1 = new Baraja();
		b1.rellenarBaraja();
		b1.mostrarCartas();
		cartas=b1.escogerCartasAzar(10);
		System.out.println(cartas);
		b1.ordenarCartasAleatorias(cartas);
		System.out.println(cartas);
		
	}
}