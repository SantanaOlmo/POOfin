package EjercicioEvaluable4;
import java.util.*;
public class CuentaBancaria {

    Scanner leer=new Scanner(System.in);
    public int dni;
    public long numeroDeCuenta;
    public double saldoActual;
    public double interesAnual;


//-------------CONSTRUCTORES---------------------------------------------------
    //constructor por defecto
    public CuentaBancaria(int cero){
        this.dni=0;
        this.saldoActual=0.0;
        this.interesAnual=0;
        this.numeroDeCuenta=0;

    }

    //constructor con dni, saldo e interes
    public CuentaBancaria(){
        setDni();
        ingresarDinero();
        setInteresAnual();
        setNumeroDeCuenta();
    }

//---------------METODOS----------------------------------------------------

    public String getDni() {
        return  ""+dni+getLetraDNI();
    }

    public void setDni() {
        int dnidni=0;

        boolean on=true;
        while (on){
            try{

                System.out.println("Introduzca su dni, sin letra");
                System.out.println("Recuerde, son 8 dígitos numéricos");
                dnidni=leer.nextInt();

                System.out.println("Ha introducido: "+ dnidni);
                if(Integer.toString(dnidni).length()==8 ){
                    this.dni=dnidni;//asigno el dni (numeros) depurado.
                    System.out.println("☑️ DNI registrado como: "+ getDni());
                   // System.out.println("tras this.dni=dnidni");
                    on=false;//salgo del set
                    //System.out.println("tras on=false");
                    break;

                }else{
                    System.out.println("Erorr, introduzca 8 dígitos");
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

        int resto=dni%23;
        return letrasDNI[resto];
    }


    public long getNumeroDeCuenta() {
        if (numeroDeCuenta==0){
            setNumeroDeCuenta();
        }
            return numeroDeCuenta;

    }

    public void setNumeroDeCuenta() {

       if (numeroDeCuenta==0){

           Random random =new Random();
           //genero un numero aleatorio de 10 cifras que es el numero de cuenta
           String numAleatorio10Cifras="";
           while (numAleatorio10Cifras.length()<10){

               numAleatorio10Cifras=numAleatorio10Cifras.concat(Integer.toString(random.nextInt(10)));

           }

           this.numeroDeCuenta=Long.parseLong(numAleatorio10Cifras);

       }else{
           System.out.println("Su numero de cuenta es: "+ numeroDeCuenta);
       }



    }

    public double getSaldoActual() {
        if (saldoActual<0.01){
            this.saldoActual=0;
        }
        return saldoActual;
    }

    public void setSaldoActual() {
        double saldo=0;
        boolean on=true;
        while (on){
            try{
                if(this.saldoActual==0.0){
                    System.out.println("¿Qué saldo desea ingresar en su cuenta?");
                    saldo=leer.nextDouble();
                    if(saldo<0){
                        System.out.println("Ha introducido 0");
                    }else if (saldo>0){
                        System.out.println("Ha introducido "+ saldo + "€");
                    }
                }

            }catch (InputMismatchException e){
                System.out.println("Error");
                leer.next();
            }
        }
    }

    public double getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual() {
        boolean on=true;
        while (on){
            try{
                System.out.println("¿Qué tipo de interés tiene su cuenta?");
                int interes=leer.nextInt();
                System.out.println("");
                System.out.println("Ha introducido: "+ interes+ "%");
                System.out.println("");
                while (interes<=0 || interes>100) {
                    System.out.println("Recuerde, el interés es un porcentaje");
                    System.out.println("Inserte un numero del 1 al 100");
                    interes=leer.nextInt();
                    System.out.println("");
                    System.out.println("Ha introducido: "+ interes+ "%");
                }
                    this.interesAnual=interes;

                on=false;

            }catch (InputMismatchException e){
                System.out.println("Error");
                leer.next();
            }

        }
    }



    //actualiza aplicando el interés diario
    public void cobrodeInteres(){

        double interesDiario=interesAnual/365;
        if (""+saldoActual == null) {
            setSaldoActual();//si no hay saldo, primero se añade

        }else if(""+interesAnual==null){
           setSaldoActual();
        }

        this.saldoActual=saldoActual-(saldoActual*interesDiario);


    }

    public void ingresarDinero (){
        boolean on=true;
        double dinero=0;

        while (on){
            try{
                System.out.println("¿Qué cantidad desea ingresar en su cuenta?");
                dinero=leer.nextDouble();
                if (dinero<0){//si no quiere ingresar dinero que ponga 0
                    do{
                        System.out.println("Ingrese una cantidad positiva");
                        dinero=leer.nextDouble();
                    }while (dinero<0);
                }
                this.saldoActual=saldoActual+dinero;//sumo el dinero al saldo
                on=false;
            }catch(InputMismatchException e){
                System.out.println("Error, inserte únicamente números");
                leer.next();
            }
        }
    }

    public void retirarDinero(){
        boolean on=true;
        double dinero=0;

        while (on){
            try{
                System.out.println("¿Qué cantidad desea retirar?");
                dinero=leer.nextDouble();
                if (dinero<0){//si no quiere retirar dinero que ingrese 0
                    do{
                        System.out.println("🔄️Ingrese una cantidad positiva");
                        dinero=leer.nextDouble();
                    }while (dinero<0);
                    this.saldoActual=saldoActual-dinero;

                } else if (dinero>saldoActual) {//sacar mas dinero del que se tiene

                    System.out.println("Solo podemos ofrecerte lo que tienes en tu cuenta, "+ saldoActual +"€. ");
                    this.saldoActual=0.0; //te quedaste sin dinero
                }
               //resto el dinero al saldo
                on=false;
            }catch(InputMismatchException e){
                System.out.println("Error, inserte únicamente números");
            }
        }
    }

    public void showAllInfo(){
        System.out.println("DNI: "+ getDni());
        System.out.println("Numero de Cuenta: "+ getNumeroDeCuenta());
        System.out.println("Saldo actual: "+ getSaldoActual() +"€");
        System.out.println("Interés anual: "+ getInteresAnual()+"%");
    }
}
