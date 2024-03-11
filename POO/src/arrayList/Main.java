package arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

import modelo.Atleta;
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
		
//		karatekas.addAll(karatekas);
		
//		System.out.println(karatekas.get(0));

		
//		for (Karateka karateka : karatekas) {
//			System.out.println(karateka);
//		}
		
//		for (int i = 0; i <karatekas.size(); i++) {
//			System.out.println(karatekas.get(i));
//		}
		
		LinkedList<Integer>numeros = new LinkedList<Integer>();
		
		numeros.add(3);
		numeros.add(34);
		numeros.add(2);
		
		Collections.sort(numeros);//para ordenar los valores de menor a mayor
		System.out.println(numeros);
		
		Collections.sort(karatekas);//para poder ordenarlo hay que implementar la interfaz Comparable<Karateka>
		System.out.println(karatekas);
	}

}
