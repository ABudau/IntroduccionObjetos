package boletinArrayList.ejercicio5;

import java.util.ArrayList;

public class Almacen {
	private  ArrayList<Producto> Productos;

	public Almacen() {
		super();
		Productos = new ArrayList<Producto>();
	}

	public  ArrayList<Producto> getProductos() {
		return Productos;
	}

	public  void setProductos(ArrayList<Producto> productos) {
		Productos = productos;
	}
	
	public  void mostrarProductos() {
		if (Productos!=null) {
			for (Producto producto : Productos) {
				System.out.println(producto);
			}
		}
		
	}
	/**
	 * Método que añade un producto al almacen y lanza una excepcion si el producto
	 * ya se encuentra almacenado
	 * @param p es el producto que se añade
	 * @return devuelve true si el producto se ha añadido y false si no lo hace
	 */
	public  boolean darAltaProducto(Producto p) throws ProductoAlreadyExistsException {
		boolean alta=false;
		if (p!=null) {
			if (!Productos.contains(p)) {//Si el producto no está en la lista
				if (Productos.add(p)) {//Lo añado
					alta=true;
				}
			}else {//Si está en la lista/tiene el mismo código 
				throw new ProductoAlreadyExistsException();//Lanzo una excepcion
			}
		}
		return alta;
		
	}
	/**
	 * Método que borra un producto proporcionando el codigo
	 * @param indice es la posicion del producto a borrar
	 * @return devuelve true si encuentra y borra el producto
	 */
	public boolean darBajaProducto(String codigo) {
		boolean borrado=false;
		if (buscarProducto(codigo)!=null) {
			Productos.remove(buscarProducto(codigo));
			borrado=true;
		}
		return borrado;
	}
/**
 * Método que modifica los datos de un producto que se le pasa por parámetro
 * @param producto es el producto que contiene los datos que se modifica
 * @return devuelve el producto modificado
 */
//	public Producto modificarProducto(Producto producto) {
//
//		if (producto!=null) {
//			int indice=Productos.indexOf(producto);//Obtengo el indice del producto a modificar
//			producto=Productos.set(indice, producto);//Modifico el producto del indice especificado con el nuevo producto
//		}
//
//		return producto;
//		
//	}
	public boolean modificarProducto(Producto producto) {
		boolean modificado=false;
		if (producto!=null) {
			if (buscarProducto(producto.getCodigo())!=null) {
				int indice=Productos.indexOf(producto);//Obtengo el indice del producto a modificar
				producto=Productos.set(indice, producto);//Modifico el producto del indice especificado con el nuevo producto
				modificado=true;
			}
		}
		return modificado;
		
	}
	/**
	 * Método que busca un producto dentro de la lista a 
	 * través del código proporcionado
	 * @param codigo es el código del producto que se busca
	 * en la lista
	 * @return devuelve el Producto si lo encuentra, si no devuelve null
	 */
	public Producto buscarProducto(String codigo) {
		Producto p=null;
		boolean encontrado=false;
		if (codigo!=null) {
			if (Productos!=null) {
				for (int i = 0; i < Productos.size()&&!encontrado; i++) {
					if (Productos.get(i).getCodigo().equals(codigo)) {
						p=Productos.get(i);
						encontrado=true;
					}
				}
			}

		}
		return p;
	}
		/**
		 * Método que busca un producto y aumenta su stock
		 * @param codigo es el código del producto a buscar
		 * @param cantidad es la cantidad que queremos que aumente 
		 * el stock
		 */
	public boolean entradaMercancia(String codigo,int cantidad) {
		boolean modificado=false;
		if (codigo!=null) {
			Producto p=null;
			if (Productos!=null) {
				if (buscarProducto(codigo)!=null) {//Si encuentra el producto
					p=buscarProducto(codigo);//asigno el valor del producto encontrado a la variable
					p.setStock(p.getStock()+cantidad);//El valor de la cantidad(valor negativo) se corrige en otro lado
					modificado=true;
				}
			}
			
		}
		return modificado;
	}
	/**
	 * Método que busca y modifica el stock restandole 
	 * la cantidad que se le pasa como parámetro
	 * @param codigo es el código del producto a buscar
	 * @param cantidad es la cantidad que se le pasa para restar
	 */
	public  boolean salidaMercancia(String codigo,int cantidad) {
		return entradaMercancia(codigo, cantidad*-1);//Uso el método anterior y multiplico por -1 la cantidad para restar
	}
}
