package EjercicioEvaluable3;

import java.io.PrintStream;

public class Linea {
    public Punto punto;
    public Punto punto1;

    public Linea() {
        this.setLinea();
    }

    public void setLinea() {
        this.punto = new Punto();
        this.punto1 = new Punto();
    }

    public void getLinea() {
        System.out.println("Posiciones de la linea:");
        PrintStream var10000 = System.out;
        double var10001 = this.punto.getX();
        var10000.println("(" + var10001 + "," + this.punto.getY() + "),(" + this.punto1.getX() + "," + this.punto1.getY() + ")");
    }
}
