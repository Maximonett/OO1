package ar.edu.unlp.objetos.uno.recuperatorioObjetos2024;

import java.time.*;


public abstract class Actividad {
	private LocalDate fecha;
	private String direccionIp;
	
	public Actividad(LocalDate fecha, String direccionIp) {
		this.fecha=fecha;
		this.direccionIp=direccionIp;
	}
	
	public LocalDate getFechaInicio() {
		return this.fecha;
	}
	
	public String getDireccionIp() {
		return this.direccionIp;
	}
	
	
	
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setDireccionIp(String direccionIp) {
		this.direccionIp = direccionIp;
	}

	public abstract double montoACobrar(); 
	
}
