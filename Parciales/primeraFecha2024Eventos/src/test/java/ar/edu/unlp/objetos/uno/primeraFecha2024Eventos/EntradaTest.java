package ar.edu.unlp.objetos.uno.primeraFecha2024Eventos;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.time.*;

import org.junit.jupiter.api.BeforeEach;

public class EntradaTest {
	private Entrada entrada1;
	private Entrada entrada2;
	private Entrada entrada3;
	private Entrada entrada4;
	private Entrada entrada5;
	private Entrada entrada6;
	private EventoVirtual evento1;
	

	
	@BeforeEach
	public void setUp() {
		evento1=new EventoVirtual("Lolapaluza",LocalDate.of(2025,4,1),"Los Ramones",200000,10000,5000);
		entrada1=new Entrada(evento1,LocalDate.of(2025,1,1),true);// debo probar la situacion en que me sean mas de 30 dias con seguro
		entrada2=new Entrada(evento1,LocalDate.of(2025,4,1),true);//debo probar la situacion en que sean menos de 30 dias con seguro y ademas pruebo que sea el mismo dia 
		entrada3=new Entrada(evento1,LocalDate.of(2025,3,2),true);//y debo probar en 30 dias con seguro
		entrada4=new Entrada(evento1,LocalDate.of(2025,1,1),false);// debo probar la situacion en que me sean mas de 30 dias sin seguro y ademas pruebo que se el mismo dia
		entrada5=new Entrada(evento1,LocalDate.of(2025,4,1),false);//debo probar la situacion en que sean menos de 30 dias sin seguro
		entrada6=new Entrada(evento1,LocalDate.of(2025,3,2),false);	//y debo probar en 30 dias sin seguro
		
		
	}
	
	@Test
	public void precioEspecificoTest() {
		assertEquals(215000,evento1.precioEspecifico());
	}
	
	
	@Test 
	public void precioDeAsistenciaTest() {
		assertEquals(215000*(1.2),evento1.precioDeAsistencia(LocalDate.of(2025,4,1))); //mismo dia 
		assertEquals(215000,evento1.precioDeAsistencia(LocalDate.of(2025,3,1))); //otro dia 
	}
	
	@Test
	public void montoARecuperarTest() {
		assertNotEquals(0,entrada1.montoARecuperar());
		assertEquals(139750,entrada1.montoARecuperar());
		assertEquals(38700,entrada2.montoARecuperar());
		assertEquals(139750,entrada3.montoARecuperar());
		assertEquals(107500,entrada4.montoARecuperar());
		assertEquals(0,entrada5.montoARecuperar());
		assertEquals(107500,entrada6.montoARecuperar());
	}
	
	
	
	
}
