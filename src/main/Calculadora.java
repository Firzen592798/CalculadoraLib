package main;

public class Calculadora {
	public Calculadora(){
		//
	}
	public double soma(double a, double b){
		return a + b;
	}
	public double mult(double a, double b){
		return a * b;
	}
	public double sub(double a, double b){
		return a - b;
	}
	public double div(double a, double b) throws DivisaoPorZeroException{
		if(b != 0){
			return a / b;
		}else{
			throw new DivisaoPorZeroException();
		}
	}
}
