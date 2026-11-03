package ar.edu.unlp.objetos.uno.planDeMantenimiento2024;

import java.util.*;
import java.time.*;



public class Tren {
	private String numeroDeSerie;
	private String modelo;
	private String marca;
	private LocalDate fechaDeIngreso;
	private double kilometrosTotales;
	private List<Viaje> viajes;
	private List<Tarea> tareasRealizadas;
	
	
	public Tren(String numeroDeSerie,String modelo,String marca,LocalDate fechaDeIngreso,
			double kilommetrosTotales) {
		this.numeroDeSerie=numeroDeSerie;
		this.modelo=modelo;
		this.marca=marca;
		this.fechaDeIngreso=fechaDeIngreso;
		this.kilometrosTotales=kilometrosTotales;
		this.viajes=new ArrayList<Viaje>();
		this.tareasRealizadas=new ArrayList<Tarea>();
		
	}

	public Viaje registrarViaje(LocalDate fecha,double kilometrosRecorridos) {
		Viaje viaje=new Viaje(fecha,kilometrosRecorridos);
		this.viajes.add(viaje);
		this.kilometrosTotales+=viaje.getKilometrosRecorridos();
		return viaje;
	}
	
	
	
	
	public String getNumeroDeSerie() {
		return numeroDeSerie;
	}


	public String getModelo() {
		return modelo;
	}


	public String getMarca() {
		return marca;
	}


	public LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}


	public double getKilometrosTotales() {
		return kilometrosTotales;
	}


	public List<Viaje> getViajes() {
		return viajes;
	}


	public List<Tarea> getTareasRealizadas() {
		return tareasRealizadas;
	}
	
	
	
	
	
}
