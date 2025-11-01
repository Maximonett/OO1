package ar.edu.unlp.objetos.uno.ejer10Empleados;

public class Test {

	public static void main(String[] args) {
		
		Gerente alan= new Gerente("Alan Turing");
		
		double aportesDeAlan=alan.aportes();
		
		double sueldoBasicoDeAlan=alan.sueldoBasico();
		
		System.out.println("El sueldo basico de Alan es de $"+sueldoBasicoDeAlan);
		System.out.println("Los aportes de Alan son de $"+aportesDeAlan);
	}

}
