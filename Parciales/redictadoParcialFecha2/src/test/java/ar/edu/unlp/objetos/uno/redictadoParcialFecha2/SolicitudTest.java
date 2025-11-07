package ar.edu.unlp.objetos.uno.redictadoParcialFecha2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDateTime;
import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class SolicitudTest {
	private Impresion3D impresion3d;
	private ImpresionLaserByN impresionByN;
	private Impresion3D trabajo0;
	private Usuario usuario;
	private Solicitud solicitud1;
	private Solicitud solicitud2;
	
	@BeforeEach
	public void setUp() {
		usuario=new Usuario("31298976","Julian",20000);
		solicitud1=new Solicitud(usuario,LocalDateTime.now());
		solicitud2=new Solicitud(usuario,LocalDateTime.now());
		impresion3d=new Impresion3D("Pinguino", 300);// $1500+ $6
		impresionByN=new ImpresionLaserByN(20,"simple faz"); //$60
		trabajo0=new Impresion3D("Nada", 0);
		
		solicitud1.agregarTrabajo(impresion3d);
		solicitud1.agregarTrabajo(impresionByN);
		solicitud2.agregarTrabajo(trabajo0);
	
	}
	
	@Test
	public void confirmarSolicitudDeTrabajoTest() {
		assertEquals("Confirmado",solicitud1.confirmarSolicitudDeImpresion());
		assertNotEquals("Pendiente",solicitud1.confirmarSolicitudDeImpresion());
		assertEquals("Confirmado", solicitud2.confirmarSolicitudDeImpresion());
	}
	
	@Test
	public void montoAPagarPorSolicitudTest() {
		assertEquals(1566,solicitud1.montoAPagarPorSolicitud());
		assertNotEquals(0, solicitud1.montoAPagarPorSolicitud());
		assertEquals(0, solicitud2.montoAPagarPorSolicitud());
		
	}
	
}
