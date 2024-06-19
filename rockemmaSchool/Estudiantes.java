package rockemmaSchool;

public class Estudiantes {

    private String Nombre;
    private String Correo;
    private String Carrera;
    private int Edad;
    private boolean Solvencia;


    public Estudiantes(String nombre, String correo, String carrera, int edad, boolean solvencia) {
        this.Nombre = nombre;
        this.Correo = correo;
        this.Carrera = carrera;
        this.Edad = edad;
        this.Solvencia = solvencia;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getCarrera() {
        return Carrera;
    }

    public int getEdad() {
        return Edad;
    }

    public boolean getSolvencia() {
        return Solvencia;
    }
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + ", Correo: " + getCorreo();
    }
}



