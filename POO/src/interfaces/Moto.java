package interfaces;

public class Moto implements IVehiculo {

	private boolean arrancada;
	private int velocidad;
	
	public Moto() {
		super();
	}
	

	@Override
	public void arrancar() {
		this.arrancada=true;
		
	}

	@Override
	public void frenar(int intensidad) {
		this.velocidad-=intensidad;
		if (this.velocidad<0) {
			this.velocidad=0;
		}
		
		
	}

	@Override
	public void parar() {
		this.arrancada=false;
		
	}

}
