package ar.edu.unlp.objetos.uno.primeraFecha2024Eventos;

import java.time.*;
import java.util.*;

public class EventoPrescencial extends Evento {
	private List<Sede> sedes;
	
	public EventoPrescencial(String nombre,LocalDate fecha,
			String temaPrincipal,double precioInscripcion,
			double precioRemera){
		super(nombre,fecha,temaPrincipal,precioInscripcion,precioRemera);
		this.sedes=new ArrayList<Sede>();
		
	}
	
	public void agregarSede(Sede unaSede) {
		sedes.add(unaSede);
	}
	
	
	public double precioEspecifico() {
		
		return sedes.stream()
				.mapToDouble(sede->sede.precioTotal())
				.sum() + this.precioBase();
		
	}
	
	

	
	
	
	
	
	
}
