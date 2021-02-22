package mycalculator;
import static java.lang.Double.NaN;

public class CalculadoraJCSM implements ICalculator{
    @Override
    public double add(double a, double b){
        return a+b; 
    }

    @Override
    public double multiply(double a, double b){
        return a*b; 
    }

    @Override
    public double divide(double a, double b){
        if(b != 0){
            return a/b; 
        }
        else{
            return NaN; 
        }
    }

    @Override
    public double substract(double a, double b){
        return a-b; 
    }

    @Override
    public String about(){
        return "Calculadora implementada por: " + Authors.JCSM; 
    }
}
