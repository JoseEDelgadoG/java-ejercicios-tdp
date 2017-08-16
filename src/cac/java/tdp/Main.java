/*
 * Ejercicio 11: Programa que
 * Lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
 * La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
 */
package cac.java.tdp;

import java.util.Scanner;

/**
 *
 * @author Rhaynel Parra Aguiar <mail@rhynl.io>
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner grados = new Scanner (System.in);
      float Centigrados;
      float Fahrenheit;
        System.out.println("Agregar la cantidad en grados");
        Centigrados = grados.nextFloat();
        Fahrenheit = 32  + ( 9 * Centigrados / 5);
        System.out.println(Centigrados + "°C" + "es igual a: " + Fahrenheit + "°F");
        
       
           
    }
    
}
