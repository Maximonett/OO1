package ar.edu.unlp.objetos.uno.redictadoParcialFecha2;

public class Usuario {
	private String dni;
	private String nombre;
	private double credito;
	
	
	public Usuario(String dni,String nombre,double credito) {
		this.dni=dni;
		this.nombre=nombre;
		this.credito=credito;
	}
	
	public String getDni() {
		return this.dni;
	}
	public String getNombre() {
		return this.nombre;
	}
	
	public double getCredito() {
		return this.credito;
	}
	
	public void descontarCredito(double monto) {
		if (monto>credito) {
			System.out.println("cerdito insuficiente");
		}
		if(monto<=credito) {
			credito-=monto;
		}
	}

}
