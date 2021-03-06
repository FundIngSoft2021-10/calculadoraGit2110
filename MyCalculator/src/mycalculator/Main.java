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
        
        //Created by Diego Fernando Sanchez Leyton - DFSL
        pruebasCalculadoraDFSL();

        //Created by Cristian Javier Da Camara Sousa - CJDCS
        calculadoraCJDCS();

        //Created by Abrahan Ignacio Ayala Acu�a - AIAA
        calculadoraAIAA();

        //Created by Kevin Andres Garzon Ospina - KAGO
        calculadoraKAGO();
        
        //Created by Kenneth Leonel Triana - KDLT
        calculadoraKDLT();

        //Created by Nelson Alejandro Mosquera Barrera - NAMB
        calculadoraNAMB();

        //Created by Carlos Andres Erazo Garzon - CAEG
        calculadoraCAEG();
        
        //Created by Camilo Andres Garcia Silva - CAGS
        calculadoraCAGS();
        
        //Created by David Andres Ramirez Monroy - DARM
        calculadoraDARM();

        //Created by David Alejandro Castillo Chiquiza - DACC
        calculadoraDACC();
      
        //Creado por felipe b
        calculadoraAFBB();

      //Created by Cristian Camilo Contreras Borja - CCCB
        calculadoraCCCB();

        //Created by Diego Alejandro Cardozo Rojas - DACR
        CalculadoraDACR();

        //Creted by Fabio Alejandro Camargo Díaz
        CalculadoraFACD();

        //Created by Paula Juliana Rojas Naranjo -PJRN
        CalculadoraPJRN();
        
        //Created by David Santiago Saavedra Riaño - DSSR
        CalculadoraDSSR();
        
        //Created by Loui Gerard Velez Quintero
        CalculadoraLGVQ();
        
        //Created by Nicolas David Gil Hernandez
        calculadoraNDGH();

        //Crated by Andres Felipe Dorado Roncancio
        CalculadoraAFDR();

        //Created by Camilo Andr�s Sandoval Guayambuco - CASG
        CalculadoraCASG();
        
        //Created by William Orlando Rodriguez Buitrago - WORB
        calculadoraWORB();
        
        //Created by Luis Felipe Ariza Ortiz - LFAO
        calculadoraLFAO();

        //Created by Juan Carlos Suarez Motta - JCSM
        calculadoraJCSM(); 

        //Created by Brayan Estiben Giraldo Lopez - BEGL
        CalculadoraBEGL(); 

        //Created by Andres Felipe Girldo Malagon - AFGM
        calculadoraAFGM();
        
        //Created by Fabian Andres Olarte Vargas - FAOV
        CalculadoraFAOV();
        
      //Created by Juan Sebastian Ruiz - JSRB
        CalculadoraJSRB();
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
    public static void calculadoraAFBB()
    {
        CalculadoraAFBB cal = new CalculadoraAFBB();
        double a = 4;
        double b = 20;
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
    
    public static void pruebasCalculadoraDFSL()
    {
        double a = 11;
        double b = 7;
        CalculadoraDFSL calculadora = new CalculadoraDFSL();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
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
        CalculadoraCAEG calculadora = new CalculadoraCAEG();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }
    
    private static void calculadoraKAGO() 
    {
    	double a = 27;
        double b = 95;
        CalculadoraKAGO calculadora = new CalculadoraKAGO();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
		
	}
    
    public static void calculadoraNDGH() {
        double a = 121;
        double b = 11;
        CalculadoraNDGH calculator = new CalculadoraNDGH();

        System.out.println(calculator.about());
        System.out.println(a + " + " + b + " = "+ calculator.add(a, b));
        System.out.println(a + " * " + b + " = "+ calculator.divide(a, b));
        System.out.println(a + " / " + b + " = "+ calculator.multiply(a, b));
        System.out.println(a + " - " + b + " = "+ calculator.substract(a, b));
    }
    
    
    public static void calculadoraCAGS()
    {
        double a = 19;
        double b = 21;
        CalculadoraCAGS calculadora = new CalculadoraCAGS();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }

    public static void calculadoraCCCB()
    {
        double a = 10;
        double b = 2;
        CalculadoraCCCB calculadora = new CalculadoraCCCB();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));
    }
    public static void CalculadoraDACR() {
        double a = 420;
        double b = 69;
        CalculadoraDACR calculadora = new CalculadoraDACR();

        System.out.println(calculadora.about());
        System.out.println(a + "+" + b + "="+ calculadora.add(a, b));
        System.out.println(a + "*" + b + "="+ calculadora.multiply(a, b));
        System.out.println(a + "/" + b + "="+ calculadora.divide(a, b));
        System.out.println(a + "-" + b + "="+ calculadora.substract(a, b));
    }

    public static void CalculadoraFACD(){
        double a = 38;
        double b = 26;
        CalculadoraFACD calc = new CalculadoraFACD();
        System.out.println(calc.about());
        System.out.println(a + " + " + b+ "= " + calc.add(a,b));
        System.out.println(a + " * " + b+ "= " + calc.multiply(a,b));
        System.out.println(a + " - " + b+ "= " + calc.substract(a,b));
        System.out.println(a + " / " + b+ "= " + calc.divide(a,b));
    }

     /**
     * @author Paula Juliana Rojas Naranjo
     */
    
    public static void calculadoraDARM()
    {
        double a = 11;
        double b = 20;
        CalculadoraDARM calculadora = new CalculadoraDARM();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));  
    }
    
    public static void calculadoraDACC(){

        double a = 44;
        double b = 7;
        CalculadoraDACC calculadora = new CalculadoraDACC();

        System.out.println(calculadora.about());
        System.out.println(a + "+" + b + "="+ calculadora.add(a, b));
        System.out.println(a + "-" + b + "="+ calculadora.substract(a, b));
        System.out.println(a + "*" + b + "="+ calculadora.multiply(a, b));
        System.out.println(a + "/" + b + "="+ calculadora.divide(a, b));        
    }
    
    public static void CalculadoraPJRN(){
        double a = 101;
        double b = 14;
        CalculadoraPJRN calcPJRN = new CalculadoraPJRN();

        System.out.println(calcPJRN.about());
        System.out.println(a + " + " + b + "= " + calcPJRN.add(a,b));
        System.out.println(a + " * " + b + "= " + calcPJRN.multiply(a,b));
        System.out.println(a + " - " + b + "= " + calcPJRN.substract(a,b));
        System.out.println(a + " / " + b + "= " + calcPJRN.divide(a,b));
    }
    public static void CalculadoraDSSR(){
        double a = 800;
        double b = 45;
        CalculadoraDSSR Calculadora = new CalculadoraDSSR();

        System.out.println(Calculadora.about());
        System.out.println(a + " + " + b + "= " + Calculadora.add(a,b));
        System.out.println(a + " * " + b + "= " + Calculadora.multiply(a,b));
        System.out.println(a + " - " + b + "= " + Calculadora.substract(a,b));
        System.out.println(a + " / " + b + "= " + Calculadora.divide(a,b));
    }
    public static void CalculadoraLGVQ(){
        double a =544;
        double b = 53;
        CalculadoraLGVQ calLGVQ = new CalculadoraLGVQ();
        System.out.println(calLGVQ.about());
        System.out.println(a + " + " + b + "= " + calLGVQ.add(a,b));
        System.out.println(a + " * " + b + "= " + calLGVQ.multiply(a,b));
        System.out.println(a + " - " + b + "= " + calLGVQ.substract(a,b));
        System.out.println(a + " / " + b + "= " + calLGVQ.divide(a,b));
    }
    /**
     * @author Camilo Andr�s Sandoval Guayambuco - CASG
     */

    public static void CalculadoraCASG()
    {
        CalculadoraCASG calcasg = new CalculadoraCASG();
        double a = 10;
        double b = 26;
        System.out.println(calcasg.about());
        System.out.println(a+"+"+b+"="+calcasg.add(a,b));
        System.out.println(a+"-"+b+"="+calcasg.substract(a,b));
        System.out.println(a+"*"+b+"="+calcasg.multiply(a,b));
        System.out.println(a+"/"+b+"="+calcasg.divide(a,b));

    }
    public static void CalculadoraAFDR(){
        CalculadoraAFDR Calculadora=new CalculadoraAFDR();
        double a=49;
        double b=78;
        System.out.println(Calculadora.about());
        System.out.println(a + " + " + b + "= " + Calculadora.add(a,b));
        System.out.println(a + " * " + b + "= " + Calculadora.multiply(a,b));
        System.out.println(a + " - " + b + "= " + Calculadora.substract(a,b));
        System.out.println(a + " / " + b + "= " + Calculadora.divide(a,b));
    }
    
    public static void calculadoraWORB()
    {
        double a = 14;
        double b = 17;
        CalculadoraWORB calculadora = new CalculadoraWORB();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));  
    }
    
    public static void calculadoraLFAO()
    {
        double a = 65;
        double b = 78;
        CalculadoraLFAO calculadora = new CalculadoraLFAO();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));  
    }

    public static void calculadoraJCSM(){
        double a = 8; 
        double b = 12; 
        CalculadoraJCSM calculadora = new CalculadoraJCSM();

        System.out.println(calculadora.about());
        System.out.println(a + "+" + b + "=" + calculadora.add(a,b));
        System.out.println(a + "-" + b + "=" + calculadora.substract(a,b));
        System.out.println(a + "*" + b + "=" + calculadora.multiply(a,b));
        System.out.println(a + "/" + b + "=" + calculadora.divide(a,b));        
    }

    public static void CalculadoraBEGL(){
        double a = 75; 
        double b = 69; 
        CalculadoraBEGL calculadora = new CalculadoraBEGL();

        System.out.println(calculadora.about());
        System.out.println(a + "+" + b + "=" + calculadora.add(a,b));
        System.out.println(a + "-" + b + "=" + calculadora.substract(a,b));
        System.out.println(a + "*" + b + "=" + calculadora.multiply(a,b));
        System.out.println(a + "/" + b + "=" + calculadora.divide(a,b));        
    }

    public static void calculadoraAFGM()
    {
        double a = 54;
        double b = 1;
        CalculadoraAFGM calculadora = new CalculadoraAFGM();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));  
    }
    
    public static void CalculadoraFAOV()
    {
        double a = 3;
        double b = 7;
        CalculadoraFAOV calculadora = new CalculadoraFAOV();

        System.out.println(calculadora.about());
        System.out.println(a + " + " + b + " = " + calculadora.add(a, b));
        System.out.println(a + " - " + b + " = " + calculadora.substract(a, b));
        System.out.println(a + " * " + b + " = " + calculadora.multiply(a, b));
        System.out.println(a + " / " + b + " = " + calculadora.divide(a, b));  
    }
    
    public static void CalculadoraJSRB() {
        double a = 128;
        double b = 32;
        CalculadoraJSRB calculadora = new CalculadoraJSRB();

        System.out.println(calculadora.about());
        System.out.println(a + "+" + b + "="+ calculadora.add(a, b));
        System.out.println(a + "*" + b + "="+ calculadora.multiply(a, b));
        System.out.println(a + "/" + b + "="+ calculadora.divide(a, b)); 
        System.out.println(a + "-" + b + "="+ calculadora.substract(a, b)); 
    }
}
