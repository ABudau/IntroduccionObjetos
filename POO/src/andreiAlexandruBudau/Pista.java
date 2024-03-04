package andreiAlexandruBudau;

import java.util.Objects;

public class Pista {
	private int numeroIdentificacion;
	private boolean cubierta;
	private int precio;
	
	public static final int PRECIO_PISTA_DESCUBIERTA=8;
	public static final int PRECIO_PISTA_CUBIERTA=10;
	
	public Pista(int numeroIdentificacion, boolean cubierta) {
		super();
		this.numeroIdentificacion = numeroIdentificacion;
		this.cubierta = cubierta;
		setPrecio();
	}
	
	public int getNumeroIdentificacion() {
		return numeroIdentificacion;
	}
	public void setNumeroIdentificacion(int numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}
	public boolean isCubierta() {
		return cubierta;
	}
	public void setCubierta(boolean cubierta) {
		this.cubierta = cubierta;
	}
	public int getPrecio() {
		return precio;
	}

	public void setPrecio() {
		int precio;
		if (isCubierta()) {
			precio = PRECIO_PISTA_CUBIERTA;
		}else {
			precio=PRECIO_PISTA_DESCUBIERTA;
		}
		this.precio=precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroIdentificacion);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pista other = (Pista) obj;
		return numeroIdentificacion == other.numeroIdentificacion;
	}

	@Override
	public String toString() {
		return "Pista [numeroIdentificacion=" + numeroIdentificacion + ", cubierta=" + cubierta + ", precio=" + precio
				+ "]";
	}
	
	
}
