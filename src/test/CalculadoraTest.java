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
	public void testDiv() {
		Calculadora c = new Calculadora();
		try {
			assertEquals(c.div(10, 2), 5, DELTA);
		} catch (DivisaoPorZeroException e) {
			fail();
		}
	}

	@Test(expected = DivisaoPorZeroException.class)
	public void testDivZero() throws DivisaoPorZeroException {
		Calculadora c = new Calculadora();
		c.div(10.0, 0);
		//try {
			//c.div(10, 0);
		//} catch (DivisaoPorZeroException e) {
			
	//}
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

