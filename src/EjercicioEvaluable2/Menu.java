package EjercicioEvaluable2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
   public Menu() {
      boolean on = true;
      int recorrerSwitch = 0;
      new Scanner(System.in);
      ArrayList<Empleado> empleados = new ArrayList();
      Empleado nuevoempleado0 = new Empleado();
      empleados.add(nuevoempleado0);

      while(on) {
         boolean var6 = false;

         try {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1, registrar un nuevo empleado.");
            System.out.println("2, mostrar todos los empleados.");
            System.out.println("3, mostrar toda la información de un empleado.");
            switch(recorrerSwitch) {
            case 1:
               nuevoempleado0 = new Empleado();
               empleados.add(nuevoempleado0);
            }
         } catch (InputMismatchException var8) {
            System.out.println("Inserte lo requerido");
         }
      }

   }
}
