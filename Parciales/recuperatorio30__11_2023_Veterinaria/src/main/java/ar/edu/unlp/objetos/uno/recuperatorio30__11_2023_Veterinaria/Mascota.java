package ar.edu.unlp.objetos.uno.recuperatorio30__11_2023_Veterinaria;

import java.time.*;
import java.util.*;


public class Mascota {
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private String especie;
	private List<Servicio> historialDeVisitas;
	
	
	public Mascota(String nombre,LocalDate fechaDeNacimiento,String especie) {
		this.nombre=nombre;
		this.fechaDeNacimiento=fechaDeNacimiento;
		this.especie=especie;
		this.historialDeVisitas=new ArrayList<Servicio>();
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public LocalDate getFechaDeNacimiento() {
		return this.fechaDeNacimiento;
	}
	
	public String getEspecie() {
		return this.especie;
	}
	
	public void registrarVisita(Servicio servicio) {
		this.historialDeVisitas.add(servicio);
	}
	
	
	

	
}
