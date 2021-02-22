package mycalculator;

public class CalculadoraAFDR implements ICalculator{

    @Override
    public String about() {
        return "Calculadora generada por "+Authors.AFDR;
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
