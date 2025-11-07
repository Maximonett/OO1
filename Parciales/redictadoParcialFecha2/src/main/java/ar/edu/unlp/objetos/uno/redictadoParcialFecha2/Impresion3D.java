package ar.edu.unlp.objetos.uno.redictadoParcialFecha2;

public class Impresion3D extends Trabajo{
	private String nombreArchivo;
	private double cantidadDeFilamento;
	
	
	public Impresion3D(String nombreArchivo,double cantidadDeFilamento) {
		this.nombreArchivo=nombreArchivo;
		this.cantidadDeFilamento=cantidadDeFilamento;
	}
	
	public double calcularTiempoDeImpresion() {
		return this.cantidadDeFilamento/100;
	}
	
	public double calcularCostoDeImpresion() {
		return (this.cantidadDeFilamento*5) + (this.calcularTiempoDeImpresion()*2); 
	}

	public String descripcion() {
	    return "Impresión 3D, archivo: " + this.nombreArchivo + ", " + this.cantidadDeFilamento + "g";
	}

	
}
