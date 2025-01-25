package Ejercicio4;

public class Cuadrado {
   public int lado;

   public Cuadrado(int lado) {
      this.setLado(lado);
   }

   public void setLado(int lado) {
      if (lado <= 0) {
         boolean lado1 = true;
      } else {
         this.lado = lado;
      }

   }

   public void mostrarPerimetro(int lado) {
      int perimetro = lado * 4;
      System.out.println("El perimetro de un cuadrado de lado: " + lado + " es : " + perimetro + " cm.");
   }

   public void mostrarSuperficie(int lado) {
      int superficie = lado * lado;
      System.out.println("La superficie de un cuadrado de lado: " + lado + " es: " + superficie + " cm2.");
   }
}
