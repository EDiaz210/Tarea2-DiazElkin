public class Libro {
    String titulo;
    String autor;
    int paginaCount;

    public Libro() {
    }

    public Libro(String titulo, String autor, int paginaCount) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginaCount = paginaCount;
    }

    public void infoLibro(){
        System.out.println("Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + paginaCount);
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Culpa Mia", "Mercedes Ron", 448 );
        Libro libro2 = new Libro("Amigos en Apuros", "Eliécer Cárdenas", 97 );

        libro1.infoLibro();
        libro2.infoLibro();
    }
}
