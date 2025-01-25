package Ejercicio6;

import java.util.Random;

public class Contrasena {
   public int longitud;
   public String contrasena;

   public Contrasena(int longitud, String contrasena) {
      this.setContrasena();
      this.setLongitud();
   }

   public Contrasena(int longitud) {
      new Random();
      this.setContrasena();
   }

   public void setContrasena() {
      this.contrasena = this.generarContrasena();
   }

   public void setLongitud() {
      this.longitud = this.longitud;
   }

   public String generarContrasena() {
      new Random(9L);
      return "";
   }

   public boolean esFuerte(String contrasena) {
      int contadorMinusculas = 0;
      int contadorMayusculas = 0;
      int contadorNumeros = 0;
      char[] charray = contrasena.toCharArray();

      /*for(int i = 0; i < charray.length; ++i) {
         if (charray[i].makeConcatWithConstants<invokedynamic>(charray[i]) == "[a-z") {
            ++contadorMinusculas;
         } else if (charray[i].makeConcatWithConstants<invokedynamic>(charray[i]) == "[A-Z]") {
            ++contadorMayusculas;
         } else if (charray[i].makeConcatWithConstants<invokedynamic>(charray[i]) == "\\d+") {
            ++contadorNumeros;
         }
      }*/

      if (contadorMinusculas >= 1 && contadorMayusculas >= 2 && contadorNumeros >= 5) {
         return true;
      } else {
         return false;
      }
   }
}
