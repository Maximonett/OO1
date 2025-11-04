package ar.edu.unlp.objetos.uno.ejercicio15Correo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import ar.edu.unlp.objetos.uno.ejercicio15Correo.*;

public class ClienteDeCorreoTest {

    private ClienteDeCorreo cliente;
    private Email email1, email2;
    private Archivo archivo1;

    @BeforeEach
    public void setUp() {
        cliente = new ClienteDeCorreo();
        email1 = new Email("Hola", "Este es un mensaje");
        email2 = new Email("Recordatorio", "No olvidar reunión");
        archivo1 = new Archivo("archivo.txt");
        email1.agregarAdjunto(archivo1);
    }

    @Test
    public void testRecibirYEspacioOcupado() {
        cliente.recibir(email1);
        assertEquals(email1.tamanio(), cliente.espacioOcupado());
    }

    @Test
    public void testBuscar() {
        cliente.recibir(email1);
        cliente.recibir(email2);
        assertEquals(email2, cliente.buscar("reunión"));
        assertNull(cliente.buscar("no existe"));
    }

    @Test
    public void testMoverEmail() {
        Carpeta carpetaDestino = new Carpeta("Destino");
        cliente.agregarCarpeta(carpetaDestino);
        cliente.getInbox().recibir(email1);
        cliente.getInbox().mover(email1, carpetaDestino);
        assertFalse(cliente.getInbox().getEmails().contains(email1));
        assertTrue(carpetaDestino.getEmails().contains(email1));
    }
}
