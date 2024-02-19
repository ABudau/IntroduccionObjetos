package ejemploApuntes;

public abstract class Trabajador {
	private String dni;
	private String Nombre;
	private int sueldoBruto;
	private double retenciones;
	


	public Trabajador(String dni, String nombre, int sueldoBruto, double retenciones) {
		super();
		this.dni = dni;
		Nombre = nombre;
		setSueldoBruto(sueldoBruto);
		setRetenciones(retenciones);
	}
	

	public Trabajador(Trabajador t) {
		this.dni = t.getDni();
		this.Nombre = t.getNombre();
		this.sueldoBruto = t.getSueldoBruto();
		this.retenciones = t.getRetenciones();
	}


	public String getDni() {
		return dni;
	}




	public void setDni(String dni) {
		this.dni = dni;
	}




	public String getNombre() {
		return Nombre;
	}




	public void setNombre(String nombre) {
		Nombre = nombre;
	}




	public int getSueldoBruto() {
		return sueldoBruto;
	}




	public double getRetenciones() {
		return retenciones;
	}


	public void setRetenciones(double retenciones) {
		if (retenciones>=0) {
			this.retenciones = retenciones;
		}
	}


	public void setSueldoBruto(int sueldoBruto) {
		if (sueldoBruto>0) {
			this.sueldoBruto = sueldoBruto;
		}
		
	}

	protected double calcularRetenciones() {
		
		return getSueldoBruto()*getRetenciones()/100;

	}


	@Override
	public String toString() {
		return "Trabajador [dni=" + dni + ", Nombre=" + Nombre + ", sueldoBruto=" + sueldoBruto + "]";
	}


	abstract public double cobrar();
}
