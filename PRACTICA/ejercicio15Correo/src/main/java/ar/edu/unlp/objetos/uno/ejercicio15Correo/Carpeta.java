package ar.edu.unlp.objetos.uno.ejercicio15Correo;

import java.util.*;

public class Carpeta {
	private  String nombre;
	private List<Email> emails=new ArrayList<>();
	
	public Carpeta(String nombre) {
		this.nombre=nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void recibir(Email email) {
		this.emails.add(email);
	}
	
	 
	public void mover(Email email, Carpeta destino) {
		if (this.emails.remove(email)) {
			destino.recibir(email);
		}	
	}

	
	public Email buscar(String texto) {
		return emails.stream()
				.filter(e->e.getTitulo().contains(texto) || e.getCuerpo().contains(texto))
				.findFirst()
				.orElse(null);
	}
	
	public int espacioOcupado() {
		return emails.stream()
				.mapToInt(e->e.tamanio())
				.sum();
		
	}
	
	public List<Email> getEmails(){
		return this.emails;
	}
}
