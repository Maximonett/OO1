package ar.edu.unlp.objetos.uno.balanzaElectronica;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal;
	private double pesoTotal;
	
	public Balanza() {
		this.cantidadDeProductos=cantidadDeProductos;
		this.precioTotal=precioTotal;
		this.pesoTotal=pesoTotal;
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


	public void ponerEnCero() {
		 this.pesoTotal=0; 
		 this.cantidadDeProductos=0;
		 this.precioTotal=0;
	}
	
	public void agregarProducto(Producto producto) {
		this.cantidadDeProductos++;
		this.precioTotal+=producto.getPrecio();
		this.pesoTotal+=producto.getPeso();
		//me falta donde agregarlo????
	}
	
	public Ticket emitirTicket() {
		Ticket unTicket=new Ticket(this.precioTotal,this.pesoTotal,this.cantidadDeProductos);
		
		return unTicket;
	}
}
