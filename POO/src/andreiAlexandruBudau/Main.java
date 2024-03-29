package andreiAlexandruBudau;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
	public static void main(String[] args) {
		
		Socio s1 = new Socio("Ana", 10);
		SocioFundacional socioF = new SocioFundacional("Pedro", 2, LocalDate.of(1990, 05, 8));
		Socio[]sociosInvitados=new Socio[socioF.getSociosInvitados().length];
		sociosInvitados[0]=s1;
		socioF.setSociosInvitados(sociosInvitados);
		
		Socio[]socios = new Socio[10];
		socios[0]=s1;
		socios[1]=socioF; 
		
		Club.setSociosClub(socios);
		
		Pista p1= new Pista(1, true);
		Club.almacenarPista(p1);
		
//		s1.reservarPista(p1, LocalDate.of(2024, 02, 29), LocalTime.of(10, 0));
	System.out.println(s1.reservarPista(p1, LocalDate.of(2024, 02, 29), LocalTime.of(10, 00)));
	System.out.println(socioF.reservarPista(p1, LocalDate.of(2024, 02, 29), LocalTime.of(11, 00)));
//	System.out.println(Club.getReservasRealizadas()[1]);
	
	Club.mostrarReservasRealizadas();
	System.out.println(socioFundancionalMasAntiguo());
	
	}
	
	public static SocioFundacional socioFundancionalMasAntiguo() {
		SocioFundacional socioMasAntiguo=null;
		LocalDate fechaMasAntiguo=LocalDate.now();
		
		Socio[] socios=Club.getSociosClub();
		
		for (int i = 0; i < socios.length; i++) {
			Socio socio=socios[i];
			if (socio!=null) {
				if (socio instanceof SocioFundacional) {
					SocioFundacional socioAux =(SocioFundacional)socios[i];
					if (socioAux.getFechaInscripcion().isBefore(fechaMasAntiguo)) {
						socioMasAntiguo=socioAux;
						fechaMasAntiguo=socioAux.getFechaInscripcion();
					}
				}
			}
		}
		return socioMasAntiguo;
	}
}
