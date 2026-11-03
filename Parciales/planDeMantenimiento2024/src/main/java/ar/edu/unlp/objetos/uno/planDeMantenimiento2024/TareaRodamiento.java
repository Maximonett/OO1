package ar.edu.unlp.objetos.uno.planDeMantenimiento2024;

public class TareaRodamiento extends Tarea{
	private int cantidadDeKilometros;

	public TareaRodamiento(int id, String descripcion, int tiempoEstimado, double costoBase, int cantidadDeKilometros) {
		super(id, descripcion, tiempoEstimado, costoBase);
		this.cantidadDeKilometros = cantidadDeKilometros;
	}

	public double costoPorTarea(double kilometrosTotales) {
		return this.costoRepuestos()+ this.getCostoBase()+(kilometrosTotales*0.05);
	}
	
	public int getCantidadDeKilometros() {
		return cantidadDeKilometros;
	}
	
	
	
}
