package rockemmaSchool;

public class Cursos {

    private String nombre;
    private String categoria;
    private String periodo;

    public Cursos(String nombre, String categoria, String periodo) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Categoría: " + categoria + ", Periodo: " + periodo;
    }
}
