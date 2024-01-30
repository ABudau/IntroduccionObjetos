package ejemploJuego;

public class Zombi {
	
	public static final int DANIO=5;
	
	public Zombi(){
		super();
	}
	
	public void atacar(Persona p) {
		p.setVida(p.getVida()-DANIO);
	}
	
	
	
	
	
}
