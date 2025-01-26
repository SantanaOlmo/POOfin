package EjercicioEvaluable2;

import java.util.*;

public class Empleado {
   Scanner leer=new Scanner(System.in);
   Scanner leerSwitch=new Scanner(System.in);
   public int NIF;
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
      this.setNombre();
      this.setNIF();
      this.setSueldo_base();//el sueldo base lo introduce el usuario
      this.setPrecio_horasextra();
      this.setHorasExtraRealizadas();
      this.setSueldoBruto();//sueldo bruto=sueldo neto + horas extra
      this.setCasado();//para luego devolver
      this.setHijos();//para luego devolver
      this.setTipo_IRPF();//cobro el irpf aquí
      this.DevolucionRetencionIRPF();//devuelvo si es necesario aquí
      this.setSueldo_neto();//el sueldo final
   }
   @Override
   public String toString() {
      return "Nombre: " + getNombre() + ", NIF: " + getNIF() + ", Sueldo neto: " + getSueldo_neto()+"€";
   }

   public void setNombre() {
      boolean on = true;
      String nombrecito = "";
      System.out.println();

      while(on) {
         try {
            System.out.println("Inserte el nombre del empleado:");
            nombrecito = leer.nextLine();
            if (nombrecito == "") {
               this.nombre = "sinNombre_" + this.getNIF();
            } else {
               this.nombre = nombrecito;
            }
            on=false;
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

   public String getNIF() {
      return  ""+NIF+getLetraDNI();
   }

   public void setNIF() {
      int nifnif=0;

      boolean on=true;
      while (on){
         try{

            System.out.println("Introduzca su dni, sin letra");
            System.out.println("Recuerde, son 8 dígitos numéricos");
            nifnif=leer.nextInt();

            System.out.println("Ha introducido: "+ nifnif);
            if(Integer.toString(nifnif).length()==8 ){
               this.NIF=nifnif;//asigno el dni (numeros) depurado.
               System.out.println("☑️ DNI registrado como: "+ getNIF());
               // System.out.println("tras this.dni=dnidni");
               on=false;//salgo del set
               //System.out.println("tras on=false");
               break;

            }else{
               System.out.println("Error, introduzca 8 dígitos");
            }


         }catch (InputMismatchException e){
            System.out.println("Error, no introduzca letras");
            leer.next();
         }
      }
   }


   public char getLetraDNI(){
      char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D',
              'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L',
              'C', 'K', 'E'};

      int resto=NIF%23;
      return letrasDNI[resto];
   }


   public void setSueldo_base() {
      boolean on = true;

      while(on) {
         try {
            System.out.println("¿Cual es el sueldo base del empleado?");
            double sueldo_base = this.leer.nextDouble();
            if (sueldo_base < 1134) {
               System.out.println("Ha introducido "+sueldo_base + "€");
               System.out.println("se le asignará el sueldo mínimo profesional");
               this.sueldo_base = 1134;
               on = false;
            } else {
               System.out.println("Ha introducido "+ sueldo_base+ "€");
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
            if (this.precio_horasextra < 12.5) {
               System.out.println("Ha introducido "+ precio+ " €");
               System.out.println("Se asignará el sueldo mínimo interprofesional, 12.5€/hora");
               this.precio_horasextra = 12.5;
               on = false;
            } else {
               this.precio_horasextra = precio;
               System.out.println("Ha introducido "+ precio+ " €");
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
      if (horas_extra_realizadas < 0) {

         this.horas_extra_realizadas = 0;
      } else {
         this.horas_extra_realizadas = horas_extra_realizadas;
      }

   }

   public void getHoras_extra_realizadas() {
      System.out.println(this.horas_extra_realizadas);
   }

   public void setTipo_IRPF() {
      if (this.sueldo_base < 1037.) {
         this.tipo_IRPF = 0.19 * this.sueldo_base;
      } else if (this.sueldo_base < 1683) {
         this.tipo_IRPF = 0.24 * this.sueldo_base;
      } else if (this.sueldo_base < 2933) {
         this.tipo_IRPF = 0.3 * this.sueldo_base;
      } else if (this.sueldo_base < 4999) {
         this.tipo_IRPF = 0.37 * this.sueldo_base;
      } else if (this.sueldo_base < 24999) {
         this.tipo_IRPF = 0.45 * this.sueldo_base;
      } else if (this.sueldo_base > 24999) {
         this.tipo_IRPF = 0.47 * this.sueldo_base;
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
            respuesta = leer.nextLine();
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
         System.out.println("Se ha reingresado la siguiente cuantía: " + devolucion + "€ de IRPF por hijos y/o matrimonio");
         System.out.println("Por lo tanto el sueldo neto final es: " + this.sueldo_neto+ "€");
      } else {
         System.out.println("No se le devolverá nada por hijos o matrimonio, las retenciones se mantienen en: " + this.tipo_IRPF + " €");
      }

   }

   public void setSueldo_neto() {

      this.sueldo_neto = this.sueldo_neto;
   }

   public double getSueldo_neto()
   {
      return this.sueldo_neto;
   }

   public void getInformacionBasica() {
      getNIF();
   }

   public void getInformacionCompleta() {
      System.out.println("Sueldo base: " + getSueldo_base()+"€");
      System.out.println("Complemento horas extra: " + getPrecio_horasextra()+"€");
      System.out.println("Sueldo bruto: " + getSueldoBruto()+"€");
      System.out.println("Retención IRPF: " + getIRPF()+ "%");
      System.out.println("Sueldo neto: " + getSueldo_neto()+"€");
      System.out.println("Horas extra:"+ getHorasExtraRealizadas() +" horas");
      System.out.println("");
   }
}
