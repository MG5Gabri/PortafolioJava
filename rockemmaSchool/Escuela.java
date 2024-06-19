package rockemmaSchool;

public class Escuela {
    public static void imprimirNombres(){

        Estudiantes estudiante1 = new Estudiantes("Juan", "juanito@scl.edu.gt", "A", 12, true);
        Estudiantes estudiante2 = new Estudiantes("Keneth", "keneth@scl.edu.gt", "B", 14, false);
        Estudiantes estudiante3 = new Estudiantes("Jossue", "jossuesito@scl.edu.gt", "A", 13, true);
        Estudiantes estudiante4 = new Estudiantes("Bryan", "bryansito@scl.edu.gt", "C", 12, true);
        Estudiantes estudiante5 = new Estudiantes("Emilio", "emilito@scl.edu.gt", "C", 14, false);


        Cursos Filosofia = new Cursos("Juan", "Ciencias", "Primero");
        Cursos artes = new Cursos("Keneth", "Arte", "Tercero");
        Cursos matematicas = new Cursos("Jossue", "Números", "Segundo");
        Cursos Sociales = new Cursos("Bryan", "Ciencia", "Segundo");



        //Estudiante 1
        System.out.println(estudiante1 + "\n");

        //Estudiante 2
        System.out.println(estudiante2 + "\n");

        //Estudiante 3
        System.out.println(estudiante3 + "\n");

        //Estudiante 4
        System.out.println(estudiante4 + "\n");

        //Estudiante 5
        System.out.println(estudiante5 + "\n");

        System.out.println(Filosofia);
        System.out.println(artes);
        System.out.println(matematicas);
        System.out.println(Sociales);
    }

}
