package ar.edu.unlp.objetos.uno.recuperatorioObjetos2024;

import java.time.*;

public class ReproduccionVideo extends Actividad{
	private int duracionTotal;
	private int duracionPublicidad;
	
	public ReproduccionVideo(LocalDate fechaInicio,String direccionIp,
			int duracionTotal,int duracionPublicidad) {
		super(fechaInicio,direccionIp);
		this.duracionTotal=duracionTotal;
		this.duracionPublicidad=duracionPublicidad;
	}
	
	
	
	public int duracionReal() {
		return this.duracionTotal-this.duracionPublicidad;
	}
	
	public double montoACobrar() {
		return (10*this.duracionReal());
	}
	
	
}
