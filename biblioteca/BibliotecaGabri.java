package biblioteca;

public class BibliotecaGabri {
    public static void contructor() {
        System.out.println("Biblioteca Gabriel");

        Libros libro1 = new Libros("Cien años de soledad", "Gabriel García Márquez", "1967");
        Libros libro2 = new Libros("1984", "George Orwell", "1949");
        Libros libro3 = new Libros("Matar a un ruiseñor", "Harper Lee", "1960");
        Libros libro4 = new Libros("El Gran Gatsby", "F. Scott Fitzgerald", "1925");
        Libros libro5 = new Libros("El señor de los anillos", "J.R.R. Tolkien", "1954");
        Libros libro6 = new Libros("Ulises", "James Joyce", "1922");
        Libros libro7 = new Libros("La náusea", "Jean-Paul Sartre", "1938");
        Libros libro8 = new Libros("El guardián entre el centeno", "J.D. Salinger", "1951");
        Libros libro9 = new Libros("La metamorfosis", "Franz Kafka", "1915");
        Libros libro10 = new Libros("En el camino", "Jack Kerouac", "1957");


        //Solo libros
        System.out.println(libro1.getTitulo());
        System.out.println(libro2.getTitulo());
        System.out.println(libro3.getTitulo());
        System.out.println(libro4.getTitulo());
        System.out.println(libro5.getTitulo());
        System.out.println(libro6.getTitulo());
        System.out.println(libro7.getTitulo());
        System.out.println(libro8.getTitulo());
        System.out.println(libro9.getTitulo());
        System.out.println(libro10.getTitulo());

        //Solo autores
        System.out.println(libro1.getAutor());
        System.out.println(libro2.getAutor());
        System.out.println(libro4.getAutor());
        System.out.println(libro5.getAutor());
        System.out.println(libro6.getAutor());
        System.out.println(libro7.getAutor());
        System.out.println(libro8.getAutor());
        System.out.println(libro9.getAutor());
        System.out.println(libro10.getAutor());

        //Solo Fechas
        System.out.println(libro1.getAnno());
        System.out.println(libro2.getAnno());
        System.out.println(libro4.getAnno());
        System.out.println(libro5.getAnno());
        System.out.println(libro6.getAnno());
        System.out.println(libro7.getAnno());
        System.out.println(libro8.getAnno());
        System.out.println(libro9.getAnno());
        System.out.println(libro10.getAnno());

        //Todos los datos
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());
        System.out.println(libro3.toString());
        System.out.println(libro4.toString());
        System.out.println(libro5.toString());
        System.out.println(libro6.toString());
        System.out.println(libro7.toString());
        System.out.println(libro8.toString());
        System.out.println(libro9.toString());
        System.out.println(libro10.toString());

    }
}
