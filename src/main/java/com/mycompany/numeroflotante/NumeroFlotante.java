
package com.mycompany.numeroflotante;
import java.util.Scanner;

public class NumeroFlotante {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         System.out.println("Hello World! Clase 2 curso Java ! ");
        
       
        // EJERCICIO EN CLASE !
        // variables y scanner !!!
        float total;
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el capital del prestamo");
        float capital = input.nextFloat();
        System.out.println("ingrese el monto de intereses por mes");
        float intereses = input.nextFloat();
        System.out.println("ingrese los meses del prestamo");
        float meses = input.nextFloat();
        
        total = capital + (intereses * meses);
        System.out.println(total);
        
        // EJERCICIO PLATAFORMA CODERHOUSE !
        // Ejercicio 2 - separar numero de enteros y decimales !!!
        
        System.out.println("ingrese el numero a separar");
        float num = input.nextFloat();
        
        float decimal = num % 1;
        System.out.println("el numero decimal es" + decimal);
        float entero = (num - decimal);
        System.out.println("el numero entero es " + entero);

        System.out.println("Clase 2 - Java - Coderhouse");
        System.out.println("Trabajo realizado por Agustin Vilariño !!");
    }
}
