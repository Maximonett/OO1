package ar.edu.unlp.objetos.uno.ejer10Empleados;

public class EmpleadoJerarquico extends Empleado{
	
	public EmpleadoJerarquico(String nombre) {
		super(nombre);
	}
	
	public double sueldoBasico() {
		return 
				super.sueldoBasico()
				+this.bonoPorCategoria();
	}
	
	public double montoBasico() {
		return 45000;
	}
	public double bonoPorCategoria() {
		return 8000;
	}
	
}
