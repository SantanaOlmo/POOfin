package EjercicioEvaluable2;
import java.util.*;

public class Menu {
   public Menu() {
      boolean on = true;
      int recorrerSwitch = 0;
      Scanner leer=new Scanner (System.in);
      ArrayList<Empleado> empleados = new ArrayList();
      Empleado nuevoempleado0 = new Empleado();
      empleados.add(nuevoempleado0);

      while(on) {

         try {
            System.out.println("¿Qué desea hacer?");
            System.out.println("1, registrar un nuevo empleado.");
            System.out.println("2, mostrar todos los empleados.");
            System.out.println("3, mostrar toda la información del ultimo empleado.");
           // System.out.println("4, calcular y devolver la cuantía del irpf");
            //EL IRPF SE DEVUELVE AUTOMÁTICAMENTE AL INGRESAR LOS DATOS DE UN USUARIO
            System.out.println("4, Salir del programa.");

            recorrerSwitch=leer.nextInt();
            switch(recorrerSwitch) {
               case 1://registrar un nuevo empleado
                  nuevoempleado0 = new Empleado();
                  empleados.add(nuevoempleado0);
                  break;

               case 2 ://mostrar todos los empleados
                  for (int i=0;i< empleados.size();i++){
                     System.out.println("Empleado "+ (i+1)+ ": " +empleados.get(i));
                  }
                  break;
               case 3 ://mostrar toda la información de un empleado
                  nuevoempleado0.getInformacionCompleta();
                  break;
               /*case 4 ://calculo y devolucion de las retenciones de irpf
                  System.out.println("Se le cobrará "+ nuevoempleado0.getIRPF()+"€ de IRPF");

                  break;*/
               case 4://apagar la máquina
                  System.out.println("Gracias, hasta la próxima 👋");
                  on=false;
                  break;
               default:
                  System.out.println("Inserte una de las opciones ofrecidas");
                  break;
            }
         } catch (InputMismatchException var8) {
            System.out.println("Inserte lo requerido");
            leer.next();
         }
      }

   }
}
