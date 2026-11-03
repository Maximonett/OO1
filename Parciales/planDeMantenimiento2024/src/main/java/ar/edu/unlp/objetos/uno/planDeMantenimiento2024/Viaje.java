package ar.edu.unlp.objetos.uno.planDeMantenimiento2024;

import java.time.*;

public class Viaje {
	private LocalDate fecha;
	private double kilometrosRecorridos;
	
	public Viaje(LocalDate fecha, double kilometrosRecorridos) {
		super();
		this.fecha = fecha;
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public double getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}
	
	
	
	
}
