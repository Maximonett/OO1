package ar.edu.unlp.objetos.uno.balanzaMejorada;

import java.util.*;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	private List<Producto> productos;
	
	public Balanza() {
		this.cantidadDeProductos=cantidadDeProductos;
		this.precioTotal=precioTotal;
		this.pesoTotal=pesoTotal;
		this.productos=new ArrayList<Producto>();
	}
	
	
	
	public int getCantidadDeProductos() {
		return cantidadDeProductos;
	}

	public void setCantidadDeProductos(int cantidadDeProductos) {
		this.cantidadDeProductos = cantidadDeProductos;
	}

	public double getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}
	
	public List<Producto> getProductos(){
		return this.productos; //Esta version es poco segura
		
		// return new ArrayList<Producto>(this.productos); {de esta manera devuelve una copia}
		
		//COLLECTION UNMODILFIABLELIST version que nos da una copia no modificalbe
		//return Collections.unmodifiableList(this.productos); 
	}

	public void ponerEnCero() {
		 this.pesoTotal=0; 
		 this.cantidadDeProductos=0;
		 this.precioTotal=0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal+=producto.getPrecio();
		this.pesoTotal+=producto.getPeso();
		this.productos.add(producto); //agrego el producto
		
	}
	
	public Ticket emitirTicket() {
		Ticket unTicket=new Ticket(this.precioTotal,this.pesoTotal,this.cantidadDeProductos,this.productos);
		
		return unTicket;
	}
	
	
	
}
