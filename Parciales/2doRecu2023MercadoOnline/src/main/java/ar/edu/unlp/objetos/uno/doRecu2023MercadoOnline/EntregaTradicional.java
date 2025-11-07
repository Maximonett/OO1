package ar.edu.unlp.objetos.uno.doRecu2023MercadoOnline;

public class EntregaTradicional implements Entrega {
   
    public double calcularCosto(String origen, String destino, double precioBase) {
        return 500 + (precioBase * 0.05);
    }
}

