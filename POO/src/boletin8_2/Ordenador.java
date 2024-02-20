package Boletin8_2;
//Ejercicio 2:  Estudiar e implementar una clase Ordenador. Estamos interesados en: 
//El tamaño, tipo y velocidad de su memoria.
//Tamaño y tipo del disco duro. 
//Modelo y velocidad del procesador. 
//Precio base 
//IVA //Porcentaje del impuesto que se aplica a los ordenadores 
//Precio de mercado//Sería el precio final, con el IVA incluido. 
//
//Considera el mejor diseño, y prueba en el main todas las clases que aparezcan
//en tu diseño. Queremos usar expresamente tipos envolturas (wrapers) en vez de tipos
//primitivos donde sea posible. 

public class Ordenador {

	private Integer tamanio;
	private TipoMemoria tipo;
	private Integer velocidadMemoria;
	private Integer tamanioDiscoDuro;
	private TipoDisco tipoDiscoDuro;
	private ModeloProcesador modeloProcesador;
	private Integer velocidadProcesador;
	private Double precioBase;
	private Double iva;
	
	
	public Ordenador(Integer tamanio, TipoMemoria tipo, Integer velocidadMemoria, Integer tamanioDiscoDuro,
			TipoDisco tipoDiscoDuro, ModeloProcesador modeloProcesador, Integer velocidadProcesador, Double precioBase,
			Double iva) {
		super();
		this.tamanio = tamanio;
		this.tipo = tipo;
		this.velocidadMemoria = velocidadMemoria;
		this.tamanioDiscoDuro = tamanioDiscoDuro;
		this.tipoDiscoDuro = tipoDiscoDuro;
		this.modeloProcesador = modeloProcesador;
		this.velocidadProcesador = velocidadProcesador;
		this.precioBase = precioBase;
		this.iva = iva;
	}

	public Integer getTamanio() {
		return tamanio;
	}

	public void setTamanio(Integer tamanio) {
		this.tamanio = tamanio;
	}

	public TipoMemoria getTipo() {
		return tipo;
	}

	public void setTipo(TipoMemoria tipo) {
		this.tipo = tipo;
	}

	public Integer getVelocidadMemoria() {
		return velocidadMemoria;
	}

	public void setVelocidadMemoria(Integer velocidadMemoria) {
		this.velocidadMemoria = velocidadMemoria;
	}

	public Integer getTamanioDiscoDuro() {
		return tamanioDiscoDuro;
	}

	public void setTamanioDiscoDuro(Integer tamanioDiscoDuro) {
		this.tamanioDiscoDuro = tamanioDiscoDuro;
	}

	public TipoDisco getTipoDiscoDuro() {
		return tipoDiscoDuro;
	}

	public void setTipoDiscoDuro(TipoDisco tipoDiscoDuro) {
		this.tipoDiscoDuro = tipoDiscoDuro;
	}

	public ModeloProcesador getModeloProcesador() {
		return modeloProcesador;
	}

	public void setModeloProcesador(ModeloProcesador modeloProcesador) {
		this.modeloProcesador = modeloProcesador;
	}

	public Integer getVelocidadProcesador() {
		return velocidadProcesador;
	}

	public void setVelocidadProcesador(Integer velocidadProcesador) {
		this.velocidadProcesador = velocidadProcesador;
	}

	public Double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}
	
	
	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public Double calularPrecioMercado() {
		return (getPrecioBase()*getIva()/100)+getPrecioBase();

	}
	
	
	
}
