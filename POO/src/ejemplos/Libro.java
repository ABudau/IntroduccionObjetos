package Ejemplos;

public class Libro {
	private String isbn;
	private String autor;
	private String titulo;
	private int numeroPaginas;
	public static final String VALOR_POR_DEFECTO="No tiene";
	
	public Libro() {
		this.isbn=VALOR_POR_DEFECTO;
		this.autor=VALOR_POR_DEFECTO;
		this.titulo=VALOR_POR_DEFECTO;
		this.numeroPaginas=0;
	}
	public Libro(String isbn,String autor, String titulo,int numeroPaginas) {
		this.isbn=isbn;
		this.autor=autor;
		this.titulo=titulo;
		this.numeroPaginas=numeroPaginas;
	}
	public void mostrarEstado() {
		System.out.println("****************************");
		System.out.println("ISBN: "+this.isbn);
		System.out.println("Autor: "+this.autor);
		System.out.println("Titulo: "+this.titulo);
		System.out.println("Número de Paginas : "+this.numeroPaginas);

	}
}
