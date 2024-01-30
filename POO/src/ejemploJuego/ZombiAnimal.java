package ejemploJuego;

public class ZombiAnimal extends Zombi {

	public static final int DANIO=10;
	
	
	public ZombiAnimal() {
		super();
	}


	@Override
	public void atacar(Persona p) {
//		p.setVida(p.getVida()-DANIO);
		super.atacar(p);
		super.atacar(p);
	}
	
	
}
