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

}
