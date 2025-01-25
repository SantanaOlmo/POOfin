package Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      boolean on = true;
      System.out.println("Este programa pedirá dos posiciones de un punto y mostrará por pantalla el cuadrante en el que se encuentra");
      System.out.println("si desea finalizar el programa inserte un 0");

      while(on) {
         try {
            System.out.println("");
            System.out.println("Inserte lo siguiente");
            System.out.println("Posición x:");
            int x = leer.nextInt();
            System.out.println("Posición y:");
            int y = leer.nextInt();
            if (x == 0 || y == 0) {
               on = false;
            }

            Punto1 nuevoPunto1 = new Punto1(x, y);
            nuevoPunto1.mostrarCuadrante(x, y);
         } catch (InputMismatchException var6) {
            System.out.println("Error, inserte un número entero");
            leer.next();
         }
      }

      System.out.println("Adiós :) \ud83d\ude4c\ud83d\udc4b");
      leer.close();
   }
}
