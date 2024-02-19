package ejemploApuntes;

public class Fijo extends Trabajador {

	public Fijo(String dni, String nombre, int sueldoBruto, double retenciones) {
		super(dni, nombre, sueldoBruto, retenciones);
	}

	

	@Override
	public double cobrar() {
		return getSueldoBruto()-calcularRetenciones();
		
	}

}
