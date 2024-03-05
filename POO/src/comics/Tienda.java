package comics;



public class Tienda {
	private static ComicEstandar [] comics = new ComicEstandar[100];
	
	
	
	
	public static ComicEstandar[] getComics() {
		return comics;
	}




	public static void setComics(ComicEstandar[] comics) {
		Tienda.comics = comics;
	}




	public static boolean aniadirComic(ComicEstandar comic) {
		boolean guardado=false;
		if (getComics()!=null&&comic!=null) {
			for (int i = 0; i < getComics().length&&!guardado; i++) {
				if (getComics()[i]==null) {
					getComics()[i]=comic;
					guardado=true;
				}
			}
		}
		return guardado;

	}	
	
	public static void mostarComicAniadido(ComicEstandar comic) {
	if (aniadirComic(comic)) {
		System.out.println("*************Comic dado satisfactoriamente de alta*******\n\r");
		System.out.println(comic);
		System.out.println("\r*************************************************************\r\n");
	}	
	}
}
