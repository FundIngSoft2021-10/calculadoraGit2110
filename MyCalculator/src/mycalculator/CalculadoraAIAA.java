/**
 * 
 */
package mycalculator;

/**
 * @author lenovo
 *
 */
public  class CalculadoraAIAA implements ICalculator{

	
	@Override
	public String about() {
		// TODO Auto-generated method stub
		return "Calculadora generada por "+Authors.AIAA;
	}
@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}
@Override
public double divide(double a, double b) {
	// TODO Auto-generated method stub
	return a/b;
}
@Override
public double multiply(double a, double b) {
	// TODO Auto-generated method stub
	return a*b;
}
@Override
public double substract(double a, double b) {
	// TODO Auto-generated method stub
	return a-b;
}


	
}
