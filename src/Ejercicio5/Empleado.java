package Ejercicio5;

public class Empleado {
   public String nombre;
   public double sueldo;
   public String sueldoConcretoString;

   public Empleado(String nombre, double sueldo) {
      this.setNombre(nombre);
      this.setSueldo(sueldo);
   }

   public void getNombre(String nombre) {
      System.out.println(nombre);
   }

   public void getSueldo(String nombre) {
      if (nombre.equals(nombre)) {
         this.sueldoConcretoString = ""+this.sueldo;
      }

      System.out.println(this.sueldoConcretoString);
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public void setSueldo(double sueldoConcreto) {
      if (sueldoConcreto < 1134.0D) {
         this.sueldo = 1134.0D;
      } else {
         this.sueldo = sueldoConcreto;
      }

   }

   public void mostarInformacion(String nombre) {
      this.getNombre(nombre);
      this.getSueldo(nombre);
   }
}
