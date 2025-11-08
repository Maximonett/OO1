package ar.edu.unlp.objetos.uno.recuperatorioObjetos2024;

import java.util.*;
import java.time.*;

public class Plataforma {
    private List<Cliente> clientes;
    
    public Plataforma() {
        this.clientes = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    /**
     * Retorna el monto total a cobrar a un cliente entre dos fechas dadas.
     * El monto total se calcula como:
     * precio base del plan + penalización + costo por actividad.
     */
    public double montoTotalACobrar(Cliente cliente, LocalDate fechaInicial, LocalDate fechaFinal) {
        double precioBase = cliente.getPlan().precioBase(fechaInicial, fechaFinal);
        double penalizacion = cliente.getPlan().montoDePenalizacion(cliente, fechaInicial, fechaFinal);
        double costoActividad = cliente.getPlan().montoPorActividad(cliente,fechaInicial,fechaFinal);
        
        return precioBase + penalizacion + costoActividad;
    }
}
