package EjercicioEvaluable1;

public class LauncherCancion {
    public static void main(String[] args) {
        Cancion cancion1=new Cancion ();
        Cancion cancion2=new Cancion ("Imagine", "John Lennon");

        cancion1.getAutor();
        cancion1.getTitulo();
        cancion2.getTitulo();
        cancion2.getAutor();
    }

}

