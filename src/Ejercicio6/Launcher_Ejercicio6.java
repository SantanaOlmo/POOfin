package Ejercicio6;

import java.util.Random;

public class Launcher_Ejercicio6 {
   public static void main(String[] args) {
      int contador = 0;

      for(Random random = new Random(9L); contador < 20; ++contador) {
         System.out.println(random);
      }

   }
}
