package ar.edu.unlp.objetos.uno.presupuestos;

public class Item {
	private String detalle;
	private Integer cantidad;
	private double costoUnitario;
	
	
	public Item(String detalle,Integer cantidad,double costoUnitario){
		this.detalle=detalle;
		this.cantidad=cantidad;
		this.costoUnitario=costoUnitario;
	}
	
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	
	public double costo() {
		double costo=0;
		
		costo=this.cantidad*this.costoUnitario;
		
		return costo;
	}
	
}
