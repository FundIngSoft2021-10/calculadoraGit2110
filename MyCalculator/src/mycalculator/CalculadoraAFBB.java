package mycalculator;



public class CalculadoraAFBB implements ICalculator{
	@Override
	public String about() {
		return "Calculadora generada por "+Authors.AFBB;
	}
@Override
	public double add(double a, double b) {
		
		return a+b;
	}
@Override
public double divide(double a, double b) {
	try {
        return a / b;
    } catch (Exception e) {
        return 0;
    }

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
