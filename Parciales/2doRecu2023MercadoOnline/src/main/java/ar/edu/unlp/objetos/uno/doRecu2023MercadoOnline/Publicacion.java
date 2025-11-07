package ar.edu.unlp.objetos.uno.doRecu2023MercadoOnline;


import java.time.*;


public abstract class Publicacion  {
	private String nombre;
	private String descripcion;
	private double precio;
	private Usuario vendedor;
	
	public Publicacion(String nombre,String descripcion,double precio,Usuario vendedor) {
		this.nombre=nombre;
		this.descripcion=descripcion;
		this.precio=precio;
		this.vendedor=vendedor;
	}
	
	public Usuario getVendedor() {
		return vendedor;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public Usuario getVendendor() {
		return vendedor;
	}
	
	public abstract double calcularPrecioFinal(String localidad);
	
	
	
	
	
}
