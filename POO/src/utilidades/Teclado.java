package utilidades;


import java.util.Scanner;

public class Teclado {
	/**
	 * Método que pide un número entero por teclado. Comprueba si es mayor
	 * o igual que 0 si es así devuelve el número introducido. Si no es
	 * así vuelve a pedir el número
	 * @return devuelve el número mayor que 0
	 * @author Budau_Andrei
	 * @version 1.0
	 */
	public static int pedirNumeroPositivo() {//función que pide un número positivo
//		Scanner teclado=new Scanner(System.in);
		int numero;//declaro las variables
		boolean positivo=false;
		do {
//			System.out.println("Introduce un valor: ");//pido que se introduzca el radio
			numero=pedirNumero();//recojo el valor y lo almaceno en la variable radio
			if(numero<=0) {//si el radio es menor o igual a 0 
				System.out.println("Error. El valor tiene que ser mayor que 0");//muestro el mensaje
			}else {//si el radio es mayor que 0 
				positivo=true;//modifico el valor de positivo y el bucle terminaria.
			}
		}while(!positivo);

		return numero;//devuelvo el valor de numero
	}
	/**
	 * Método que pide un número decimal por teclado. Comprueba si es mayor
	 * o igual que 0 si es así devuelve el número introducido. Si no es
	 * así vuelve a pedir el número
	 * @return devuelve el número mayor que 0
	 * @author Budau_Andrei
	 * @version 1.0
	 */
	public static double pedirNumeroDecimalPositivo() {//función que pide un número positivo
		double numero;//declaro las variables
		boolean positivo=false;
		do {
//			System.out.println("Introduce un valor: ");//pido que se introduzca el radio
			numero=pedirNumeroDecimal();//recojo el valor y lo almaceno en la variable radio
			if (numero<=0) {//si el radio es menor o igual a 0 
				System.out.println("Error. El valor tiene que ser mayor que 0");//muestro el mensaje
			}else {//si el radio es mayor que 0 
				positivo=true;//modifico el valor de positivo y el bucle terminaria.
			}
		}while(!positivo);

		return numero;//devuelvo el valor de numero
	}
	/**
	 * Método que pide una cadena por teclado
	 * @return devuelve la cadena introducida
	 * @author Budau_Andrei
	 * @version 1.0
	 */
	public static String pedirCadena() {
		Scanner teclado=new Scanner(System.in);

		return teclado.nextLine();
	}
	/**
	 * Método que pide un caracter por teclado
	 * @return devuelve el caracter introducido
	 * @author Budau_Andrei
	 * @version 1.0
	 */
	public static char pedirChar() {
		Scanner teclado=new Scanner(System.in);

		return teclado.nextLine().charAt(0);
	}
	/**
	 * Método que se encarga de rellenar un array
	 * @param array es el array que se le pasa como parámetro para ser rellenado
	 * @param contador es el parámetro que se le pasa para definir el tamaño del array
	 * <br>pedirCadena() se encarga de recoger el nombre
	 * @author Budau_Andrei
	 * @version 1.0
	 */
	public static void rellenarArray(String array[],int contador) {
		for (int i = 0; i < contador; i++) {
			
			array[i]=pedirCadena();//añado el nombre introducido en la posición de la i en el array.
		}
	}
	
	/**
	 * Método que muestra el contenido de un array de Strings
	 * @param array es el array a mostrar 
	 * @author Budau_Andrei
	 * @version 1.0
	 */
	public static void mostrarArray(String array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
	/**
	 * Método que muestra el contenido de un array de enteros
	 * @param array es el array a mostrar 
	 * @author Budau_Andrei
	 * @version 1.0
	 */
	public static void mostrarArray(int array[]) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+" ");
		}

	}
	/**
	 * Método que devuelve un número comprendido entre dos números
	 * @param n1 es el número minimo
	 * @param n2 es el número máximo
	 * @return devuelve el número comprendido entre los dos números que se le pasan como parámetro
	 * @author Budau_Andrei
	 * @version 1.0
	 */
	public static int recogerOpcionMenu(int n1,int n2) {//metodo que recoge la opcion del menu y la devuelve
		int opcion;//declaro la variable
		boolean valido=false;
		do {//inicio del bucle

			opcion=pedirNumero();//recojo el valor introducido por teclado y lo almaceno en la variable opcion
			if (opcion<n1||opcion>n2) {//si la opcion es menor que 1 
				System.out.println("Error Escoge una opción correcta entre "+n1+" y "+n2);//muestro el mensaje

			}else {//si la opcion esta entre el 1 o el 3 
				valido=true;//asigno el valor true a valido y el bucle para
			}
		}while(!valido);
		return opcion;
		//		teclado.close();


	}
	/**
	 * Método que devuelve un número comprendido entre dos números
	 * @param n1 es el número minimo
	 * @param n2 es el número máximo
	 * @return devuelve el número comprendido entre los dos números que se le pasan como parámetro
	 * @author Budau_Andrei
	 * @version 1.0
	 */
	public static int recogerValorValido(int n1,int n2) {
		int opcion;//declaro la variable
		boolean valido=false;
		do {//inicio del bucle

			opcion=pedirNumero();//recojo el valor introducido por teclado y lo almaceno en la variable opcion
			if (opcion<n1||opcion>n2) {//si la opcion es menor que 1 
				System.out.println("Error. Escoge un valor válido entre "+n1+" y "+n2);//muestro el mensaje

			}else {//si la opcion esta entre el 1 o el 3 
				valido=true;//asigno el valor true a valido y el bucle para
			}
		}while(!valido);
		return opcion;
		//		teclado.close();


	}
	/**
	 * Método que genera un número aleatorio entre dos números
	 * @param min es el número minimo
	 * @param max es el número máximo
	 * @return devuelve el número aleatorio generado
	 */
	public static int genearNumeroAleatorio(int min,int max) {//metodo que genera un número aleatrio entre un mínimo y un máximo
		int numAux;
		if (min>max) {//si el numero minimo es mayor que el numero mayor
			numAux=min;//guardo el valor de min en la variable aux
			min=max;//guardo el valor de max en la variable min
			max=numAux;//guardo el valor de numAux en max es decir intercambio los valores
		}
		int numero=(int)(Math.random()*(max - min+1) + min);//declaro una variable y almaceno el valor de las operaciones
		return numero;//devuelvo el número generado
	}
	
	/**
	 * Método que comprueba la existencia de un número entero dentro de un array
	 * @param numero es el número a buscar dentro del array
	 * @param array es el array que le pasamos para buscar dentro el número
	 * @return devuelve true si encuentra el número y devuelve false si no lo encuentra
	 * @author Budau
	 * @version 1.0
	 */
	public static boolean comprobarNumeroDentroDeArray(int numero,int array[]) {
		
		boolean contains=false;//declaro una variable 
		for (int i = 0; i < array.length&&contains!=true; i++) {//declaro un bucle y le pongo como condición que se ejecute
																//hasta que llegue al final de la extensión del array y 
																//que se ejecute mientras que contains tenga un valor false
			if (array[i]==numero) {//si la posicion i dentro del array coincide con el número que busco
				contains=true;//contains vale true
			}else {//si la posicion i dentro del array no coincide con el número que busco
				contains=false;//contains vale false
			}
		}
		return contains;//devuelvo el valor de contains
	}
	/**
	 * Método que comprueba la existencia de una cadena  dentro de un array
	 * @param valor es la cadena a buscar dentro del array
	 * @param array es el array que le pasamos para buscar dentro el número
	 * @return devuelve true si encuentra la cadena y devuelve false si no la encuentra
	 * @author Budau
	 * @version 1.0
	 */
	public static boolean comprobarCadenaDentroDeArray(String valor,String array[]) {
		
		boolean contains=false;//declaro una variable 
		for (int i = 0; i < array.length&&contains!=true; i++) {//declaro un bucle y le pongo como condición que se ejecute
																//hasta que llegue al final de la extensión del array y 
																//que se ejecute mientras que contains tenga un valor false
			if (array[i].equals(valor)) {//si la posicion i dentro del array coincide con el número que busco
				contains=true;//contains vale true
			}else {//si la posicion i dentro del array no coincide con el número que busco
				contains=false;//contains vale false
			}
		}
		return contains;//devuelvo el valor de contains
	}
	/**
	 * Método que rellena un array con números enteros aleatrorios
	 * @param tamanio es el tamaño del array a rellenar
	 * @param numeroMinimo es el número minimo del rango de números aleatorios a generar
	 * @param numeroMaximo es el número máximo del rango de números aleatorios a generar
	 * @return devuelve un array rellenado de números aleatorios
	 * @author Budau
	 * @version 1.0
	 */
	public static int[] rellenarArrayConNumerosAleatorios(int tamanio,int numeroMinimo,int numeroMaximo) {
		int array[]=new int[tamanio];//declaro un nuevo array con el tamaño indicado
		for (int i = 0; i < array.length; i++) {
			array[i]=Teclado.genearNumeroAleatorio(numeroMinimo, numeroMaximo);//almaceno en la posicion de array[i] el número aleatorio generado
		}
		return array;//devuelvo el array relleno
	}
	/**
	 * Método que genera un número aleatorio y lo almacena dentro de un array y comprueba
	 * que ese número no esté almacenado en ninguna posición, si está almacenado genera otro número
	 * aleatorio de forma que el ciclo se repite hasta que se genera un número que no esté almacenado
	 * @param numerosAgenerar son la cantidad de numeros que queremos que se generen
	 * @param min es el número minimo desde el que parte el rango de números a generar
	 * @param max es el número máximo hasta el que llega el rango de números a generar
	 * @return devuelve el número generado
	 * @author Budau
	 * @version 1.0
	 */
	public static int generarNumeroNoRepetido(int numerosAgenerar,int min,int max) {
		int numerosAleatorios[]= new int[numerosAgenerar];
		int numero;//declaro las variables
		boolean contains;
		do {//ejecuto el do hasta que contains tenga un valor false
			numero=Teclado.genearNumeroAleatorio(min, max);//genero el número aleatorio y almaceno el valor en la variable
			contains=comprobarNumeroDentroDeArray(numero, numerosAleatorios);//compruebo si el número que se ha generado
		}while(contains!=false);												//está almacenado en el array
		return numero;
	}
	
	/**
	 * Método que se le pasa una cadena de texto y devuelve true si la cadena de texto 
	 * se compone de letras o espacios. Si encuentra un número u otro caracter devuelve false
	 * @param nombre es la cadena de texto a examinar
	 * @return devuelve true si todo son letras o espacios, devuelve false si no es lo comentado
	 * anteriormente
	 * @author Budau
	 */
	
	public static boolean comprobarNombre(String nombre) {
		boolean valido=true;
		
		for (int i = 0; i < nombre.length()&&valido; i++) {
			
			if (!Character.isLetter(nombre.charAt(i))&&nombre.charAt(i)!=' ') {
				valido=false;
			}
		}
		return valido;
	}
	
	/**
	 * Método que pide un nombre(Cadena de texto) solo con letras
	 * y espacios
	 * @return devuelve una cadena de texto solo con letras y espacios
	 */
	public static String pedirNombre() {
		String nombre=null;
		do {
			
			System.out.println("Introduce nombre:");
			nombre=Teclado.pedirCadena();
			if (!comprobarNombre(nombre)) {
				System.out.println("ERROR. EL NOMBRE NO PUEDE CONTENER NUMEROS O CARACTERES");
			}
		}while(!comprobarNombre(nombre));
		return nombre;
	}
	private static int pedirNumeroAux() {
		Scanner teclado= new Scanner(System.in);
		return teclado.nextInt();
	}
	private static double pedirNumeroAuxDecimal() {
		Scanner teclado= new Scanner(System.in);
		return teclado.nextDouble();
	}
	/**
	 * Método que recoge y controla que el valor que se
	 * ha introducido es un número y devuelve el número 
	 * introducido por teclado
	 * @return devuelve el número introducido por teclado
	 */
	public static int pedirNumero() {
		int numero = 0;
		boolean valido;
		do {//se repite hasta que el sueldo sea correcto/sea un número positivo
			try {
				numero=pedirNumeroAux();
				valido=false;
			}catch (Exception e) {//si el usuario introduce algun dato que no sean números, salta la excepcion
				System.out.println("Error: INTRODUZCA UN NÚMERO");
				valido=true;
			}
		}while(valido);
		return numero;//devuelvo el sueldo correcto
	}
	/**
	 * Método que recoge y controla que el valor que se
	 * ha introducido es un número y devuelve el número 
	 * introducido por teclado
	 * @return devuelve el número introducido por teclado
	 */
	public static double pedirNumeroDecimal() {
		double numero = 0;
		boolean valido;
		do {//se repite hasta que el sueldo sea correcto/sea un número positivo
			try {
				numero=pedirNumeroAuxDecimal();
				valido=false;
			}catch (Exception e) {//si el usuario introduce algun dato que no sean números, salta la excepcion
				System.out.println("Error: INTRODUZCA UN NÚMERO");
				valido=true;
			}
		}while(valido);
		return numero;//devuelvo el sueldo correcto
	}
}
