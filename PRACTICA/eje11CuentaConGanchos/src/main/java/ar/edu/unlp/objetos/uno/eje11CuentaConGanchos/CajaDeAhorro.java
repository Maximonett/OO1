package ar.edu.unlp.objetos.uno.eje11CuentaConGanchos;

public class CajaDeAhorro extends Cuenta {
	
	public CajaDeAhorro() {
		
	}
	public CajaDeAhorro(double saldo) {	
		super(saldo);
	}

	
	public void depositar(double monto) {
		double saldo=this.getSaldo();
		saldo+=monto;
		this.setSaldo(saldo);
	}
	
	protected  void extraerSinControlar(double monto) {
		double saldo=this.getSaldo();
		saldo-=monto;
		this.setSaldo(saldo);
	}
	
	public  boolean extraer(double monto) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			return true;
		}
		return false;
	}
	
	public  boolean transferirACuenta(double monto,Cuenta cuentaDestino) {
		if (this.puedeExtraer(monto)) {
			this.extraerSinControlar(monto);
			cuentaDestino.depositar(monto);
			return true;
		}
		return false;
	}
	
	public boolean puedeExtraer(double monto) {
		if (this.getSaldo()>=monto) {
			return true;
		}
		return false;
	}
}
