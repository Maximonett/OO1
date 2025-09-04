package ar.edu.unlp.objetos.uno.balanzaElectronica;
import java.time.LocalDate;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	
	public Ticket(double precioTotal,double pesoTotal,int cantidadDeProductos) {
		this.fecha=LocalDate.now();
		this.cantidadDeProductos=cantidadDeProductos;
		this.pesoTotal=pesoTotal;
		this.precioTotal=precioTotal;
	}
	
	
	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}


	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}


	public double getPesoTotal() {
		return pesoTotal;
	}


	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}


	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}


	public double impuesto() {
		
		double impuesto=this.precioTotal*21/100;
		return impuesto;
	}
	
}
