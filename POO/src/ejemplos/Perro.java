package ejemplos;

public class Perro {
	//atributos
	private String nombre;
	private String color;
	private String raza;
	private boolean hambriento;
	
	//Métodos
	public Perro(String nombre,String color,String raza,boolean hambriento) {
		this.nombre=nombre;
		this.color=color;
		this.raza=raza;
		this.hambriento=hambriento;
	}
	
	//Constructor copia
	public Perro(Perro perroOriginal) {
		this.nombre=perroOriginal.getNombre();
		this.color=perroOriginal.getColor();
		this.raza=perroOriginal.getRaza();
		this.hambriento=perroOriginal.getHambriento();
	}
	public void comer() {
		this.hambriento=false;
	}
	public void comer(String comida) {
		if (comida.toLowerCase().equals("jamon")) {
			System.out.println(comida+" ummm qué buenoo");
		}else {
			System.out.println(comida+" ahgg, no gracias!");
		}
	}
	//Getters y Setter
	public void setNombre(String nombre) {
		 this.nombre=nombre;
	}
	public String getNombre() {
		return this.nombre;
	}
	public boolean getHambriento() {
		return this.hambriento;
	}
	public void setHambriento(boolean hambriento) {
		this.hambriento = hambriento;
	}
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getRaza() {
		return this.raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public void ladrar() {
		System.out.println("Guau Guau");
	}
	@Override
	public String toString() {
		String mensaje="nombre: "+getNombre()+"\n"+"color: "+getColor()+"\n"+"raza: "+getRaza()+"\n"+"hambriento: "+getHambriento();
				
		return mensaje;					
	}
}
