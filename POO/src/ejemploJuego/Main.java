package ejemploJuego;

public class Main {

	public static void main(String[] args) {
		Persona p1= new Persona(20);
		Zombi z=new Zombi();
		ZombiAnimal perroZ=new ZombiAnimal();
		z.atacar(p1);
		System.out.println(p1.getVida());
		perroZ.atacar(p1);
		System.out.println(p1.getVida());

	}

}
