package ar.edu.unlp.objetos.uno.ejercicio13;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PlazoFijo extends Inversion{
	private LocalDate fechaInicio;
	private double montoInicial;
	private double interesesDiarios;
	
	public PlazoFijo(LocalDate fechaInicio,double montoInicial,double interesesDiarios) {
		this.fechaInicio=fechaInicio;
		this.montoInicial=montoInicial;
		this.interesesDiarios=interesesDiarios;
	}
	
	public double calcularValorActual(){
		long cantDias=ChronoUnit.DAYS.between(this.fechaInicio,LocalDate.now());
		
		 //interes compuesto M=P*(1+i)^n
		if(this.interesesDiarios>0) {
			double monto=this.montoInicial*(Math.pow((1+this.interesesDiarios),cantDias));
			return monto;
		}else {
			return this.montoInicial;
		}
		
					
		
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public double getMontoInicial() {
		return montoInicial;
	}

	public void setMontoInicial(double montoInicial) {
		this.montoInicial = montoInicial;
	}

	public double getInteresesDiarios() {
		return interesesDiarios;
	}

	public void setInteresesDiarios(double interesesDiarios) {
		this.interesesDiarios = interesesDiarios;
	}
	
	
	
}
