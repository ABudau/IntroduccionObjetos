package boletin8_2_1.ejercicio5;

public class AguaMineral extends Producto {
private String nombreManantial;

public AguaMineral( double cantidadLitros, double precioBase, Marca marca, String nombreManantial) {
	super( cantidadLitros, precioBase, marca);
	this.nombreManantial = nombreManantial;
}

public String getNombreManantial() {
	return nombreManantial;
}

public void setNombreManantial(String nombreManantial) {
	this.nombreManantial = nombreManantial;
}

@Override
public String toString() {
	return "AguaMineral [nombreManantial=" + nombreManantial + "]";
}



}
