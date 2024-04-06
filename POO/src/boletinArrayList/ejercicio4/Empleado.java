package boletinArrayList.ejercicio4;
/*	Ejercicio 4
Crear una clase llamada Empleado, con los atributos nombre y
sueldo. Realizar un programa que pida por pantalla 4 empleados y
hacer un listado donde se muestre un listado ordenado en orden
ascendente y descendente teniendo en cuenta el sueldo como criterio
de ordenación*/
public class Empleado implements Comparable<Empleado> {
	private String nombre;
	private int sueldo;
	
	
	public Empleado(String nombre, int sueldo) {
		super();
		this.nombre = nombre;
		setSueldo(sueldo);
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		if (sueldo>0) {//si el sueldo que se le pasa como parámetro es mayor que 0 lo almaceno/asigno
			this.sueldo = sueldo;
		}
		
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
	}

	@Override
	public int compareTo(Empleado otro) {
		int resultado=0;
		if (this.getSueldo()==otro.getSueldo())//Comparo el sueldo con el sueldo de otro empleado
			resultado=0;
		else if(this.getSueldo()<otro.getSueldo())
			resultado=-1;
		else
			resultado=1;
		return resultado;//devuelvo el resultado
	}
	
	
}
