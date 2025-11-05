package ar.edu.unlp.objetos.uno.primeraFecha2024Eventos;

public class Sede {
	private String nombre;
	private String lugar;
	private double estadiaPorDia;
	private int cantidadDeDias;
	
	public Sede(String nombre, String lugar,double estadiaPorDia) {
		this.nombre=nombre;
		this.lugar=nombre;
		this.estadiaPorDia=estadiaPorDia;
	}
	
	public double precioTotal() {
		double total=0;

		total=this.estadiaPorDia*this.cantidadDeDias;
		return total;
	}
}
