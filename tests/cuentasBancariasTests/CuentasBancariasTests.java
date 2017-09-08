package cuentasBancariasTests;

import org.junit.Test;

import cuentasBancarias.Cuenta;
import org.junit.Assert;

import static org.junit.Assert.*;

public class CuentasBancariasTests {

	@Test
	public void test() {
		Cuenta cuentaOrigen = new Cuenta(1, 0);
	}
	
	@Test
	public void queSeObtengaSaldoDeLaCuenta() {
		Cuenta cuentaOrigen = new Cuenta(1, 0);
		Assert.assertEquals(0, cuentaOrigen.obtenerSaldo(), 0.001);
	}
	
	@Test
	public void queSeTransfieraSaldoEntreCuentas() {
		Cuenta cuentaOrigen = new Cuenta(1, 5);
		Cuenta cuentaDestino = new Cuenta(2, 5);
		cuentaOrigen.transferirMontoHacia(5, cuentaDestino);
		Assert.assertEquals(10, cuentaDestino.obtenerSaldo(), 0.001);
	}
	
	@Test
	public void queNoSeTransfieraSaldoSiEsInsuficiente() {
		Cuenta cuentaOrigen = new Cuenta(1, 5);
		Cuenta cuentaDestino = new Cuenta(2, 5);
		Assert.assertFalse(cuentaOrigen.transferirMontoHacia(10, cuentaDestino));
	}
	
	@Test
	public void queNoSeTransfieraSaldoInvalido() {
		Cuenta cuentaOrigen = new Cuenta(1, 5);
		Cuenta cuentaDestino = new Cuenta(2, 5);
		Assert.assertFalse(cuentaOrigen.transferirMontoHacia(-10, cuentaDestino));
	}
	
	@Test
	public void queSeResteSaldoDeCuentaOrigen() {
		Cuenta cuentaOrigen = new Cuenta(1, 5);
		Cuenta cuentaDestino = new Cuenta(2, 5);
		cuentaOrigen.transferirMontoHacia(4.32, cuentaDestino);
		Assert.assertEquals(0.679, cuentaOrigen.obtenerSaldo(), 0.001);
	}

}
