package ar.edu.unlp.objetos.uno.recuperatorioObjetos2024;

import java.util.*;
import java.time.*;

public class SesionJuego extends Actividad {
    private int duracion;
    private List<Item> items;

    public SesionJuego(LocalDate fechaInicio, String direccionIp, int duracion) {
        super(fechaInicio, direccionIp);
        this.duracion = duracion;
        this.items = new ArrayList<>();
    }

    public void agregarItem(Item item) {
        this.items.add(item);
    }

    @Override
    public double montoACobrar() {
        if (this.duracion > 360) {
            return items.stream()
                    .mapToDouble(i -> i.precioFinal())
                    .sum();
        }
        return 0;
    }
}

