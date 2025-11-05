package ar.edu.unlp.objetos.uno.primeraFecha2024Eventos;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Entrada {
	private Evento evento;
	private LocalDate fechaCompra;
	private boolean seguro;
	
	public Entrada(Evento evento,LocalDate fechaCompra,boolean seguro) {
		this.evento=evento;
		this.fechaCompra=fechaCompra;
		this.seguro=seguro;
	}

	public Evento getEvento() {
		return evento;
	}

	public LocalDate getFechaCompra() {
		return fechaCompra;
	}

	public boolean isSeguro() {
		return seguro;
	}
	
	
	// debo probar la situacion en que me sean mas de 30 dias con seguro
	//debo probar la situacion en que sean menos de 30 dias con seguro
	//y debo probar en 30 dias con seguro
	// debo probar la situacion en que me sean mas de 30 dias sin seguro
	//debo probar la situacion en que sean menos de 30 dias sin seguro
	//y debo probar en 30 dias sin seguro
	
	public double montoARecuperar(){
		double recupero=0;
		
		long cantDiasDesde=ChronoUnit.DAYS.between(this.fechaCompra,this.evento.getFecha());
		double precioAsistencia=this.evento.precioDeAsistencia(fechaCompra);
		
		if(cantDiasDesde>=30) recupero=precioAsistencia*0.5;
		
		if(this.seguro) recupero+=precioAsistencia*0.15;
		
		return recupero;
	}
}
