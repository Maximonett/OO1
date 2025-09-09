package ar.edu.unlp.objetos.uno.balanzaMejorada;
import java.time.LocalDate;
import java.util.*;

public class Ticket {
	private LocalDate fecha;
	private int cantidadDeProductos;
	private double pesoTotal;
	private double precioTotal;
	private List<Producto> productos;
	
	public Ticket(double precioTotal,double pesoTotal,int cantidadDeProductos,List<Producto> productos) {
		this.fecha=LocalDate.now();
		this.cantidadDeProductos=cantidadDeProductos;
		this.pesoTotal=pesoTotal;
		this.precioTotal=precioTotal;
		this.productos=List.copyOf(productos); //CREA UNA COPIA INMUTABLE
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
	
	public double precioConImpuesto() {
		return this.getPrecioTotal()+impuesto();
	}

	public double impuesto() {
		
		double impuesto=this.precioTotal*21/100;
		return impuesto;
	}


	@Override
	public String toString() {
		return "Ticket [fecha=" + fecha + 
				", cantidadDeProductos=" + cantidadDeProductos + 
				", pesoTotal=" + pesoTotal+ 
				", precioTotal=" + precioTotal + 
				", productos=" + productos + "]";
	}
	
	
	
}
