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
     * Función para probar la implementación de la calculadora
     * @author Juan Pablo Ortiz Rubio - JPO
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
    
     /**
     * Implementación calculadora
     * @author Cristian Javier Da Camara Sousa - CJDCS
     */
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
}
