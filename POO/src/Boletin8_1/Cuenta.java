package Boletin8_1;
//Ejercicio 5:  Escribe una clase llamada Cuenta, y otra clase que haga uso de dicha clase pidiendo los datos de varias cuentas y creando dichas cuentas
//
//Class Cuenta
//String iban
//int numeroCuenta
//double saldo
//boolean descubierta //Es derivado
//double interesMensual
//
//
//Cuenta(String iban, int nc, double interesMensual)
//get y set de atributos
//public String toString()
//public void ingresar(double dinero)
//public boolean retirar(double dinero)
//public boolean hacerTransferenciaA(Cuenta c, double cantidad)
//public double beneficiosFuturos(int numMeses)
//
//
//
//Tened en cuenta que:
//Saldo puede ser negativo o positivo, pero si es negativo la cuenta estará “descubierta”.
//Si una cuenta está descubierta sólo se podrá ingresar dinero o recibir una transferencia, nunca retirar dinero o hacer una transferencia.
//Las operaciones de retirar y hacerTransferenciaA devuelven un boolean indicando si la operación se ha podido hacer correctamente o no.
//El método beneficiosFuturos devuelve los beneficios en función de los meses que se hayan pasado como parámetro. Si la cuenta está descubierta o el número de meses es negativo, los beneficios son 0.
//Los métodos de ingresar, retirar, hacerTransferenciaA y beneficiosFuturos deben de imprimir un mensaje diciendo el saldo final de la cuenta después de realizar la operación.
//Nuestra clase Cuenta permite dejar la cuenta muy muy descubierta :P

public class Cuenta {
	private String iban;
	private int numeroCuenta;
	private double saldo;
	private boolean descubierta; //Es derivado
	private double interesMensual;
	
	public Cuenta() {
		this.iban=null;
		this.numeroCuenta=0;
		this.saldo=0;
		this.interesMensual=0;
	}
	public Cuenta(String iban, int numeroCuenta, double interesMensual) {
		
		this.iban = iban;
		this.numeroCuenta = numeroCuenta;
		this.interesMensual = interesMensual;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
		if (this.saldo<0) {//si el saldo es negativo
			setDescubierta(true);//descubierta toma el valor de true
		}
	}

	public boolean isDescubierta() {
		return descubierta;
	}

	public void setDescubierta(boolean descubierta) {
		this.descubierta = descubierta;
	}

	public double getInteresMensual() {
		return interesMensual;
	}

	public void setInteresMensual(double interesMensual) {
		this.interesMensual = interesMensual;
	}
	
	public void ingresar(double dinero) {
		if (dinero>0) {
			setSaldo(getSaldo()+dinero);
			mostrarSaldo();
		}
	}
	
	public boolean retirar(double dinero){
		boolean operacionRealizada=false;
		if (isDescubierta()==false) {
			setSaldo(getSaldo()-dinero);
			operacionRealizada=true;
			mostrarSaldo();
		}
		return operacionRealizada;
	}
	public boolean hacerTransferenciaA(Cuenta c, double cantidad){
		boolean operacionRealizada=false;
		if (isDescubierta()==false) {//si descubierta es false
//			if (getSaldo()-cantidad>0) {//si el saldo bancario menos la cantidad es mayor que 0
				setSaldo(getSaldo()-cantidad);//quito del saldo la cantidad
				c.setSaldo(getSaldo()+cantidad);//añado a la cuenta de destino la cantidad
				operacionRealizada=true;
				mostrarSaldo();
//			}
		}
		return  operacionRealizada;//devuelvo el resultado
	}
	public double beneficiosFuturos(int numMeses){
		double interes;
		double beneficios=0;
		if (numMeses>0||isDescubierta()==false) {//si el numero de meses es positivo
			interes=0.01*numMeses;//calculo el interes a aplicar
			beneficios=getSaldo()*interes;//calculo el beneficio aplicando el interes
//			beneficios=0;
			setSaldo(getSaldo()+beneficios);//añado el beneficio
			mostrarSaldo();
		}
		return beneficios;//devuelvo los beneficios obtenidos
		
	}
	
	private void mostrarSaldo() {
		System.out.println(getSaldo());
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Cuenta: iban=" + iban + ", numeroCuenta=" + numeroCuenta + "\n"
				+ " saldo=" + saldo + "\n"
				+ " descubierta="+ descubierta + "\n"
				+ " interesMensual=" + interesMensual ;
	}
	
	
	
	
}
