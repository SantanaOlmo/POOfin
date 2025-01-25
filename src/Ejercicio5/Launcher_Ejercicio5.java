package Ejercicio5;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Launcher_Ejercicio5 {
   public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      boolean on = true;
      String respuesta = "";
      String nombre = "";
      double sueldo = 0.0D;
      Empleado nuevoEmpleado = new Empleado(nombre, sueldo);
      HashMap<String, Double> Salarios = new HashMap();
      System.out.println("Pulse:");
      System.out.println("1, para insertar nombre y sueldo de empleado.");
      System.out.println("2, para ver información de un empleado.");
      System.out.println("3, para recordar las instrucciones");
      System.out.println("4, para cerrar el programa");

      while(on) {
         try {
            int recorrerswitch = leer.nextInt();
            switch(recorrerswitch) {
            case 1:
               System.out.println("Ha seleccionado 1: Insertar nombre y sueldo.");
               System.out.println("Inserte el nombre del empleado:");
               nombre = leer.next();
               System.out.println("Inserte el sueldo:");
               sueldo = Double.parseDouble(leer.next());
               Salarios.put(nombre, sueldo);
               nuevoEmpleado.setSueldo(sueldo);
               nuevoEmpleado.setNombre(nombre);
               break;
            case 2:
               System.out.println("Ha seleccionado 2: Ver información de un empleado");
               System.out.println("¿De quién desea ver la información?");
               nombre = leer.next();
               System.out.println(Salarios.get(nombre));
               break;
            case 3:
               System.out.println("Ha seleccionado 3: Recordar las instruccciones");
               System.out.println("");
               System.out.println("Pulse:");
               System.out.println("1, para insertar nombre y sueldo de empleado.");
               System.out.println("2, para ver información de un empleado.");
               System.out.println("3, para recordar las instrucciones");
               System.out.println("4, para cerrar el programa");
               System.out.println("");
               break;
            case 4:
               System.out.println("Ha seleccionado 4: finalizar el programa.");
               System.out.println("Gracias, hasta otra!");
               on = false;
               break;
            default:
               System.out.println("Error, introduzca una de las opciones");
            }
         } catch (InputMismatchException var11) {
            System.out.println("Introduzca lo que se le ha requerido");
            leer.next();
         }
      }

   }
}
