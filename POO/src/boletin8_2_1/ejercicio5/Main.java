package boletin8_2_1.ejercicio5;

public class Main {

	public static void main(String[] args) {
		Almacen a1=new Almacen();
//		System.out.println(a1);
		BebidaAzucarada p1= new BebidaAzucarada(2.5,2,Marca.COCA_COLA,2.5,false);
		BebidaAzucarada p2= new BebidaAzucarada(2,1.59,Marca.FANTA,2.5,true);
		BebidaAzucarada p3= new BebidaAzucarada(2.5,2,Marca.COCA_COLA,2.5,false);
		BebidaAzucarada p4= new BebidaAzucarada(2.5,2,Marca.COCA_COLA,2.5,false);
		BebidaAzucarada p5= new BebidaAzucarada(2.5,2,Marca.COCA_COLA,2.5,false);
		a1.guardarProductoAlmacen(p1);
		a1.guardarProductoAlmacen(p2);
		a1.guardarProductoAlmacen(p3);
		a1.guardarProductoAlmacen(p4);
		a1.guardarProductoAlmacen(p5);
//		a1.guardarProductoAlmacen(p2);
		System.out.println(p1.getPrecioFinal());
		System.out.println(p2.getPrecioFinal());
		System.out.println(p3.getPrecioFinal());
		System.out.println(p4.getPrecioFinal());
		System.out.println(p5.getPrecioFinal());
//		System.out.println(a1);
//		a1.mostarEstanterias();
		System.out.println(a1.getPrecioMarca(Marca.COCA_COLA));
		System.out.println(a1.getPrecioTodasLasBebidas());
		
		
		
		
	}

}
