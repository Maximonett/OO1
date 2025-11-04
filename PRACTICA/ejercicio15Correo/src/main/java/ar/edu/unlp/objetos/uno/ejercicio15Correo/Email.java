package ar.edu.unlp.objetos.uno.ejercicio15Correo;

import java.util.*;

public class Email {
	private String titulo;
	private String cuerpo;
	private List<Archivo> adjuntos=new ArrayList<>();
	
	public Email(String titulo,String cuerpo) {
		this.titulo=titulo;
		this.cuerpo=cuerpo;
		
	}
	
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String getCuerpo() {
		return this.cuerpo;
	}
	
	public void agregarAdjunto(Archivo archivo) {
		adjuntos.add(archivo);
	}
	
	public int tamanio() {
		int tamaño=titulo.length()+cuerpo.length();
		int tamañoAdj= adjuntos.stream()
					.mapToInt(a->a.tamanio())
					.sum();
		return tamaño+tamañoAdj;
	}
	
	
}
