package ar.edu.unlp.objetos.uno.doRecu2023MercadoOnline;

import java.util.*;

public class Express {
	

	public double calcularCosto(String origen, String destino, double precioBase) {
		
		double  distancia = Map.distanceBetween(origen, destino);
        return (distancia * 10) + (precioBase * 0.10);
    }
	
}
