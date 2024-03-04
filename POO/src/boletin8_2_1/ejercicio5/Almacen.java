package boletin8_2_1.ejercicio5;

import java.util.Arrays;
import java.util.Iterator;

public class Almacen {
	public static final int NUMERO_ESTANTERIAS=5;
	public static final int NUMERO_HUECOS=6;
	private static Producto[][]estanterias= new Producto[NUMERO_ESTANTERIAS][NUMERO_HUECOS];;
	
//	public Almacen() {
//		super();
//		this.productos = new Producto[NUMERO_ESTANTERIAS][NUMERO_HUECOS];
//	}

	public static double getPrecioTodasLasBebidas() {
		double precio=0;
		if (estanterias!=null) {
			for (int i = 0; i < estanterias.length; i++) {
				for (int j = 0; j < estanterias.length; j++) {
					if (estanterias[i][j]!=null) {
						precio+=estanterias[i][j].getPrecioFinal();
					}
				}
			}
		}
		return precio;
	}
	public static double getPrecioMarca(Marca marca) {
		double precio=0;
		if (estanterias!=null) {
			for (int i = 0; i < estanterias.length; i++) {
				for (int j = 0; j < estanterias.length; j++) {
					if (estanterias[i][j]!=null) {
						if (estanterias[i][j].getMarca().equals(marca)) {
							precio+=estanterias[i][j].getPrecioFinal();
						}
					}
				}
			}
		}
		
		return precio;
	}
	

	public boolean guardarProductoAlmacen(Producto p) {
		boolean guardado=false;
		if (!noEstaRepetido(p)) {//si el es distinto a noEstaRepetido(false)
			for (int i = 0; i < estanterias.length&&!guardado; i++) {
				for (int j = 0; j < estanterias.length&&!guardado; j++) {
					if (estanterias[i][j]==null) {
						estanterias[i][j]=p;
						guardado=true;
					}
				}
			}
		}
		return guardado;
	}




	private boolean noEstaRepetido(Producto p) {
		boolean encontrado=false;
		if (p!=null) {
			for (int i = 0; i < estanterias.length; i++) {
				for (int j = 0; j < estanterias.length; j++) {
					if (estanterias[i][j]!=null) {
						if (estanterias[i][j].getIdentificador()==p.getIdentificador()) {
							encontrado=true;
						}
					}
					
				}
			}
		}
		return encontrado;
	}


	@Override
	public String toString() {
		return "Almacen [almacen=" + Arrays.toString(estanterias) + "]";
	}
	
	
	
	public void mostarEstanterias() {
		for (int i = 0; i < estanterias.length; i++) {
			for (int j = 0; j < estanterias.length; j++) {
				if (estanterias[i][j]!=null) {
					System.out.println(estanterias[i][j]);
				}
				
			}
		}
	}
	
}
