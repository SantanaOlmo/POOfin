package Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
   public static void main(String[] args) {
      Triangulo nuevotriangulo = new Triangulo(1, 2, 3);
      Scanner leer = new Scanner(System.in);
      System.out.println("Inserte tres lados de un triángulo");
      System.out.println("Si quieres finalizar el programa inserta numeros negativos o letras");
      boolean encendido = true;

      while(encendido) {
         try {
            System.out.println("lado1:");
            int lado1 = leer.nextInt();
            System.out.println("lado2:");
            int lado2 = leer.nextInt();
            System.out.println("lado3:");
            int lado3 = leer.nextInt();
            if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0) {
               encendido = false;
            }

            nuevotriangulo.mostrarInformacion(lado1, lado2, lado3);
            nuevotriangulo.esEquilatero(lado1, lado2, lado3);
         } catch (InputMismatchException var8) {
            encendido = false;
         }
      }

      System.out.println("Adiós :)");
   }
}
