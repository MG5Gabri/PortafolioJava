package conversor;

import mis_metodos.ListaOpciones;

import java.util.Scanner;

public class ConversorDeMonedas {
    public static void convertirMonedas() {
        String [] opcionesConver = {
            "Quetzales a Dolares", "Dolares a Quetzales", "Quetzales a Pesos MX","Pesos Mx a Quetzales"
        };
        ListaOpciones.cargarOpciones(opcionesConver);

        Scanner opc_med = new Scanner(System.in);
        System.out.print("[?]: ");
        int rDeMetodo = opc_med.nextInt();

        Scanner cantidad = new Scanner(System.in);
        System.out.print("Escribe la cantidad: ");
        double rCantidad = cantidad.nextDouble();

        switch (rDeMetodo) {
            case 1:
                System.out.println(QuetzalesADolares(rCantidad));
                break;
            case 2:
                System.out.println(DolaresAQuetzales(rCantidad));
                break;
            case 3:
                System.out.println(QuetzalesAPesosMexicanos(rCantidad));
                break;
            case 4:
                System.out.println(PesosMexicanosAQuetzales(rCantidad));
                break;
        }
    }
    public static double QuetzalesADolares (double rCantidad) {
        Double QAD = rCantidad * 0.13;
        return QAD;
    }
    public static double DolaresAQuetzales (double rCantidad) {
        Double DAQ = rCantidad * 7.76;
        return DAQ;
    }
    public static double QuetzalesAPesosMexicanos (double rCantidad) {
        Double QAPM = rCantidad * 2.39;
        return QAPM;
    }
    public static double PesosMexicanosAQuetzales (double rCantidad) {
        Double PMAQ = rCantidad * 0.42;
        return PMAQ;
    }
}
