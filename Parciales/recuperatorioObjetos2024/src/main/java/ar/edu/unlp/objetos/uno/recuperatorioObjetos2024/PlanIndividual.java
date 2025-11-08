package ar.edu.unlp.objetos.uno.recuperatorioObjetos2024;

import java.time.*;
import java.util.*;

public class PlanIndividual implements Plan {
    private String direccionIp;
    private LocalDate fechaInicio;
    private int cantidadDeMinutos;

    public PlanIndividual(String direccionIp, int cantidadDeMinutos) {
        this.fechaInicio = LocalDate.now();
        this.direccionIp = direccionIp;
        this.cantidadDeMinutos = cantidadDeMinutos;
    }

    /**
     * Precio base: $20 por cada minuto contratado.
     */
    @Override
    public double precioBase(LocalDate fechaInicial, LocalDate fechaFinal) {
        return this.cantidadDeMinutos * 20;
    }

    /**
     * Penalización: $300 por cada dirección IP distinta a la registrada.
     * Solo se consideran las actividades dentro del intervalo.
     */
    @Override
    public double montoDePenalizacion(Cliente cliente, LocalDate fechaInicial, LocalDate fechaFinal) {
        long cantDirIp = cliente.getActividades().stream()
            .filter(a -> !a.getFechaInicio().isBefore(fechaInicial) && !a.getFechaInicio().isAfter(fechaFinal))
            .map(Actividad::getDireccionIp)
            .filter(ip -> !ip.equals(this.direccionIp))
            .distinct()
            .count();

        return cantDirIp * 300;
    }

    @Override
    public double montoPorActividad(Cliente cliente, LocalDate desde, LocalDate hasta) {
        return cliente.getActividades().stream()
            .filter(a -> !a.getFechaInicio().isBefore(desde) && !a.getFechaInicio().isAfter(hasta))
            .mapToDouble(Actividad::montoACobrar)
            .sum();
    }
}
