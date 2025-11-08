package ar.edu.unlp.objetos.uno.recuperatorioObjetos2024;

import java.time.*;
import java.util.*;

public class PlanGrupal implements Plan {
    private int cantidadDeIpLimite;
    private LocalDate fechaDeInicio;

    public PlanGrupal(int cantidadDeIpLimite) {
        this.cantidadDeIpLimite = cantidadDeIpLimite;
        this.fechaDeInicio = LocalDate.now();
    }

    /**
     * Precio base: $800 por cada IP contratada.
     */
    @Override
    public double precioBase() {
        return this.cantidadDeIpLimite * 800;
    }

    /**
     * Penalización:
     * Si el cliente tiene más direcciones IP utilizadas que el límite contratado,
     * paga $500 por cada IP adicional.
     * Si la antigüedad del cliente es mayor a 10 años, no se cobra penalización.
     */
    @Override
    public double montoDePenalizacion(Cliente cliente, LocalDate fechaInicial, LocalDate fechaFinal) {
        // Si tiene más de 10 años de antigüedad, no paga penalización
        if (cliente.getAntiguedad() > 10) {
            return 0;
        }

        long cantIpsUsadas = cliente.getActividades().stream()
            .filter(a -> !a.getFechaInicio().isBefore(fechaInicial) && !a.getFechaInicio().isAfter(fechaFinal))
            .map(Actividad::getDireccionIp)
            .distinct()
            .count();

        if (cantIpsUsadas > this.cantidadDeIpLimite) {
            long exceso = cantIpsUsadas - this.cantidadDeIpLimite;
            return exceso * 500;
        }

        return 0;
    }

    /**
     * Monto total por actividades registradas en el intervalo.
     * Se suman los montos individuales de cada actividad.
     */
    @Override
    public double montoPorActividad(Cliente cliente, LocalDate desde, LocalDate hasta) {
        return cliente.getActividades().stream()
            .filter(a -> !a.getFechaInicio().isBefore(desde) && !a.getFechaInicio().isAfter(hasta))
            .mapToDouble(Actividad::montoACobrar)
            .sum();
    }
}
