package mycalculator;

import static java.lang.Double.NaN;

public class CalculadoraNAMB implements ICalculator {

	@Override
	public String about() {
		return "Calculadora generada por: " + Authors.CAEG;
	}

	@Override
	public double add(double a, double b) {
		return a + b;
	}

	@Override
	public double multiply(double a, double b) {
		return a * b;
	}

	@Override
	public double divide(double a, double b) {
		try {
            return a / b;
        } catch (Exception e) {
            return NaN;
        }
	}

	@Override
	public double substract(double a, double b) {
		return a - b;
	}



}
