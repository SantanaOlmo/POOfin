package Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher_Ejercicio4 {
   public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int lado = 0;
      boolean on = true;
      int recorrerSwitch = 0;
      System.out.println("Este programa le permite mostrar el perímetro y superficie de un cuadrado");
      Cuadrado nuevoCuadrado = new Cuadrado(lado);

      while(on) {
         try {
            System.out.println("Pulse:");
            System.out.println("1, para insertar un lado en cm");
            System.out.println("2, para mostrar el perímetro en cm");
            System.out.println("3, para mostrar la superficie en cm2");
            System.out.println("4, para apagar el programa");
            System.out.println("");
            System.out.println("¿Qué desea hacer?");
            recorrerSwitch = leer.nextInt();
            switch(recorrerSwitch) {
            case 1:
               System.out.println("Ha pulsado 1, inserte un lado:");
               lado = leer.nextInt();
               nuevoCuadrado.setLado(lado);
               break;
            case 2:
               System.out.println("Ha pulsado 2.");
               if (lado <= 0) {
                  System.out.println("Inicialice el cuadrado:");
                  lado = leer.nextInt();
               }

               nuevoCuadrado.setLado(lado);
               nuevoCuadrado.mostrarPerimetro(lado);
               break;
            case 3:
               System.out.println("Ha pulsado 3.");
               if (lado <= 0) {
                  System.out.println("Inicialice el cuadrado:");
                  lado = leer.nextInt();
               }

               nuevoCuadrado.setLado(lado);
               nuevoCuadrado.mostrarSuperficie(lado);
               break;
            case 4:
               System.out.println("Muchas gracias, hasta la próxima");
               on = false;
               break;
            default:
               System.out.println("Inserte una de las opciones");
            }
         } catch (InputMismatchException var7) {
            System.out.println("Error, inserte un número entero");
            leer.next();
         }
      }

      leer.close();
   }
}
