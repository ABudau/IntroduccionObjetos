package Boletin8_1;
//Ejercicio 3: Implementa una clase Persona con los siguientes atributos
//y métodos. Escribe una clase Main para poder probar la clase anterior donde
//se pidan los datos por teclado de dos personas. Una persona se creará con el
//constructor sin parámetros y la otra con el constructor con parámetros. Hacer
//uso de los métodos desarrollados. 
public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	private char sexo;
	private static int contador=1;
	
	
	public Persona() {
		this.nombre=null;
		this.apellidos=null;
		this.edad=0;
		this.sexo=0;
		this.contador++;
	}
	public Persona(String n,String a,int e,char s) {
		this.nombre=n;
		this.apellidos=a;
		this.edad=e;
		this.sexo=s;
		this.contador++;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if (edad>0) {
			this.edad = edad;
		}
		
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public static int getContador() {
		return contador;
	}
	public static void setContador(int contador) {
		Persona.contador = contador;
	}
	public String saludar() {
		return "Hola "+getNombre()+" "+getApellidos();

	}
	
	
}
