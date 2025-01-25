package Ejercicio2;

public class Triangulo {
   public int lado1;
   public int lado2;
   public int lado3;

   public Triangulo(int lado1, int lado2, int lado3) {
      this.lado1 = lado1;
      this.lado2 = lado2;
      this.lado3 = lado3;
   }

   public void setLado(int lado1, int lado2, int lado3) {
      this.lado1 = lado1;
      this.lado2 = lado2;
      this.lado3 = lado3;
   }

   public void mostrarInformacion(int lado1, int lado2, int lado3) {
      System.out.println("lado1: " + lado1 + "cm");
      System.out.println("lado2: " + lado2 + "cm");
      System.out.println("lado3: " + lado3 + "cm");
   }

   public void esEquilatero(int lado1, int lado2, int lado3) {
      if (lado1 == lado2 && lado2 == lado3) {
         System.out.println("Es equilatero");
      } else {
         System.out.println("No es equilatero");
      }

   }
}
