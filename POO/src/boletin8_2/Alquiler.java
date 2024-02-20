package Boletin8_2;

import java.time.LocalDate;

public class Alquiler {
	private Inquilino inquilino;
	private Piso piso;
	private LocalDate fechaInicioContrato;
	
	private static Alquiler[] alquileres;
	
	private static final int IVA=21;
	
	
	public Alquiler(Inquilino inquilino, Piso piso, LocalDate fechaInicioContrato) {
		super();
		this.inquilino = inquilino;
		this.piso = piso;
		this.fechaInicioContrato = fechaInicioContrato;
	}

	public Inquilino getInquilino() {
		return inquilino;
	}

	public void setInquilino(Inquilino inquilino) {
		this.inquilino = inquilino;
	}

	public Piso getPiso() {
		return piso;
	}

	public void setPiso(Piso piso) {
		this.piso = piso;
	}

	public LocalDate getFechaInicioContrato() {
		return fechaInicioContrato;
	}

	public void setFechaInicioContrato(LocalDate fechaInicioContrato) {
		this.fechaInicioContrato = fechaInicioContrato;
	}

	public static Alquiler[] getAlquileres() {
		return alquileres;
	}

	public static void setAlquileres(Alquiler[] alquileres) {
		Alquiler.alquileres = alquileres;
	}

	public static int getIva() {
		return IVA;
	}
	
	public double getPrecioAlquiler() {
//		Piso p;
		double precio;
		precio=this.piso.getPrecioBase()*IVA/100+this.piso.getPrecioBase();
		return precio;
	}
	
	/**
	 * Metodo que calcula el alquiler mas caro
	 * @return devuelve el alquiler mas caro
	 */
	
	public static Alquiler  getAlquilerMasCaro() {
		Piso p =new Piso(null, null, 0);
		Alquiler alquiler=new Alquiler(null, p, null);
		
		for (int i = 0; i < alquileres.length; i++) {
			if (getAlquileres()[i]!=null&&p!=null) {
				if (getAlquileres()[i].getPrecioAlquiler()>alquiler.getPrecioAlquiler()) {
					alquiler=getAlquileres()[i];
				}
			}
		}
		return alquiler;
	}
	
	@Override
	public String toString() {
		return "Alquiler [inquilino=" + inquilino + ", piso=" + piso + ", fechaInicioContrato=" + fechaInicioContrato
				+ "]";
	}
	
	
}
