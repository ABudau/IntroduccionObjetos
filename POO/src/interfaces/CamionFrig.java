package interfaces;

public class CamionFrig implements IVehiculo,IFrigorifico {

	private boolean arrancado;
	private int velocidad;
	private int temperatura;
	private boolean frioEncendido;
	
	
	public CamionFrig() {
		super();
		this.arrancado = false;
		this.velocidad = 2;
		this.temperatura = 10;
		this.frioEncendido = false;
	}

	@Override
	public void encender() {
		this.frioEncendido=true;
		
	}

	@Override
	public void regularTemp() {
		this.temperatura--;
		if(this.temperatura<=0) {
			this.temperatura+=3;
		}
		
	}

	@Override
	public void apagar() {
		this.frioEncendido=false;
		
	}

	@Override
	public void arrancar() {
		this.arrancado=true;
		
	}

	@Override
	public void acelerar() {
		this.velocidad++;
		
	}

	@Override
	public void parar() {
		this.arrancado=false;
		
	}

	public boolean isArrancado() {
		return arrancado;
	}

	public void setArrancado(boolean arrancado) {
		this.arrancado = arrancado;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	public boolean isFrioEncendido() {
		return frioEncendido;
	}

	public void setFrioEncendido(boolean frioEncendido) {
		this.frioEncendido = frioEncendido;
	}

	@Override
	public String toString() {
		return "CamionFrig [arrancado=" + arrancado + ", velocidad=" + velocidad + ", temperatura=" + temperatura
				+ ", frioEncendido=" + frioEncendido + "]";
	}

	
	

}
