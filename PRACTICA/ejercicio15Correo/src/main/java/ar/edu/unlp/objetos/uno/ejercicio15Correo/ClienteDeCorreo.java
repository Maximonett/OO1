package ar.edu.unlp.objetos.uno.ejercicio15Correo;

import java.util.*;

public class ClienteDeCorreo {
	private Carpeta inbox;
	private List<Carpeta> carpetas=new ArrayList<Carpeta>();
	
	
	public ClienteDeCorreo() {
	    this.inbox = new Carpeta("Inbox");
	    this.carpetas.add(this.inbox);
	}

	
	
	public void recibir (Email email) {
		this.inbox.recibir(email);
	}
	
	
	public void agregarCarpeta(Carpeta carpeta) {
		carpetas.add(carpeta);
	}
	
	
	public Email buscar(String texto) {
		return carpetas.stream()
				.map(c->c.buscar(texto))  //busco 
				.filter(Objects::nonNull) //me quedo sin los nulos
				.findFirst() //muestro el primero
				.orElse(null); // 
			
	}
	
	public int espacioOcupado() {
		return carpetas.stream()
				.mapToInt(c->c.espacioOcupado())
				.sum();
	}
	
	public Carpeta getInbox() {
		return this.inbox;
	}
	
	public List<Carpeta> getCarpetas(){
		return this.carpetas;
	}
	

	
	
}


