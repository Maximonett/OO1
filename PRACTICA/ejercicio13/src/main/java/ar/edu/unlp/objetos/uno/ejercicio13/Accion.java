package ar.edu.unlp.objetos.uno.ejercicio13;

public class Accion extends Inversion {
	private String nombre;
	private double valorUnitario;
	private Integer cantidadDeAcciones;
	
	public Accion(String nombre,double valorUnitario,Integer cantidadDeAcciones) {
		this.nombre=nombre;
		this.valorUnitario=valorUnitario;
		this.cantidadDeAcciones=cantidadDeAcciones;
	}
	
	public double calcularValorActual() {
		double total=0;
		total=this.valorUnitario*this.cantidadDeAcciones;
		
		return total;
	}
	
}
