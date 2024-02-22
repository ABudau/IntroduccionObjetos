package boletin8_2_1.ejercicio5;

public class AguaMineral extends Producto {
private String nombreManantial;

public AguaMineral(int identificador, double cantidadLitros, double precioBase, Marca marca, String nombreManantial) {
	super(identificador, cantidadLitros, precioBase, marca);
	this.nombreManantial = nombreManantial;
}

public String getNombreManantial() {
	return nombreManantial;
}

public void setNombreManantial(String nombreManantial) {
	this.nombreManantial = nombreManantial;
}



}
