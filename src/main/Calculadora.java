package main;
//Calculadoralib
public class Calculadora {
	public Calculadora(){
		//
	}
	public double soma(double a, double b){
		return a + b;
	}

	public final double mult(final double a, final double b) {
		return a * b;
	}

	public final double sub(final double a, final double b) {
		return a - b;
	}

	public final double div(final double a, final double b)
			throws DivisaoPorZeroException {
		if (b != 0) {
			return a / b;
		} else {
			throw new DivisaoPorZeroException();
		}
	}
}
