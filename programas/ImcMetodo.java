package programas;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class ImcMetodo {
    public static double calc_imc (double r_altura, double r_peso) {
        double r_IMC = r_peso / (r_altura* r_altura);
        return r_IMC;
    }

    public static void programa_IMC (){
        Scanner entradaDeDato = new Scanner(System.in);
        System.out.print("Peso: ");
        double r_peso = entradaDeDato.nextDouble();
        System.out.print("Altura: ");
        double r_altura = entradaDeDato.nextDouble();

        double r_IMC_2 = calc_imc(r_peso, r_altura);
        System.out.println("IMC: " + r_IMC_2);
        if (r_IMC_2 <= 18.5) {
            System.out.println("Tu peso esta bajo");
        } else if (r_IMC_2 > 18.5 && r_IMC_2 <= 24.9) {
            System.out.println("Tu IMC es normal");
        } else if (r_IMC_2 > 24.9 && r_IMC_2 <= 29.9) {
            System.out.println("Tu IMC es sobrepeso");
        } else if (r_IMC_2 > 29.9 && r_IMC_2 <= 34.9) {
            System.out.println("Tu IMC es de Obesidad 1");
        } else if (r_IMC_2 > 35 && r_IMC_2 <= 39.9) {
            System.out.println("Tu IMC es de Obesidad 2");
        } else if (r_IMC_2 > 39.9 && r_IMC_2 <= 49.9) {
            System.out.println("Tu IMC es de Obesidad 3");
        } else if (r_IMC_2 > 50) {
            System.out.println("Tu IMC es de Obesidad 4");
        }

    }



}
