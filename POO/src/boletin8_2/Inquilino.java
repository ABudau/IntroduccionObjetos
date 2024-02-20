package boletin8_2;

public class Inquilino {
	private String nombreCompleto;
	private String nif;
	
	public Inquilino(String nombreCompleto, String nif) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.nif = nif;
	}
	
	public String getNombreCompleto() {
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public String getNif() {
		return nif;
	}
	@Override
	public String toString() {
		return "Inquilinos [nombreCompleto=" + nombreCompleto + ", NIF=" + nif + "]";
	}
	
	
	
}
