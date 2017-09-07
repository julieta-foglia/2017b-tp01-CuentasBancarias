package cuentasBancarias;

public class Cuenta {
	int nroCuenta;
	double saldo;

	public Cuenta(int nro, double saldo) {
		this.nroCuenta = nro;
		this.saldo = saldo;
	}

	public double obtenerSaldo() {
		return this.saldo;
	}

	public void transferirMontoHacia(double monto, Cuenta cuenta) {
		
	}

}
