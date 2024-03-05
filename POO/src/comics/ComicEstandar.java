package comics;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class ComicEstandar {
	private int identificador;
	private static int contador=0;
	private String titulo;
	private String subtitulo;
	private LocalDate fecha;
	private String genero;
	private double precio;
	
	public static final double CTE =1.5;
	
	public ComicEstandar(String titulo, String subtitulo, String genero,
			double precio) {
		super();
		contador++;
		this.identificador = contador;
		this.titulo = titulo;
		this.subtitulo = subtitulo;
		this.fecha =LocalDate.now();
		this.genero = genero;
		this.precio = precio;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getIdentificador() {
		return identificador;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getNivelRelevancia() {

		return getPrecio()*CTE;
	}

	@Override
	public int hashCode() {
		return Objects.hash(identificador);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ComicEstandar other = (ComicEstandar) obj;
		return identificador == other.identificador;
	}

	@Override
	public String toString() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		char punto='●';
		return punto+" Identificador: "+getIdentificador()+"\n"
				+ punto+" Título: "+getTitulo()+"\n"
				+ punto+" subtítulo: "+getSubtitulo()+"\n"
				+ punto+" Fecha: "+getFecha().format(formatter)+"\n"
				+ punto+" Precio: "+getPrecio()+"\n"
				+ punto+" Género: "+getGenero()+"\n"
				;
		
	}
	
	
	
	
}
