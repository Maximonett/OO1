package ar.edu.unlp.objetos.uno.ejercicio13;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class InversorTest {
	
	private Inversor inversor;
	private PlazoFijo plazoFijo;
	private Accion accion;
	
	
	@BeforeEach
	
	void setUp() {
		inversor=new Inversor("Juan Domingo");
		plazoFijo=new PlazoFijo(LocalDate.now(),30000,20);
		accion=new Accion("Apple",50000,3);
		
	}
	
	@Test
	void testAgregarInversion() {
		inversor.agregarInversion(plazoFijo);
		assertEquals(30000,inversor.calcularValorActual(),0.01);
		inversor.agregarInversion(accion);
		assertEquals(30000+(50000*3),inversor.calcularValorActual(),0.01);
	}
	
	
	
	
}
