package boletin8_2_1.ejercicio1;


import java.time.LocalTime;

public abstract class Reloj {
	
	private LocalTime reloj;
	private int minutos;
	private int hora;
	private boolean alarma;
	private LocalTime horaAlarma;
	
	public LocalTime getHoraAlarma() {
		return horaAlarma;
	}

	public void setHoraAlarma(LocalTime horaAlarma) {
		this.horaAlarma = horaAlarma;
	}

	public Reloj() {
		super();
		this.reloj = LocalTime.now();
		this.minutos =reloj.getMinute();
		this.hora = reloj.getHour();
		this.alarma=false;
	}

	public LocalTime getReloj() {
		return reloj;
	}

	public boolean isAlarma() {
		return alarma;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos>0&&minutos<60) {
			this.minutos = minutos;
		}
		
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora>=0&&hora<24) {
			this.hora = hora;
		}
		
	}
	
	public void activarAlarma() {
		this.alarma=true;

	} 
	public void desactivarAlarma() {
		this.alarma=false;

	}
	/**
	 * Método que estable una alarma 
	 * @param hora es la hora a la que se desea poner la alarma
	 * @param minutos son los minutos que se desea poner la alarma
	 */ 
	public void establecerAlarma(int hora,int minutos) {

		if (hora>=0&&hora<24&&minutos>0&&minutos<60) {
			this.horaAlarma=LocalTime.of(hora, minutos);
			activarAlarma();
		}
	}
	abstract public void mostrarHora();
	
	@Override
	public String toString() {
		return "Reloj [reloj=" + reloj + ", minutos=" + minutos + ", hora=" + hora + ", alarma=" + alarma + "]";
	}

	
	
	
	
	
}
