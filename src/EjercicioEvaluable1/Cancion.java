package EjercicioEvaluable1;

public class Cancion {
   public String titulo;
   public String autor;

   public Cancion(String titulo, String autor) {
      this.setAutor(autor);
      this.setTitulo(titulo);
   }

   public Cancion() {
      this.setAutor("");
      this.setTitulo("");
   }

   public void getTitulo() {

      System.out.println("El título de la canción es: " + this.titulo);
   }

   public void getAutor() {

      System.out.println("El Autor de la canción es: " + this.autor);
   }

   public void setTitulo(String titulo) {

      this.titulo = titulo;
   }

   public void setAutor(String autor) {

      this.autor = autor;
   }
}
