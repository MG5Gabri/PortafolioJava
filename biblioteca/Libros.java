package biblioteca;

public class Libros {

    private String titulo;
    private String autor;
    private String anno;


    public Libros(String titulo, String autor, String anno){
        this.titulo =titulo;
        this.autor = autor;
        this.anno = anno;
    }

    //Metodos Set
    public void setAnno(String anno) {
        this.anno = anno;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Metodos get
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnno() {
        return anno;
    }
    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Fecha: " + anno;
    }
}

