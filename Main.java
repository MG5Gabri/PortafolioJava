//importar del nombreDelPaquete.NombreClase
import conversor.FarenheitACelsius;
import interfaz_grafica.Cartelito;
import lista.ListaDeCompras;
import mis_metodos.ListaOpciones;
import calculadora.Mate;
import programas.ImcMetodo;
import conversor.Medidas;
import conversor.ConversorDeMonedas;

//importar nombreLibrería.nombreDePaquete.NombreClase
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Farenheit y Celsius", "Calcular edad",
                "Medidas", "Lista",
                "Conversor de Monedas", "Opcion_8",
                "Opción_9", "Salir" };


        boolean programa = true;

        //Ejecuta el contenido de la llave
        do {
            //Nombre de la clase.nombre del método
            Cartelito.mensaje_1();
            //Nombre de la clase.nombre del método
            ListaOpciones.cargarOpciones(listaDeOpciones);

            //Pedir una opción
            Scanner intoOpcion = new Scanner(System.in);
            System.out.print("[?]: ");
            int opcion = intoOpcion.nextInt();
            System.out.println("-------------------");

            //Cargar programa segun la opción del usuario

            switch (opcion) {
                case 1:
                    Mate.opt_matematicas();
                    break;
                case 2:
                    ImcMetodo.programa_IMC();
                    break;
                case 3:
                    FarenheitACelsius.cTemperatua();
                    break;
                case 4:
                    System.out.println("Opción 4 En proceso");
                    break;
                case 5:
                    Medidas.mLongitud();
                    break;
                case 6:
                    ListaDeCompras.programa();
                    break;
                case 7:
                    ConversorDeMonedas.convertirMonedas();
                    break;
                case 8:
                    System.out.println("Opción 8 en proceso");
                    break;
                case 9:
                    System.out.println("Opción 9 en proceso");
                    break;
                case 10:
                    programa = false; // Esta línea para salir del bucle
                    break;
            }
        }while (programa); //Si while es verdadero lo vuelve a ejecutar, solo si es verdadero
    }
}