package conversor;

import mis_metodos.ListaOpciones;

import java.util.Scanner;

public class FarenheitACelsius {
    public static void cTemperatua() {
        String[] opciones = {
                "Farenheit/Celcius", "Celcius/Farenheit"
        };

        // Llmar a la clase ListaOpciones y llamar al método cargarOpciones.
        ListaOpciones.cargarOpciones(opciones);

        Scanner opc = new Scanner(System.in);
        System.out.print("[?] ");
        int r_Temperatura = opc.nextInt();

        Scanner tmp = new Scanner(System.in);
        System.out.print("[Temperatura]: ");
        double temperatura = tmp.nextDouble();

        switch (r_Temperatura) {
            case 1:
                System.out.println("Resultado: " + celciusResp(temperatura));
                break;
            case 2:
                System.out.println("Resultado: " + farenheitResp(temperatura));
                break;
        }
    }
    public static double celciusResp (double temperatura) {
        double rCelcius = ((temperatura * 9) /5) + 32;
        return rCelcius;
    }
    public static double farenheitResp (double temperatura) {
        double rFarenheit = (( temperatura - 32) * 5) / 9;
        return rFarenheit;
    }

}
