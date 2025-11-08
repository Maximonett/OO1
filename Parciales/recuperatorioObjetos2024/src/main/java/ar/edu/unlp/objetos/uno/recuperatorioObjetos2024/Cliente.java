package ar.edu.unlp.objetos.uno.recuperatorioObjetos2024;


import java.time.*;
import java.util.ArrayList;
import java.util.List;


public class Cliente {
	private String nombre;
	private LocalDate fechaAlta;
	private Plan plan;
	private List<Actividad> actividades;
	
	
	
	
	public Cliente(String nombre, LocalDate fechaAlta, Plan plan ) {
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
		this.plan = plan;
		this.actividades=new ArrayList<>();
	}
	
	public void agregarActividad(Actividad actividad) {
		this.actividades.add(actividad);
	}
	
	public List<Actividad> getActividades() {
		return actividades;
	}


	public String getNombre() {
		return this.nombre;
		
	}
	public LocalDate getFechaAlta() {
		return this.fechaAlta;
	}
	
	public Plan getPlan() {
		return this.plan;
	}
	
	public void setPlan(Plan plan) {
		this.plan=plan;
	}
	
	public int getAntiguedad() {
		return Period.between(fechaAlta,LocalDate.now()).getYears();
	}
	
	
}
