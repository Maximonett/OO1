package ar.edu.unlp.objetos.uno.primeraFecha2024Eventos;

import java.time.LocalDate;

public class EventoVirtual extends Evento{
	private double montoFijo;
	
	
	public EventoVirtual(String nombre,LocalDate fecha,
			String temaPrincipal,double precioInscripcion,
			double precioRemera,double montoFijo){
		super(nombre,fecha,temaPrincipal,precioInscripcion,precioRemera);
		this.montoFijo=montoFijo;
		
	}
	
	
	public double precioEspecifico(){
		return this.montoFijo + this.precioBase();
	}
}
