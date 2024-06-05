package matematicas;

import lista_opcs.ListaOpciones;

import java.util.Scanner;

public class Mate {
    public static void opt_matematicas () {

        // CREANDO UNA LISTA
        String[] opciones_mate = {
                "Sumar", "Restar",
                "Restar", "Multiplicar"
        };

        // Llmar a la clase ListaOpciones y llamar al método cargarOpciones.
        ListaOpciones.cargarOpciones(opciones_mate);

        // PREGUNTA QUE OPCIÓN QUIERE
        Scanner opc_mate = new Scanner(System.in);
        System.out.print("Que metodo deseas utilizar: ");
        int r_DeMetodoMatematico = opc_mate.nextInt();

        // SOLICITO DOS NÚMEROS PARA OPERAR
        Scanner numeros = new Scanner(System.in);
        System.out.print("numero 1: ");
        int num_1 = numeros.nextInt();
        System.out.print("numero 2: ");
        int num_2 = numeros.nextInt();

        // EVALUA LA OPCIÓN @r_DeMetodoMatematico Y EJECUTA EL CASO CORRESPONDIENTE
        switch (r_DeMetodoMatematico) {
            case 1:
                System.out.println("Resultado: " + Mate.sumar(num_1, num_2));
                break;
            case 2:
                System.out.println("Resultado: " + Mate.restar(num_1, num_2));
                break;
            case 3:
                System.out.println("Resultado: " + Mate.dividr(num_1, num_2));
                break;
            case 4:
                System.out.println("Resultado: " + Mate.multiplicar(num_1, num_2));
                break;
        }
    }

    // FUNCIÓN: SUMA DOS NÚMEROS ENTEROS, IMPRIME Y RETORNA EL RESULTADO
    public static int sumar(int num_1, int num_2) {
        int r_suma = num_1 + num_2;
        return r_suma;
    }

    // FUNCIÓN: RESTA DOS NÚMEROS ENTEROS, IMPRIME Y RETORNA EL RESULTADO
    public static int restar(int num_1, int num_2) {
        int r_resta = num_1 - num_2;
        return r_resta;
    }

    // FUNCIÓN: DIVIR DOS NÚMEROS ENTEROS, IMPRIME Y RETORNA EL RESULTADO
    public static double dividr(int num_1, int num_2){
        double r_division = num_1 / num_2;
        return r_division;
    }

    // FUNCIÓN: MULTIPLICA DOS NÚMEROS ENTEROS, IMPRIME Y RETORNA EL RESULTADO
    public static int multiplicar(int num_1, int num_2){
        int r_multiplicacion = num_1 * num_2;
        return r_multiplicacion;
    }
}
