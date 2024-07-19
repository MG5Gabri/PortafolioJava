//importar del nombreDelPaquete.NombreClase
import biblioteca.BibliotecaGabri;
import conversor.FarenheitACelsius;
import interfaz_grafica.Cartelito;
import lista.ListaDeCompras;
import mis_metodos.ListaOpciones;
import calculadora.Mate;
import mis_metodos.MisMetodos;
import programas.ImcMetodo;
import conversor.Medidas;
import conversor.ConversorDeMonedas;
import rockemmaSchool.Escuela;

import javax.swing.*;
import java.awt.*;

//importar nombreLibrería.nombreDePaquete.NombreClase
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] listaDeOpciones = {
                "Calculadora", "IMC",
                "Farenheit y Celsius", "Calcular edad",
                "Medidas", "Lista",
                "Conversor de Monedas", "Opcion_8",
                "RokemmaSchool", "Salir" };


        JFrame miventana = new JFrame();
        miventana.setBounds(0,0,400,630);
        miventana.setTitle("Mi Aplicación");
        miventana.setLayout(null);

        JPanel banner = new JPanel();
        banner.setBounds(0, 0, 400, 100); // Ajustar el tamaño del banner
        banner.setLayout(null);
        banner.setBackground(Color.orange);


        JLabel titulo = new JLabel("GABRIEL");
        titulo.setFont(new Font("Serif", Font.CENTER_BASELINE, 52));
        titulo.setBounds(70,0,300,90);
        banner.add(titulo);

        JPanel options = new JPanel();
        options.setBounds(0, 100, 400, 400);
        options.setLayout(null);


        JLabel opciones = new JLabel("[1]----------------");
        opciones.setBounds(50, 50, 90, 50); // Ajustar las coordenadas y el tamaño según sea necesario
        options.add(opciones);


        /*
        JTextField t1 = new JTextField();
        t1.setBounds(100, 150, 50, 20); // Ajustar las coordenadas y el tamaño según sea necesario
        miventana.add(t1)
         */

        JLabel opcion2 = new JLabel("[2]----------------");
        opcion2.setBounds(250, 50, 90, 50); // Ajustar las coordenadas y el tamaño según sea necesario
        options.add(opcion2);

        JLabel opcion3 = new JLabel("[3]----------------");
        opcion3.setBounds(50, 150, 90, 50); // Ajustar las coordenadas y el tamaño según sea necesario
        options.add(opcion3);

        JLabel opcion4 = new JLabel("[4]----------------");
        opcion4.setBounds(250, 150, 90, 50); // Ajustar las coordenadas y el tamaño según sea necesario
        options.add(opcion4);

        JLabel opcion5 = new JLabel("[5]----------------");
        opcion5.setBounds(50, 250, 90, 50); // Ajustar las coordenadas y el tamaño según sea necesario
        options.add(opcion5);

        JLabel opcion6 = new JLabel("[6]----------------");
        opcion6.setBounds(250, 250, 90, 50); // Ajustar las coordenadas y el tamaño según sea necesario
        options.add(opcion6);

        JPanel salida = new JPanel();
        salida.setBounds(0, 500, 400, 100);
        salida.setLayout(null);


        JButton botonSalir = new JButton("Salir");
        botonSalir.setBounds(250,35,80,30);
        salida.add(botonSalir);



        miventana.add(banner);
        miventana.add(options);
        miventana.add(salida);
        miventana.setVisible(true);


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
            MisMetodos.imprimirLinea();

            //Cargar programa segun la opción del usuario

            switch (opcion) {
                case 1:
                    Mate.opt_matematicas();
                    MisMetodos.imprimirLinea();
                    break;
                case 2:
                    ImcMetodo.programa_IMC();
                    MisMetodos.imprimirLinea();
                    break;
                case 3:
                    FarenheitACelsius.cTemperatua();
                    MisMetodos.imprimirLinea();
                    break;
                case 4:
                    System.out.println("Opción 4 En proceso");
                    break;
                case 5:
                    Medidas.mLongitud();
                    MisMetodos.imprimirLinea();
                    break;
                case 6:
                    ListaDeCompras.programa();
                    MisMetodos.imprimirLinea();
                    break;
                case 7:
                    ConversorDeMonedas.convertirMonedas();
                    MisMetodos.imprimirLinea();
                    break;
                case 8:
                    BibliotecaGabri.contructor();
                    break;
                case 9:
                    Escuela.imprimirNombres();
                    break;
                case 10:
                    MisMetodos.limpiarConsola();
                    programa = false; // Esta línea para salir del bucle
                    break;
            }
        }while (programa); //Si while es verdadero lo vuelve a ejecutar, solo si es verdadero
    }
}