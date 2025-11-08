package ar.edu.unlp.objetos.uno.recuperatorioObjetos2024;

import java.time.LocalDate;

public interface Plan {
    /**
     * Retorna el precio base del plan entre las fechas dadas.
     */
    public double precioBase();
    
    /**
     * Retorna el monto de penalización correspondiente a un cliente
     * según las actividades realizadas en el período dado.
     */
    public double montoDePenalizacion(Cliente cliente, LocalDate fechaInicial, LocalDate fechaFinal);
    
    
	double montoPorActividad(Cliente cliente, LocalDate desde, LocalDate hasta);
}
