package excepciones;

import utilidades.Teclado;

public class Main {

	public static void main(String[] args) {
//		boolean error=false;
////		int edad=0;
//		do {
//			try {
//				System.out.println("Dime tu edad");
//				int edad=Teclado.pedirNumeroPositivo();
//				error=false;//si se repite el bucle cambio el valor de error a false
//				System.out.println("Tu edad es: "+ edad);//si peta se ejecuta el catch, sino se muestra el mensaje
//			}catch (Exception e) {//si salta la excepcion el error vale true y el bucle se vuelve a repetir
//				System.out.println("El dato introducido no es correcto");
//				error=true;
//			}
//			
//		}while(error);
			try {
				Monumento giralda=new Monumento("giralda");
				Monumento torre=new Monumento("La torre del oro de Sevilla");
			}catch (Exception e) {
				System.out.println("No ha pasado nada");
			}finally {
				System.out.println("Adios Usuario");
			}
		
		
		

}
	
	
}
