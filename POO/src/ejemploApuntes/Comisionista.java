package ejemploApuntes;

public class Comisionista extends Trabajador{
	private int numeroVentas;
	



	
	public Comisionista(String dni, String nombre, int sueldoBruto, double retenciones, int numeroVentas) {
		super(dni, nombre, sueldoBruto, retenciones);
		setNumeroVentas(numeroVentas);
	}



	public int getNumeroVentas() {
		return numeroVentas;
	}



	public void setNumeroVentas(int numeroVentas) {
		if (numeroVentas>=0) {
			this.numeroVentas = numeroVentas;
		}
		
	}



	public double calcularComision() {
		double comision=0;
		if (this.numeroVentas<100&&this.numeroVentas>0) {
			comision=8;
		}else if (this.numeroVentas>100&&this.numeroVentas<=150) {
			comision=15;
		}else {
			comision=20;
		}
		return comision*=getSueldoBruto()/100;
	}
	

	@Override
	public double cobrar() {
		return getSueldoBruto()-calcularRetenciones()+calcularComision();
	}
	
	
	
	
}
