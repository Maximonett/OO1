package ar.edu.unlp.objetos.uno.recuperatorio30__11a_2023_Veterinaria;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;

public class ServicioConsulta extends ServicioConVeterinario {
	

	public ServicioConsulta(Mascota mascota, Veterinario veterinario) {
		super(mascota,veterinario);
		
	}
	
	
	public double costosPorConsulta() {
		
		
		double honorarios= this.veterinario.getHonorarios();
		
		int antiguedad=Period.between(this.veterinario.getFechaDeIngreso(), LocalDate.now()).getYears();
		double adicionalPorAntiguedad=antiguedad*100;
		
		if (LocalDate.now().getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
			return honorarios+adicionalPorAntiguedad+300+200;
		}
		else {
			return honorarios+adicionalPorAntiguedad+300;
		}
		
	
	}	
	
	
	
	
	
}
