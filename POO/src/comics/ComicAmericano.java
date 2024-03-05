package comics;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ComicAmericano extends ComicEstandar {
	private int americanItq;
	public static final double CTE_USA =1.75;
	
	public ComicAmericano( String titulo, String subtitulo,String genero,
			double precio, int americanItq) {
		super(titulo, subtitulo, genero, precio);
		this.americanItq = americanItq;
	}

	public int getAmericanItq() {
		return americanItq;
	}

	public void setAmericanItq(int americanItq) {
		this.americanItq = americanItq;
	}

	@Override
	public double getNivelRelevancia() {
		return getPrecio()*CTE_USA;
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
				+ punto+" American ITB: "+getAmericanItq()+"\n";
		
	}
	

	
	
}
