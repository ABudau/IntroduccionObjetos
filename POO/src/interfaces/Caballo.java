package interfaces;

public class Caballo implements IVehiculo {
	private boolean dormido;
	private String tipoPaso;
	
	@Override
	public void arrancar() {
		this.dormido=false;
		
	}
	@Override
	public void frenar(int intensidad) {
		if (intensidad>=1) {
			switch (tipoPaso) {
			case "galope" ->{this.tipoPaso="trote";}
			case "trote" ->{this.tipoPaso="paso";}
			}
		}
		
	}
	@Override
	public void parar() {
		this.dormido=true;
		
	}
	public boolean isDormido() {
		return dormido;
	}
	public void setDormido(boolean dormido) {
		this.dormido = dormido;
	}
	public String getTipoPaso() {
		return tipoPaso;
	}
	public void setTipoPaso(String tipoPaso) {
		this.tipoPaso = tipoPaso;
	}
	
	
}
