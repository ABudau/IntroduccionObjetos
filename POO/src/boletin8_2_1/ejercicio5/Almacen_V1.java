package boletin8_2_1.ejercicio5;

import java.util.Arrays;

public class Almacen_V1 {
	public static final int NUMERO_ESTANTERIAS=5;
	private Almacen_V1[][]almacen;
	
	public Almacen_V1(Estanteria estanteria) {
		super();
		this.almacen = new Almacen_V1[NUMERO_ESTANTERIAS];
	}

	@Override
	public String toString() {
		return "Almacen [almacen=" + Arrays.toString(almacen) +"]";
	}
	

	
	
	
	
//	public void mostarEstanterias() {
//		for (int i = 0; i < estanterias.length; i++) {
//			for (int j = 0; j < estanterias.length; j++) {
//				if (estanterias[i][j]!=null) {
//					System.out.println(estanterias[i][j].getId());
//				}
//				
//			}
//		}
//	}
//	
}
