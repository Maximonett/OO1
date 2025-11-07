package ar.edu.unlp.objetos.uno.redictadoParcialFecha2;

import java.util.*;
import java.util.stream.Collectors;
import java.time.*;


public class Solicitud {
	private Usuario usuario;
	private LocalDateTime fechaYHora;
	private String estado;
	private List<Trabajo> trabajos;
	
	
	public Solicitud(Usuario unUsuario,LocalDateTime fechaYHora) {
		this.usuario=usuario;
		this.fechaYHora=fechaYHora;
		this.estado="Pendiente";
		this.trabajos=new ArrayList<>();
	}
	
	public void setEstado(String unEstado) {
		this.estado=unEstado;
	}
	
	
	public void agregarTrabajo(Trabajo unTrabajo) {
		trabajos.add(unTrabajo);
	}
	
	public double montoAPagarPorSolicitud() {	
		return trabajos.stream()
				.mapToDouble(t->t.calcularCostoDeImpresion())
				.sum();
	}
	
	public void confirmarSolicitudDeImpresion() {
		
		this.usuario.descontarCredito(this.montoAPagarPorSolicitud());
		this.setEstado("Confirmado");
		
		
	}
	
	public String imprimirComprobante() {
	    double totalTiempo = trabajos.stream()
	            .mapToDouble(Trabajo::calcularTiempoDeImpresion)
	            .sum();

	    double totalCosto = this.montoAPagarPorSolicitud();
	    double credito = this.usuario.getCredito();
	    double cubiertoPorCredito = Math.min(totalCosto, credito);
	    double saldoAPagar = Math.max(0, totalCosto - credito); //si es negativo devuelve 0 y sino devuelve lo que falta....

	    String aux = "Usuario: " + this.usuario.getDni() + " - Fecha: " + LocalDateTime.now() + "\n"
	               + "Trabajos incluidos:\n";

	    // 👇 sin instanceof ni casting
	    String detalle = trabajos.stream()
	            .map(Trabajo::descripcion) // .map(t->t.descripcion() ....son los mismo....
	            .collect(Collectors.joining("\n"));

	    aux += detalle + "\n"
	         + "Tiempo estimado de realización: " + totalTiempo + "\n"
	         + "Costo cubierto por crédito: $" + cubiertoPorCredito + "\n"
	         + "Saldo a pagar: $" + saldoAPagar;

	    return aux;
	}

}
