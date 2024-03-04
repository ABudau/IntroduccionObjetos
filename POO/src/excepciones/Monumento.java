package excepciones;

import java.util.Objects;

public class Monumento {
	private String nombre;

	public static final int TAM_MAX=15;
	
	public Monumento(String nombre) throws NameToLongException {
		super();
		setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) throws NameToLongException {
		if (nombre.length()>TAM_MAX) {
			throw new NameToLongException();
		}
		
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Monumento other = (Monumento) obj;
		return Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		return "Monumento [nombre=" + nombre + "]";
	}
	
	
	
	
}
