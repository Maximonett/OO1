package ar.edu.unlp.objetos.uno.ejercicio15Correo;

public class Archivo {
	private String nombre;
	
	public Archivo(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int tamanio() {
		return nombre.length();
	}
}
