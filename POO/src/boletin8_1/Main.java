package boletin8_1;

import vehiculos.Teclado;

public class Main {

	public static void main(String[] args) {
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
		ejercicio5();
//		ejercicio6();

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
	private static void ejercicio3() {
		
		String nombre,apellidos;
		int edad;
		char sexo;
		System.out.println("Introduce los datos de la persona "+Persona.getContador());//muestro el contador de cada instancia creada
		
		Persona p1=new Persona();//creo el objeto p1 con el constructor por defecto
		Persona p2;//Declaro una instancia de la clase Persona
		
		System.out.println("Introduce un nombre");//pido datos por teclado
		nombre=Teclado.pedirCadena();//recojo el dato introducido y lo almaceno en la variable
		p1.setNombre(nombre);//modifico el valor del atributo nombre del objeto p1
		
		System.out.println("Introduce un apellidos");
		apellidos=Teclado.pedirCadena();
		p1.setApellidos(apellidos);
		
		System.out.println("Introduce edad");
		edad=Teclado.pedirNumeroPositivo();
		p1.setEdad(edad);
		
		System.out.println("Introduce sexo H/M");
		sexo=Teclado.pedirChar();
		
		System.out.println("Introduce los datos de la persona "+Persona.getContador());//2
		System.out.println("Introduce un nombre");
		nombre=Teclado.pedirCadena();
		
		System.out.println("Introduce un apellidos");
		apellidos=Teclado.pedirCadena();
		
		System.out.println("Introduce edad");
		edad=Teclado.pedirNumeroPositivo();
		
		System.out.println("Introduce sexo H/M");
		sexo=Teclado.pedirChar();
		
		p2=new Persona(nombre, apellidos, edad, sexo);//creo el objeto p2 con el constructor con parámetros
		
		//imprimo y muestro el valor de la llamada del metodo saludar de cada instancia/Objeto creado
		System.out.println(p1.saludar());
		System.out.println(p2.saludar());			
	}
	private static void ejercicio4() {
		Piratagochi pirata1=new Piratagochi("Lucas");
		pirata1.setEnergia(9);
		pirata1.setNivelFelicidad(4);
		pirata1.dormir(3);
//		pirata1.comer();
//		pirata1.jugar(6);
//		pirata1.comer();
		pirata1.setEstaHambriento(false);
//		pirata1.dormir(2);
//		pirata1.jugar(2);
		System.out.println(pirata1.toString());
		System.out.println(pirata1.getNecesidades());

	}
	private static void ejercicio5() {
		Cuenta c =new Cuenta();
//		c.isDescubierta();
		c.setSaldo(1000);
		c.retirar(10000);
		System.out.println(c.isDescubierta());

	}
	private static void ejercicio6() {
//		PersonaCuenta p1 = new PersonaCuenta("pepe", "Perez nieto", 2, 8);
		PersonaCuenta p1 =new PersonaCuenta("n1", "a1", 18, 'H');
		PersonaCuenta p2 =new PersonaCuenta("n2", "a2", 18, 'm');
		p1.crearCuentaCorriente("ES24", 554125282, 2);
		p2.crearCuentaCorriente("ES54", 594125282, 2);
//		CuentaPersona cuenta=new CuentaPersona("ES54", 00557, 0.01);
//		cuenta.setSaldo(1000);
		p1.ingresarDinero(1000);
		p2.ingresarDinero(1000);
//		cuenta.beneficiosFuturos(12);
//		System.out.println(p1.getCuentaCorriente());
//		System.out.println(p1.getCuentaCorriente());
//		p1.cerrarCuenta();
		p1.hacerTransfereciaA(p2, 300);
		System.out.println(p1.getNombre()+" "+p1.getCuentaCorriente());
		System.out.println(p2.getNombre()+" "+p2.getCuentaCorriente());
		
//		System.out.println(cuenta.getNumeroCuenta());
//		System.out.println("HOLA");
		

	}
}
