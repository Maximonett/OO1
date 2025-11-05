package ar.edu.unlp.objetos.uno.primeraFecha2024Eventos;
import java.time.LocalDate;
import java.util.*;

public class Usuario {
	private String nombre;
	private List<Entrada> entradas=new ArrayList<>();
	
	public Usuario(String nombre) {
		this.nombre=nombre;
	}
	
	
	public double consultarPrecioDeAsistencia(Evento evento,LocalDate fechaDeConsulta) {
		return evento.precioDeAsistencia(fechaDeConsulta);
	}
		
	public Entrada comprarUnaEntrada(Evento evento,boolean conSeguro) {
		Entrada e=new Entrada(evento,LocalDate.now(),conSeguro);
		this.entradas.add(e);
		return e;
	}
	
	public double montoTotalEntradas(LocalDate inicio,LocalDate fin) {
		return this.entradas.stream()
				.filter(e->!e.getFechaCompra().isBefore(inicio) && !e.getFechaCompra().isAfter(fin))
				.mapToDouble(e->e.getEvento().precioDeAsistencia(e.getFechaCompra()))
				.sum();
				
	}
	
	public Entrada entradaSiguienteEvento() {
		LocalDate hoy=LocalDate.now();
		return this.entradas.stream()
				.filter(e->e.getEvento().getFecha().isAfter(hoy)) 
				.min(Comparator.comparing(e->e.getEvento().getFecha())) 
				.orElse(null);
	}
	
	

	
	
	
	
}
