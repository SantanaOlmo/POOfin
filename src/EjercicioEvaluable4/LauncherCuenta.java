package EjercicioEvaluable4;
/*4. Crea una clase Cuenta (bancaria) con atributos para el número de cuenta
(un entero largo), el DNI del cliente (otro entero largo), el saldo actual y el interés anual
que se aplica a la cuenta (porcentaje). Define en la clase los siguientes métodos:

Constructor por defecto y constructor con DNI, saldo e interés
actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés diario
 (interés anual dividido entre 365 aplicado al saldo actual).
ingresar(double): permitirá ingresar una cantidad en la cuenta.
retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
Metodo que nos permita mostrar todos los datos de la cuenta.*/

public class LauncherCuenta {
    public static void main(String[] args) {
        MenuCuentaBancaria menu=new MenuCuentaBancaria();
        menu.Menu();
    }

}
