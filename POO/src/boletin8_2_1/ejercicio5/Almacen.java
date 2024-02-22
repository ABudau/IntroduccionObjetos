package boletin8_2_1.ejercicio5;

public class Almacen {
	private Estanteria[]estanterias;
	
	public Almacen() {
		super();
		setEstanterias(estanterias);
	}
	public Estanteria[] getEstanterias() {
		return estanterias;
	}

	public void setEstanterias(Estanteria[] estanterias) {
		this.estanterias = estanterias;
	}

	public static final int NUMERO_ESTANTERIAS=5;
	
	
	
	public void mostarEstanterias() {
		for (int i = 0; i < estanterias.length; i++) {
			for (int j = 0; j < estanterias.length; j++) {
				if (estanterias[i][j]!=null) {
					System.out.println(estanterias[i][j].getId());
				}
				
			}
		}
	}
	
}
