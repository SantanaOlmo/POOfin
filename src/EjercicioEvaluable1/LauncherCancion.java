package EjercicioEvaluable1;
/*
1.Desarrolla una clase Cancion con los siguientes atributos:
titulo: variable String.
autor: variable String.
Cancion (String, String): constructor que recibe título y autor de la canción.
Cancion (): constructor predeterminado que inicializa el título y autor a cadenas vacías.
dameTitulo(): devuelve el título de la canción.
dameAutor(): devuelve el autor de la canción.
ponTitulo(String): establece el título de la canción.
ponAutor(String): establece el autor de la canción.
 */
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

