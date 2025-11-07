package ar.edu.unlp.objetos.uno.doRecu2023MercadoOnline;

public class ProductoNuevo extends Publicacion {
    private int cantidad;
    private Entrega tipoEntrega;

    public ProductoNuevo(String nombre, String descripcion, double precio, int cantidad, Entrega tipoEntrega, Usuario vendedor) {
        super(nombre, descripcion, precio, vendedor);
        this.cantidad = cantidad;
        this.tipoEntrega = tipoEntrega;
    }

    public int getCantidad() {
        return cantidad;
    }

    public Entrega getTipoEntrega() {
        return tipoEntrega;
    }

  
    public double calcularPrecioFinal(String localidadDestino) {
        double precioBase = this.getPrecio();
        double costoEntrega = this.tipoEntrega.calcularCosto(this.getVendedor().getLocalidad(), localidadDestino, precioBase);
        return precioBase + costoEntrega;
    }
}
