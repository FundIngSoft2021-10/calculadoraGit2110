/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycalculator;

/**
 *
 * @author anmontero
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Create calculator implementation
        System.out.println("Git Calculator!");

        //Created by Juan Pablo Ortiz - JPO
        pruebasCalculadoraJPO();
        
        //Created by Juan Pablo Vera Fuentes - JPVF
        pruebasCalculadoraJPVF();

        //Created by Cristian Javier Da Camara Sousa - CJDCS
        calculadoraCJDCS();

        //Created by Abrahan Ignacio Ayala Acu�a - AIAA
        calculadoraAIAA();
      
        //Created by Kenneth Leonel Triana - KDLT
        calculadoraKDLT();
        
        //Created by Nelson Alejandro Mosquera Barrera - NAMB
        calculadoraNAMB();

        //Created by Carlos Andres Erazo Garzon - CAEG
        calculadoraCAEG();

    }

    /**
     * Función para probar la implementación de la calculadora
     * @author Juan Pablo Ortiz Rubio - JPO
     */
    public static void pruebasCalculadoraJPO()
    {
        double a = 10;
        double b = 0;
        CalculadoraJPO calculadora = new CalculadoraJPO();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }
    /**
     * @author Cristian Javier Da Camara Sousa - CJDCS
     */
    public static void calculadoraCJDCS()
    {
        CalculadoraCJDCS cal = new CalculadoraCJDCS();
        double a = 5;
        double b = 2;
        System.out.println(cal.about());
        System.out.println(a+"+"+b+"="+cal.add(a,b));
        System.out.println(a+"-"+b+"="+cal.substract(a,b));
        System.out.println(a+"*"+b+"="+cal.multiply(a,b));
        System.out.println(a+"/"+b+"="+cal.divide(a,b));
    
    }
    public static void pruebasCalculadoraJPVF()
    {
        double a = 5;
        double b = 20;
        CalculadoraJPVF calculadora = new CalculadoraJPVF();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }

    public static void calculadoraAIAA()
    {
        
        double a = 3;
        double b = 23;
        CalculadoraAIAA Calculadora = new CalculadoraAIAA();
        System.out.println(Calculadora.about());
        System.out.println(a + "+" + b + "=" + Calculadora.add(a,b));
        System.out.println(a + "-" + b + "=" + Calculadora.substract(a,b));
        System.out.println(a + "*" + b + "=" + Calculadora.multiply(a,b));
        System.out.println(a + "/" + b + "=" + Calculadora.divide(a,b));
    
    }

    
    public static void calculadoraKDLT()
    {
    	  double a = 18;
          double b = 9;
          CalulatorKDLT calculadora = new CalulatorKDLT();

          System.out.println(calculadora.about());
          System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
          System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
          System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
          System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }
    public static void calculadoraNAMB()
    {
        double a = 6;
        double b = 6;
        CalculadoraNAMB calculadora = new CalculadoraNAMB();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }

    public static void calculadoraCAEG()
    {
        double a = 40;
        double b = 3;
        calculadoraCAEG calculadora = new calculadoraCAEG();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }
    
}
