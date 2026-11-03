package ar.edu.unlp.objetos.uno.recuperatorio30__11_2023_Veterinaria;

import java.util.*;
import java.time.*;

public class SistemaVeterinaria {
	private List<Mascota> mascotas;
	private List<Veterinario> veterinarios;
	
	
	public SistemaVeterinaria() {
		this.mascotas=new ArrayList<>();
		this.veterinarios=new ArrayList<>();
	}
	
		
	public Veterinario registrarVeterinario(String nombre, LocalDate fechaDeIngreso,double honorarios) {
		Veterinario vete=new Veterinario(nombre, fechaDeIngreso, honorarios);
		this.veterinarios.add(vete);
		
		return vete;
	}
	
	public Mascota registrsrMascota(String nombre,LocalDate fechaDeNacimiento,String especie) {
		Mascota mascota=new Mascota(nombre, fechaDeNacimiento, especie);
		
		this.mascotas.add(mascota);
		
		return mascota;
	}
	
	public Servicio registrarUnaConsultaMedica(Veterinario vete, Mascota mascota) {
		
		Servicio consulta=new ServicioConsulta(mascota,vete);
		
		mascota.registrarVisita(consulta);
		
		return consulta;
		
	}
	
	public Servicio registrarUnaVacunacion(Veterinario vete,Mascota mascota) {}
}
