package ar.edu.unlp.objetos.uno.eje11CuentaConGanchos;

public abstract class Cuenta {
	private double saldo;

	
	public Cuenta() {
		this.saldo=0;
	}
	public Cuenta(double saldo) {
		this.saldo=saldo;
	}
	

	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	public abstract void depositar(double monto);
	protected abstract void extraerSinControlar(double monto);
	
	public abstract boolean extraer(double monto);
	
	public abstract boolean transferirACuenta(double monto,Cuenta cuentaDestino);
	
	public abstract boolean puedeExtraer(double monto);
	
}
