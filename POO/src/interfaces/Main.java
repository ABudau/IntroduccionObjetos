package interfaces;

public class Main {

	public static void main(String[] args) {
//		Caballo c1=new Caballo();
//		c1.setTipoPaso("galope");
//		
//		IVehiculo v1=c1;
//		
//		v1.frenar(1);
////		System.out.println(v1.freanar(1));
		
		IVehiculo[] camiones=new IVehiculo[20];
		
		CamionFrig camion1= new CamionFrig();
		CamionFrig camion2= new CamionFrig();
		CamionFrig camion3= new CamionFrig();
		CamionFrig camion4= new CamionFrig();
		CamionFrig camion5= new CamionFrig();
		
		camion1.acelerar();
		camion1.encender();
		camion1.regularTemp();
		
		camiones[0]=camion1;
		camiones[1]=camion2;
		camiones[2]=camion3;
		camiones[3]=camion4;
		camiones[4]=camion5;
//		camiones[5]=camion1;
		
		for (IVehiculo iVehiculo : camiones) {
			if (iVehiculo!=null) {
				System.out.println(iVehiculo);
			}
			
		}
		
		
		

	}

}
