package clasesAbstractas;

public class Cuadrado extends FiguraGeometrica {

	private int lado;
	

	public Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}
	
	@Override
	public double getArea() {
		return Math.pow(lado, 2);
	}

	@Override
	public void getCambioColor(String nuevoColor) {
		setColor(nuevoColor);
	}
}
