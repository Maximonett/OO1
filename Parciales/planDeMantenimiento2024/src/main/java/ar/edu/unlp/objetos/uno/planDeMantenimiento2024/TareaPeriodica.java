package ar.edu.unlp.objetos.uno.planDeMantenimiento2024;

public class TareaPeriodica extends Tarea {
	private int cantidadDeDias;

	public TareaPeriodica(int id, String descripcion, int tiempoEstimado, double costoBase, int cantidadDeDias) {
		super(id, descripcion, tiempoEstimado, costoBase);
		this.cantidadDeDias = cantidadDeDias;
	}
	
	
	public double costoPorTarea(double kilometrosTotales) {
		return this.getCostoBase()+this.costoRepuestos();
	}
	
	public int getCantidadDeDias() {
		return this.cantidadDeDias;
	}

}
