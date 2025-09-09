package ar.edu.unlp.objetos.uno.figurasYCuerpos;

import java.math.*;

public class Circulo extends Figura {
	private double radio;
	
	
	public Circulo(double radio) {
		this.radio=radio;
	}
	public Circulo() {

	}
	
	public void setRadio(double radio) {
		this.radio=radio;
	}
	
	public double getRadio() {
		return this.radio;
	}
	
	public double getDiametro() {
		return radio*2;
	}
	public void setDiametro(double diametro) {
		this.radio=diametro/2;
	}
	
	public double getPerimetro() {
		return Math.PI*2*this.radio;
	}
	
	public double getArea(){
		return Math.PI*(Math.pow(radio, 2));
	}
	
}
