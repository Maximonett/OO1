package ar.edu.unlp.objetos.uno.doRecu2023MercadoOnline;

import java.time.*;
import java.util.*;

public class Usuario {
	private String email;
	private String localidad;
	private LocalDate fechaIngreso;
	private List<Publicacion> publicaciones;

	public Usuario(String email,String localidad) {
		this.email=email;
		this.localidad=localidad;
		this.fechaIngreso=LocalDate.now();
		this.publicaciones=new ArrayList<>();
	}
	
	
	public void agregarPublicacion(Publicacion unaPublicacion) {
		this.publicaciones.add(unaPublicacion);
	}
	
	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public String getEmail() {
		return this.email;
	}
	public String getLocalidad() {
		return this.localidad;
	}
	public LocalDate getFechaIngreso() {
		return this.fechaIngreso;
	}
	
	public int getAniosEnSistema() {
		return Period.between(fechaIngreso, LocalDate.now()).getYears();
	}

}


