package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import ejemplos.Producto;
import modelo.Atleta;
import modelo.Boxeador;
import modelo.Karateka;

public class Main {

	public static void main(String[] args) {
		ArrayList<Karateka> karatekas;
		karatekas = new ArrayList<Karateka>();
		
		
		Karateka manuel= new Karateka("Manuel", 18);
		Karateka ana= new Karateka("Ana", 17);
		Karateka rosa= new Karateka("Rosa", 17);
		
		karatekas.add(manuel);
		karatekas.add(ana);
		karatekas.add(rosa);
		
		Boxeador linares =new Boxeador("Linares", 20);
		Boxeador pepe =new Boxeador("pepe", 20);
		
		List<Atleta> listaAtletas = new LinkedList<Atleta>();
		listaAtletas.add(manuel);
		listaAtletas.add(linares);
		
		Set<Atleta> conjuntoGanador = new HashSet<Atleta>();
		
		
		conjuntoGanador.add(pepe);
		conjuntoGanador.add(linares);
		conjuntoGanador.add(manuel);
		conjuntoGanador.add(ana);
		
		Set<Atleta> conjuntoPerdedor = new HashSet<Atleta>();
		
//		conjuntoPerdedor.add(pepe);
//		conjuntoPerdedor.add(linares);
////		conjuntoGanador.retainAll(conjuntoPerdedor);
////		System.out.println(conjuntoGanador);
//		conjuntoGanador.removeAll(conjuntoPerdedor);
//		System.out.println(conjuntoGanador);
////		System.out.println(listaAtletas);
		
		
		
		
//		karatekas.addAll(karatekas);
		
//		System.out.println(karatekas.get(0));

		
//		for (Karateka karateka : karatekas) {
//			System.out.println(karateka);
//		}
		
//		for (int i = 0; i <karatekas.size(); i++) {
//			System.out.println(karatekas.get(i));
//		}
		
//		LinkedList<Integer>numeros = new LinkedList<Integer>();
//		
//		numeros.add(3);
//		numeros.add(34);
//		numeros.add(2);
//		
//		Collections.sort(numeros);//para ordenar los valores de menor a mayor
//		System.out.println(numeros);
//		
//		Collections.sort(karatekas);//para poder ordenarlo hay que implementar la interfaz Comparable<Karateka>
//		System.out.println(karatekas);
	
		Producto cargadorPortatil= new Producto(1,"Cargador Portatil");
		Producto batido= new Producto(2,"Batido de chocolate");
		Producto maleta= new Producto(3,"maleta");
		
		HashMap<Integer, Producto> listaProducto= new HashMap<Integer, Producto>();
		
		listaProducto.put(3, maleta);
		listaProducto.put(1, cargadorPortatil);
		listaProducto.put(2, batido);
		
		Set<Integer> lista = listaProducto.keySet();
//		for (Integer indice : lista) {
//			System.out.println(listaProducto.get(indice));
//		}
		System.out.println(listaProducto);
		
	
	}

}
