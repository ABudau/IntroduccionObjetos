package Boletin8_1;
//Ejercicio 6: Aprovechando la clase persona que hemos desarrollado en el ejercicio3,
//vamos a modificarla para que una persona tenga asociada una cuenta corriente del ejercicio 3. 
//Cread otro proyecto nuevo para este ejercicio, copiad la clase Persona y la clase Cuenta y a partir
//de ahí trabajar.
//Puesto que la persona tiene asociada una cuenta, esa cuenta hay que “construirla” en algún momento,
//para ello nos vamos a declarar un método que sea abrir cuenta y que acepta como parámetros el iban, 
//el número de cuenta y el interesMensual. En ese método es donde se llama al constructor de la cuenta.
//Habría que declararse además otros métodos para la clase persona. A continuación se resumen:
//Añadir el atributo Cuenta cuentaCorriente a Persona.
//Añadir los siguientes métodos a Persona:
//public void crearCuentaCorriente(String iban, int nc, double interesMensual)
//public boolean sacarDinero(double dinero)
//public boolean ingresarDinero(double cantidad)
//public boolean hacerTransfereciaA(Persona p, double cantidad)
//public void cerrarCuenta()
//De esta forma, una persona se puede crear una cuenta corriente, sacar o ingresar dinero en su cuenta
//o puede hacer una transferencia a otra persona (se intuye que hace una transferencia a la cuenta de la
//otra persona)
//Se da por hecho en este ejercicio que una persona solo puede tener una cuenta, que se puede cerrar, y
//entonces sí se podría crear otra.

public class PersonaCuenta {
	private String nombre;
	private String apellidos;
	private CuentaPersona cuentaCorriente;
	private int edad;
	private char sexo;
	private static int contador=1;
	
	
	public PersonaCuenta() {
		this.nombre=null;
		this.apellidos=null;
		this.edad=0;
		this.sexo=0;
		this.contador++;
	}
	public PersonaCuenta(String nombre,String apellidos,int edad,char sexo) {
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.sexo=sexo;
		this.contador++;
	}
	
	
	public CuentaPersona getCuentaCorriente() {
		return cuentaCorriente;
	}
	public void setCuentaCorriente(CuentaPersona cuentaCorriente) {
		if (getCuentaCorriente()==null) {
			this.cuentaCorriente = cuentaCorriente;
		}
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
		PersonaCuenta.contador = contador;
	}
	public String saludar() {
		return "Hola "+getNombre()+" "+getApellidos();

	}
	
	
	public void crearCuentaCorriente(String iban, int nc, double interesMensual) {
//		CuentaPersona cuenta = new CuentaPersona(iban, nc, interesMensual);
//		setCuentaCorriente(cuenta);
		setCuentaCorriente(new CuentaPersona(iban, nc, interesMensual));
	}
	/**
	 * 
	 * @param dinero
	 * @return
	 */
	public boolean sacarDinero(double dinero) {
		boolean operacionRealizada=false;
		if (getCuentaCorriente()!=null&&dinero>0) {

			this.cuentaCorriente.retirar(dinero);
			operacionRealizada=true;
		}
		return operacionRealizada;
	}
	public boolean ingresarDinero(double cantidad) {
		boolean operacionRealizada=false;
		if (getCuentaCorriente()!=null&&cantidad>0) {
			this.cuentaCorriente.ingresar(cantidad);
			operacionRealizada=true;
		}
		return operacionRealizada;
	}

	public boolean hacerTransfereciaA(PersonaCuenta p, double cantidad) {
		boolean operacionRealizada=false;
		if (p!=null) {
			if (getCuentaCorriente()!=null&&cantidad>0&&p.getCuentaCorriente()!=null) {
				getCuentaCorriente().hacerTransferenciaA(p.getCuentaCorriente(), cantidad);
				operacionRealizada=true;
			}
		}
		
		return operacionRealizada;
	}
	
	public void cerrarCuenta() {
		
		if (getCuentaCorriente()!=null&&getCuentaCorriente().getSaldo()>0) {
			mostrarMensaje();
			int opcion=utilidades.Teclado.recogerOpcionMenu(1, 2);
			if (opcion>1) {
				this.cuentaCorriente=null;
			}
		}else {
			this.cuentaCorriente=null;
		}


	}

	private void mostrarMensaje() {

		System.out.println("La cuenta tiene un saldo de "+this.cuentaCorriente.getSaldo());
		System.out.println("¿Está seguro de querer cerrar la cuenta?");
		System.out.println("1.No \n2.Si");
		
	}


}
