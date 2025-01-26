package EjercicioEvaluable4;
import java.util.*;
import java.util.InputMismatchException;

public class MenuCuentaBancaria {



    public void Menu(){
        boolean on=true;
        int num=0;
        Scanner leer=new Scanner (System.in);
        int idCuenta=0;
        CuentaBancaria nuevaCuenta1=null;
        CuentaBancaria nuevaCuenta2=null;


        while (on) {
            try{
                System.out.println("");
                System.out.println("¿Qué desea hacer?");
                System.out.println("1. Crear una cuenta vacía.");
                System.out.println("2. Crear una cuenta con dni, saldo e interés.");
                System.out.println("3. Ingresar dinero.");
                System.out.println("4. Cobro del interés saldo.");
                System.out.println("5. Retirar dinero.");
                System.out.println("6. Mostrar información.");
                System.out.println("7. Salir.");
                num=leer.nextInt();

                switch (num){
                    case 1: //1. Crear una cuenta vacía.
                        if (nuevaCuenta1==null){
                            nuevaCuenta1= new CuentaBancaria( 0);
                            idCuenta=1;
                            System.out.println("Ha creado una cuenta vacía");
                        }

                        //este constructor inicializa los datos a 0
                        break;


                    case 2: //2. Crear una cuenta con dni, saldo e interés.
                       nuevaCuenta2= new CuentaBancaria();
                       idCuenta=2;

                       //este constructor llama a los set que piden los datos.
                        break;


                    case 3:
                        if(idCuenta==1){
                            nuevaCuenta1.ingresarDinero();
                        } else if (idCuenta==2) {
                            nuevaCuenta2.ingresarDinero();
                        }else{
                            System.out.println("Primero cree una cuenta bancaria");
                        }
                        break;

                    case 4: //actualizar el saldo
                        if(idCuenta==1){
                            nuevaCuenta1.cobrodeInteres();
                        } else if (idCuenta==2) {
                            nuevaCuenta2.cobrodeInteres();
                        }else{
                            System.out.println("Primero cree una cuenta bancaria");
                        }
                        break;


                    case 5://retirar dinero
                        if(idCuenta==1){
                            nuevaCuenta1.retirarDinero();
                        } else if (idCuenta==2) {
                            nuevaCuenta2.retirarDinero();
                        }else{
                            System.out.println("Primero cree una cuenta bancaria");
                        }
                        break;


                    case 6://mostrar información
                        if(idCuenta==1){
                            nuevaCuenta1.showAllInfo();
                        } else if (idCuenta==2) {
                            nuevaCuenta2.showAllInfo();
                        }else{
                            System.out.println("Primero cree una cuenta bancaria");
                        }

                        break;
                    case 7://salir
                        System.out.println("Gracias, hasta pronto!");
                        System.out.println("©️ Alberto Estepa Gómez. All rights reserved.");
                        on=false;
                        break;

                    default:
                        System.out.println("Elija entre las opciones disponibles.");
                        break;

                }
            }catch (InputMismatchException e){
                System.out.println("Error");
                leer.next();
            }

        }
    }

}
