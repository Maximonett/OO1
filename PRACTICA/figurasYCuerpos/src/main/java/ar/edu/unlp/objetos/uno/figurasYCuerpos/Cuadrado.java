package ar.edu.unlp.objetos.uno.figurasYCuerpos;

public class Cuadrado extends Figura{
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado=lado;
	}
	
	public Cuadrado() {}
	public double getLado() {
		return this.lado;
	}
	public void setLado(double lado) {
		this.lado=lado;
	}
	
	public double getPerimetro() {
		return 4*lado;
	}
	
	public double getArea() {
		return Math.pow(lado,2);
	}
	
}

