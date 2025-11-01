package ar.edu.unlp.objetos.uno.ejercicio13;

import java.util.List;
import java.util.*;

public class Inversor {
	private String nombre;
	private List<Inversion> inversiones;
	
	public Inversor(String nombre){
		this.nombre=nombre;
		this.inversiones=new ArrayList<Inversion>();
	
	}
	
	
	public void agregarInversion(Inversion unaInversion) {
		
		inversiones.add(unaInversion);
	}
	
	public void quitarInversion(Inversion unaInversion) {
		inversiones.remove(unaInversion);
	}
	
	public double calcularValorActual() {
		return inversiones.stream()
							.mapToDouble(inv->inv.calcularValorActual())
							.sum();
	}
	
	
	
}
