package test;
import static org.junit.Assert.*;
import main.Calculadora;
import main.DivisaoPorZeroException;

import org.junit.Test;
public class CalculadoraTest {
	private static final double DELTA = 1e-7;
	@Test
	public void testSoma() {
		Calculadora c = new Calculadora();
		assertEquals(c.soma(2, 4), 6, DELTA);
	}
	

	@Test
	public void testSub() {
		Calculadora c = new Calculadora();
		assertEquals(c.sub(4, 1), 3, DELTA);
	}
	@Test
	public void testMult() {
		Calculadora c = new Calculadora();
		assertEquals(c.mult(5, 5), 25, DELTA);
	}
}

