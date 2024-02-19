package boletin8_2_1;

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
		Figura f1= new Circulo(0);
		for (int i = 0; i < figuras.length; i++) {
			if (figuras[i]!=null) {
				if (figuras[i].getArea()>=f1.getArea()) {
					f1=figuras[i];
				}
			}
		}
		//		for (Figuras figuras : figura) {
		//			if (figuras!=null) {
		//				if (figuras.getFigura().) {
		//					
		//				}
		//			}
		//		}
		
		
		return f1;
	}
	
}
