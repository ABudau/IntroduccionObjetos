package boletin8_2_1;


import java.time.LocalTime;

public abstract class Reloj {
	
	private LocalTime reloj;
	private int minutos;
	private int hora;
	private boolean alarma;
	
	public Reloj() {
		super();
		this.reloj = LocalTime.now();
		this.minutos =reloj.getMinute();
		this.hora = reloj.getHour();
		this.alarma=false;
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
	
	private void activarAlarma() {
		this.alarma=true;

	} 
	private void desactivarAlarma() {
		this.alarma=false;

	}
	private LocalTime establecerAlarma(int hora,int minutos) {
		LocalTime horaAlarma = null;
		if (hora>=0&&hora<24&&minutos>0&&minutos<60) {
			horaAlarma=LocalTime.of(hora, minutos);
			activarAlarma();
		}
		return horaAlarma;

	}
	abstract public void mostrarHora();
	
	@Override
	public String toString() {
		return "Reloj [reloj=" + reloj + ", minutos=" + minutos + ", hora=" + hora + ", alarma=" + alarma + "]";
	}

	
	
	
	
	
}
