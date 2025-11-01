package ar.edu.unlp.objetos.uno.ejercicio13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;



public class PlazoFijoTest {
	private PlazoFijo plazoFijo1;
	private PlazoFijo plazoFijo2;
	private PlazoFijo plazoFijo3;
	private PlazoFijo plazoFijo4;
	
	@BeforeEach
	
	void setUp() {
		//esta es la opcion con interes diario cero y monto cero
		plazoFijo1=new PlazoFijo(LocalDate.of(2024, 8, 25),0,0);
		//esta es la opcion para corroborar un fecha cualquiera
		plazoFijo2=new PlazoFijo(LocalDate.of(2024, 8, 25), 100, 0.02);
		//esta es la opcion con interes diario 2% y monto cero
		plazoFijo3=new PlazoFijo(LocalDate.of(2024, 8, 25),0,0.02);
		//esta es la opcion con interes diario 0 y monto 100
		plazoFijo4=new PlazoFijo(LocalDate.of(2024, 8, 25),100,0);
	}

	@Test
	void testCalcularValorActual() {
		assertEquals(0,plazoFijo1.calcularValorActual(),0.01); 
		
	    // Cantidad de días entre 2024-08-25 y hoy
	    long dias = java.time.temporal.ChronoUnit.DAYS.between(
	        LocalDate.of(2024, 8, 25), LocalDate.now());
	    
	    double esperado = 100 * Math.pow(1 + 0.02, dias);
	    
	    assertEquals(esperado, plazoFijo2.calcularValorActual(), 0.01);
	    assertEquals(0,plazoFijo3.calcularValorActual(),0.01);
	    assertEquals(100,plazoFijo4.calcularValorActual(),0.01);
	    
	
	}
	
	
}
