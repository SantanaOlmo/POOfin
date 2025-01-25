package EjercicioEvaluable2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Empleado {
   Scanner leer;
   Scanner leerSwitch;
   public String NIF;
   public double sueldo_base;
   public double sueldo_bruto;
   public double sueldo_neto;
   public double precio_horasextra;
   public double horas_extra_realizadas;
   public double tipo_IRPF;
   public boolean casado;
   public int hijos;
   public String nombre;

   public Empleado() {
      this.leer = new Scanner(System.in);
      this.leerSwitch = new Scanner(System.in);
      this.setNombre();
      this.setNIF();
      this.setSueldo_base();
      this.setPrecio_horasextra();
      this.setHorasExtraRealizadas();
      this.setSueldoBruto();
      this.setCasado();
      this.setHijos();
      this.setTipo_IRPF();
      this.DevolucionRetencionIRPF();
      this.setSueldo_neto();
   }

   public void queHacer() {
      boolean on = true;
      byte numSwitch = 0;

      while(on) {
         try {
            System.out.println("Inserte el numero correspondiente para ejecutar las acciones. ");
            System.out.println("1. Insertar datos de otro empleado.");
            System.out.println("2. Finalizar el programa.");
            switch(numSwitch) {
            case 1:
               System.out.println("Ha elegido: Insertar datos de otro usuario.");
               this.setNombre();
               this.setNIF();
               this.setSueldo_base();
               this.setPrecio_horasextra();
               this.setHorasExtraRealizadas();
               this.setCasado();
               this.setHijos();
               this.setSueldoBruto();
               this.setTipo_IRPF();
               break;
            case 2:
               System.out.println("Ha elegido: Finalizar el programa.");
               System.out.println("Hasta la próxima\ud83d\udc4b\ud83d\udc4b\ud83d\udc4b ");
               break;
            default:
               System.out.println("Inserte una de las opciones ofrecidas:");
               System.out.println("");
            }
         } catch (InputMismatchException var4) {
            System.out.println("Inserte una de las opciones");
            this.leerSwitch.next();
         }
      }

   }

   public void setNombre() {
      boolean on = true;
      String nombrecito = "";
      System.out.println();

      while(on) {
         try {
            System.out.println("Inserte el nombre del empleado:");
            nombrecito = this.leer.next();
            if (nombrecito == null) {
               this.nombre = "sinNombre_" + this.getNIF();
            } else {
               this.nombre = nombrecito;
            }
         } catch (InputMismatchException var4) {
            System.out.println("Error, inserte un nombre correcto");
            this.leer.next();
         }
      }

   }

   public String getNombre() {
      return this.nombre;
   }

   public void setHorasExtraRealizadas() {
      boolean on = true;
      double horasextra = 0.0D;

      while(on) {
         try {
            System.out.println("¿Cuantas horas extra ha realizado el empleado?");
            horasextra = this.leer.nextDouble();
            if (horasextra < 0.0D) {
               this.horas_extra_realizadas = 0.0D;
               on = false;
            } else {
               this.horas_extra_realizadas = horasextra;
               on = false;
            }
         } catch (InputMismatchException var5) {
            System.out.println("Error, inserte números.");
            this.leer.next();
         }
      }

   }

   public double getHorasExtraRealizadas() {
      return this.horas_extra_realizadas;
   }

   public void setNIF() {
      System.out.println("¿Cuál es el NIF de su empleado?");
      String nif = this.leer.nextLine();
      this.NIF = nif;
   }

   public String getNIF() {
      return this.NIF;
   }

   public void setSueldo_base() {
      boolean on = true;

      while(on) {
         try {
            System.out.println("¿Cual es el sueldo base del empleado?");
            double sueldo_base = this.leer.nextDouble();
            if (sueldo_base < 1134.0D) {
               this.sueldo_base = 1134.0D;
               on = false;
            } else {
               this.sueldo_base = sueldo_base;
               on = false;
            }
         } catch (InputMismatchException var5) {
            System.out.println("Error, inserte únicamente números");
            this.leer.next();
         }
      }

   }

   public double getSueldo_base() {
      return this.sueldo_base;
   }

   public void setPrecio_horasextra() {
      double precio = 0.0D;
      boolean on = true;

      while(on) {
         try {
            System.out.println("¿Cual es el precio de las horas extra de su empleado?");
            precio = this.leer.nextDouble();
            if (this.precio_horasextra < 12.419999999999998D) {
               this.precio_horasextra = 12.419999999999998D;
               on = false;
            } else {
               this.precio_horasextra = precio;
               on = false;
            }
         } catch (InputMismatchException var5) {
            System.out.println("Error, utilice exclusivamente números");
            this.leer.next();
         }
      }

   }

   public double getPrecio_horasextra() {
      return this.precio_horasextra;
   }

   public void setHoras_extra_realizadas(double horas_extra_realizadas) {
      if (horas_extra_realizadas < 0.0D) {
         this.horas_extra_realizadas = 0.0D;
      } else {
         this.horas_extra_realizadas = horas_extra_realizadas;
      }

   }

   public void getHoras_extra_realizadas() {
      System.out.println(this.horas_extra_realizadas);
   }

   public void setTipo_IRPF() {
      if (this.sueldo_base < 1037.0D) {
         this.tipo_IRPF = 0.19D * this.sueldo_base;
      } else if (this.sueldo_base < 1683.0D) {
         this.tipo_IRPF = 0.24D * this.sueldo_base;
      } else if (this.sueldo_base < 2933.0D) {
         this.tipo_IRPF = 0.3D * this.sueldo_base;
      } else if (this.sueldo_base < 4999.0D) {
         this.tipo_IRPF = 0.37D * this.sueldo_base;
      } else if (this.sueldo_base < 24999.0D) {
         this.tipo_IRPF = 0.45D * this.sueldo_base;
      } else if (this.sueldo_base > 24999.0D) {
         this.tipo_IRPF = 0.47D * this.sueldo_base;
      }

      this.sueldo_neto = this.sueldo_bruto - this.tipo_IRPF;
   }

   public double getIRPF() {
      this.setTipo_IRPF();
      return this.tipo_IRPF;
   }

   public void setCasado() {
      boolean on = true;
      String respuesta = "";

      while(on) {
         try {
            System.out.println("¿Está casado?");
            respuesta = this.leer.next();
            respuesta = respuesta.toLowerCase();
            System.out.println(respuesta);
            if (respuesta.equals("si")) {
               this.casado = true;
               on = false;
            } else if (respuesta.equals("no")) {
               this.casado = false;
               on = false;
            } else {
               System.out.println("Conteste con si o no");
            }
         } catch (InputMismatchException var4) {
            System.out.println("Error, conteste con si o no. ");
            this.leer.next();
         }
      }

   }

   public void getCasado() {
      if (this.casado) {
         System.out.println("Está casado");
      } else {
         System.out.println("No está casado");
      }

   }

   public void setHijos() {
      int hijos = 0;
      boolean on = true;

      while(on) {
         try {
            System.out.println("Inserte el número de hijos del trabajador");
            hijos = this.leer.nextInt();
            if (hijos < 0) {
               this.hijos = 0;
               on = false;
            } else {
               this.hijos = hijos;
               on = false;
            }
         } catch (InputMismatchException var4) {
            System.out.println("Error, introduzca únicamente números.");
            this.leer.next();
         }
      }

      this.hijos = hijos;
   }

   public void getHijos() {
      System.out.println();
   }

   public void CalculoHorasExtra(double precio_horasextra, double horas_extra_realizadas) {
      double complemento_horasextra = precio_horasextra * horas_extra_realizadas;
      System.out.println("El complemento percibido por las horas extras realizadas es: " + complemento_horasextra);
   }

   public double getSueldoBruto() {
      this.setSueldoBruto();
      return this.sueldo_bruto;
   }

   public void setSueldoBruto() {
      double complemento = this.getHorasExtraRealizadas() * this.getPrecio_horasextra();
      double sueldobruto = complemento + this.sueldo_base;
      this.sueldo_bruto = sueldobruto;
   }

   public void DevolucionRetencionIRPF() {
      double devolucion = 0.0D;
      if (this.casado) {
         this.setTipo_IRPF();
         devolucion = 0.02D * this.sueldo_bruto;
         this.sueldo_neto += devolucion;
      }

      if (this.hijos > 0) {
         this.setTipo_IRPF();
         this.sueldo_neto += 0.02D * this.sueldo_bruto;
      }

      if (this.casado && this.hijos > 0) {
         System.out.println("Se ha reingresado la siguiente cuantía: " + devolucion);
         System.out.println("Por lo tanto el sueldo neto final es: " + this.sueldo_neto);
      } else {
         System.out.println("No se le devolverá nada, las retenciones se mantienen en: " + this.tipo_IRPF);
      }

   }

   public void setSueldo_neto() {
      this.sueldo_neto = this.sueldo_neto;
   }

   public double getSueldo_neto() {
      return this.sueldo_neto;
   }

   public void getInformacionBasica() {
   }

   public void getInformacionCompleta() {
      System.out.println("Sueldo base: " + this.sueldo_base);
      System.out.println("Complemento horas extra: " + this.precio_horasextra);
      System.out.println("Sueldo bruto: " + this.sueldo_bruto);
      System.out.println("Retención IRPF: " + this.tipo_IRPF);
      System.out.println("Sueldo neto: " + this.sueldo_neto);
   }
}
