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
    
}
