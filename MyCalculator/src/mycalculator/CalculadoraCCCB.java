package mycalculator;

public class CalculadoraCCCB implements ICalculator{ 

	@Override
	public String about() {
		return "Calculadora generada por "+Authors.CCCB;
	}
@Override
	public double add(double a, double b) {
		
		return a+b;
	}
@Override
public double divide(double a, double b) {
        return a / b;
    }

@Override
public double multiply(double a, double b) {
	
	return a*b;
}
@Override
public double substract(double a, double b) {
	
	return a-b;
}
}

