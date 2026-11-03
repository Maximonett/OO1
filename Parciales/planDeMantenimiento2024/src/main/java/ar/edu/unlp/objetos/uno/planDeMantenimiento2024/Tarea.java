package ar.edu.unlp.objetos.uno.planDeMantenimiento2024;

import java.util.*;

public abstract class Tarea {
    private int id;
    private String descripcion;
    private int tiempoEstimado; 
    private double costoBase;
    private List<Repuesto> repuestos; 

    public Tarea(int id, String descripcion, int tiempoEstimado, double costoBase) {
        this.id = id;
        this.descripcion = descripcion;
        this.tiempoEstimado = tiempoEstimado;
        this.costoBase = costoBase;
        this.repuestos = new ArrayList<>();
    }

    // Método abstracto: obliga a los hijos a definir su propia lógica final
    public abstract double costoPorTarea(double kilometrosTotales); 

    // NUEVO: Método para agregar repuestos
    public void agregarRepuesto(Repuesto r) {
        this.repuestos.add(r);
    }

    // NUEVO: Método auxiliar para calcular costo de repuestos
    // Esto evita repetir el stream en cada clase hija
    protected double costoRepuestos() {
        return this.repuestos.stream()
                .mapToDouble(r->r.getCosto())
                .sum();
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    public double getCostoBase() {
        return costoBase;
    }
}