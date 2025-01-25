package Ejercicio1;

public class Persona {
   public String nombre;
   public int edad;

   public Persona(String nombre, int edad) {
      this.edad = edad;
      this.nombre = nombre;
   }

   public int getEdad() {
      return this.edad;
   }

   public void setEdad(int nuevaEdad) {
      this.edad = nuevaEdad;
   }

   public void mostrarInformacion() {
      System.out.println("Nombre: " + this.nombre);
      System.out.println("Edad: " + this.edad);
      if (this.edad >= 18) {
         System.out.println("Es mayor de edad");
      } else {
         System.out.println("No es mayor de edad");
      }

   }
}
