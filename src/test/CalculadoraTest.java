package test;
import static org.junit.Assert.*;
import main.Calculadora;
import org.junit.Test;
public class CalculadoraTest {
	@Test
	public void testSoma() {
		Calculadora c = new Calculadora();
		assertEquals(c.soma(2, 4), 6);
	}
	@Test
	public void testDiv() {
		Calculadora c = new Calculadora();
		assertEquals(c.div(10, 2), 5);
		c.div(10, 0);
	}
	@Test
	public void testSub() {
		Calculadora c = new Calculadora();
		assertEquals(c.sub(4, 1), 3);
	}
	@Test
	public void testMult() {
		Calculadora c = new Calculadora();
		assertEquals(c.mult(5, 5), 25);
	}
}
