package Ejercicio3;

public class Punto1 {
   public int x;
   public int y;

   public Punto1(int x, int y) {
      this.setX(x);
      this.setY(y);
   }

   public void setX(int x) {
      this.x = x;
   }

   public void setY(int y) {
      this.y = y;
   }

   public void mostrarCuadrante(int x, int y) {
      if (x < 0 && y < 0) {
         System.out.println("Cuadrante: 3");
      } else if (x > 0 && y > 0) {
         System.out.println("Cuadrante: 1");
      } else if (x > 0 && y < 0) {
         System.out.println("Cuadrante: 2");
      } else if (x < 0 && y > 0) {
         System.out.println("Cuadrante: 4");
      } else {
         System.out.println("No posicionado sobre ningún cuadrante");
      }

   }
}
