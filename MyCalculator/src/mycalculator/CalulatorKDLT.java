package mycalculator;

public class CalulatorKDLT implements ICalculator{
	
	@Override
	public String about() {
		// TODO Auto-generated method stub
		return " Calculadora generada por "+ Authors.KDLT;
	}
	
	@Override
	public double divide(double a, double b) {
		// TODO Auto-generated method stub
		
		return a/b;
	}
	
	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
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
