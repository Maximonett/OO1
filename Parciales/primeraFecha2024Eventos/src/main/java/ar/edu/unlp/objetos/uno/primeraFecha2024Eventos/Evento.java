package ar.edu.unlp.objetos.uno.primeraFecha2024Eventos;

import java.util.*;
import java.time.*;

public abstract class Evento {
	private String nombre;
	private LocalDate fecha;
	private String temaPrincipal;
	private double precioInscripcion;
	private double precioRemera;
	
	
	
	
	public String getNombre() {
		return nombre;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public String getTemaPrincipal() {
		return temaPrincipal;
	}


	public double getPrecioInscripcion() {
		return precioInscripcion;
	}


	public double getPrecioRemera() {
		return precioRemera;
	}


	public Evento(String nombre, LocalDate fecha, String temaPrincipal, double precioInscripcion, double precioRemera) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.temaPrincipal = temaPrincipal;
		this.precioInscripcion = precioInscripcion;
		this.precioRemera = precioRemera;
	}


	public double precioBase() {
		double total=0;
		total=this.precioInscripcion+this.precioRemera;
		return total;	
	} 
	
	public double precioDeAsistencia(LocalDate fechaDeConsulta) {
		double precio=this.precioEspecifico();
		if(this.fecha.equals(fechaDeConsulta)) {
			precio+=this.precioEspecifico()*0.2;
		}
		return precio;
		
		
	}
	
	protected abstract double precioEspecifico();
	

}
