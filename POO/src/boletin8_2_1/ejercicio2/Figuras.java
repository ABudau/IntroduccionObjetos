package boletin8_2_1.ejercicio2;

public class Figuras {
	public static Figura[] figuras;
	
	
	public Figuras(int tamanio) {
		Figuras.figuras=new Figura[tamanio];
	}

	public static Figura[] getFigura() {
		return figuras;
	}

	public static void setFigura(Figura[] figura) {
		Figuras.figuras = figura;
	}
	
	public static Figura figuraConMasArea() {
		Figura figuraAreaMasGrande= null;
		double mayor=-1;
		for (int i = 0; i < figuras.length; i++) {
			if (figuras[i]!=null) {
				if (figuras[i].getArea()>=mayor) {
					figuraAreaMasGrande=figuras[i];
				}
			}
		}		
		
		return figuraAreaMasGrande;
	}
	
}
