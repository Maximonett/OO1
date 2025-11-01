package ar.edu.unlp.objetos.uno.ejerccicio8GenealogiaSalvaje;

import java.time.LocalDate;


public class Mamifero {
	private String identificador;
	private String especie;
	private LocalDate fechaNacimiento;
	private Mamifero padre;
	private Mamifero madre;
	private Mamifero abueloMaterno;
	private Mamifero abuelaMaterna;
	private Mamifero abueloPaterno;
	private Mamifero abuelaPaterna;
	
	
	public Mamifero() {}
	
	public Mamifero(String identificador) {
		this.identificador=identificador;
		
	}
	
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
	    if (unMamifero == null) {
	        return false; // un mamífero nulo nunca puede ser ancestro
	    }
	    // Caso directo: si el padre o madre es el ancestro
	    if (this.getPadre() == unMamifero || this.getMadre() == unMamifero) {
	        return true;
	    }
	    // Caso recursivo: revisar la cadena de ancestros del padre y madre
	    boolean padreEsAncestro = (this.getPadre() != null && this.getPadre().tieneComoAncestroA(unMamifero));
	    boolean madreEsAncestro = (this.getMadre() != null && this.getMadre().tieneComoAncestroA(unMamifero));
	    
	    return padreEsAncestro || madreEsAncestro;
	}
		

	public String getIdentificador() {
		return identificador;
	}


	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}


	public String getEspecie() {
		return especie;
	}


	public void setEspecie(String especie) {
		this.especie = especie;
	}


	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public Mamifero getPadre() {
		return padre;
	}


	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}


	public Mamifero getMadre() {
		return madre;
	}


	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}


	public Mamifero getAbueloMaterno() {
		return (this.getMadre()!=null) ? this.getMadre().getPadre():null;
		
	}



	public Mamifero getAbuelaMaterna() {
		return (this.getMadre()!=null) ?this.getMadre().getMadre():null;

	}


	public Mamifero getAbueloPaterno() {
		return (this.getPadre()!=null ) ?this.getPadre().getPadre():null;
	}


	public Mamifero getAbuelaPaterna() {
		return (this.getPadre()!=null)? this.getPadre().getMadre():null;
	}


	
	
	
	
}
