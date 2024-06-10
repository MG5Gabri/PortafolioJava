package lista;

import lista_opcs.ListaOpciones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaDeCompras {

    public static String[] opcionesLista = {"Lista de compras", "Salir"};

        public static void programa() {
            ListaOpciones.cargarOpciones(opcionesLista);
            Scanner opcion = new Scanner(System.in);
            System.out.print("[?]: ");
            int respuesta = opcion.nextInt();

            switch (respuesta) {
                case 1:
                    crearLista();
                    break;
                case 2:
                    System.out.println("Salir");
                    break;
            }
        }
    public static void crearLista(){
            //Crear una lista vacía
        List<String> listaNombre = new ArrayList<>();
        List<Double> listaPrecio = new ArrayList<>();


        //Pedir un producto y su precio
        String rP;
        double rPc;

        for (int i = 1; i <=3; i++) {
            Scanner item = new Scanner(System.in);
            System.out.print("Producto: ");
            rP = item.nextLine();
            System.out.print("Precio: ");
            rPc = item.nextDouble();

            //agregar a la lista vacia
            listaNombre.add(rP);
            listaPrecio.add(rPc);
        }
        for (int l = 1; l <=3; l++) {
            System.out.println("Productos: " + listaNombre + "-->" + listaPrecio);
        }

    }

}
