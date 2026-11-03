package ar.edu.unlp.objetos.uno.recuperatorio30__11_2023_Veterinaria;

import java.time.*;

public abstract class ServicioConVeterinario {
	private Mascota mascota;
	private LocalDate fecha;
	private Veterinario veterinario;

	public ServicioConVeterinario(Mascota mascota,Veterinario veternario) {
		this.mascota=mascota;
		this.veterinario=veterinario;
		this.fecha=LocalDate.now();
	}
	
	public Mascota getMascota() {
		return this.mascota;
	}
	
	public LocalDate getFecha() {
		return this.fecha;
	}
	
	public Veterinario getVeterinario() {
		return this.veterinario;
	}

}
