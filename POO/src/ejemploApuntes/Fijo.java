package ejemploApuntes;

public class Fijo extends Trabajador {

	public Fijo(String dni, String nombre, int sueldoBruto, double retenciones) {
		super(dni, nombre, sueldoBruto, retenciones);
	}

	
	public Fijo(Fijo f) {
		super(f.getDni(), f.getNombre(), f.getSueldoBruto(), f.getRetenciones());
		
	}





	@Override
	public double cobrar() {
		return getSueldoBruto()-calcularRetenciones();
		
	}

}
