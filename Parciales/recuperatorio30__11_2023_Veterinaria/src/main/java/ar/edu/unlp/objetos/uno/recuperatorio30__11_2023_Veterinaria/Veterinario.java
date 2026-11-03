package ar.edu.unlp.objetos.uno.recuperatorio30__11_2023_Veterinaria;


import java.time.*;


public class Veterinario {
	private String nombre;
	private LocalDate fechaDeIngreso;
	private double honorarios;
	
	
	public Veterinario(String nombre,LocalDate fechaDeIngreso,double honorarios) {
		this.nombre=nombre;
		this.fechaDeIngreso=fechaDeIngreso;
		this.honorarios=honorarios;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public LocalDate getFechaDeIngreso() {
		return this.fechaDeIngreso;
	}
	public double getHonorarios() {
		return this.honorarios;
	}
	
	
}
