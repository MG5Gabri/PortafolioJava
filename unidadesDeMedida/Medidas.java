package unidadesDeMedida;

import lista_opcs.ListaOpciones;

import java.util.Scanner;

public class Medidas {
    public static void mLongitud() {
        String[] opciones = {
                "Metros a cm", "Cm a metros",
                "Km a metros", "Metros a km",
                "mm a cm", "cm a mm"
        };

        // Llmar a la clase ListaOpciones y llamar al método cargarOpciones.
        ListaOpciones.cargarOpciones(opciones);

        Scanner opc_med = new Scanner(System.in);
        System.out.print("Que quieres convertir: ");
        int r_DeMedida = opc_med.nextInt();

        Scanner medida = new Scanner(System.in);
        System.out.print("Escribe la medidad: ");
        double r_Medida = medida.nextDouble();

        switch (r_DeMedida) {
            case 1:
                System.out.println(metrosACm(r_Medida));
                break;
            case 2:
                System.out.println(cmAm(r_Medida));
                break;
            case 3:
                System.out.println(kmAmetros(r_Medida));
                break;
            case 4:
                System.out.println(metrosAkm(r_Medida));
                break;
            case 5:
                System.out.println(mmAcentimetros(r_Medida));
                break;
            case 6:
                System.out.println(centimetrosAMm(r_Medida));
                break;
        }

    }

    public static double metrosACm (double r_Medida) {
        Double mACm = r_Medida * 100;
        return mACm;
    }
    public static double cmAm (double r_Medida) {
        Double cmAM = r_Medida / 100;
        return cmAM;
    }
    public static double kmAmetros (double r_Medida) {
        Double kmAM = r_Medida * 1000;
        return kmAM;
    }
    public static double metrosAkm (double r_Medida) {
        Double mAkm = r_Medida / 1000;
        return mAkm;
    }
    public static double mmAcentimetros (double r_Medida) {
        Double mmACm = r_Medida / 10;
        return mmACm;
    }
    public static double centimetrosAMm (double r_Medida) {
        Double cmAMm = r_Medida * 10;
        return cmAMm;
    }
}