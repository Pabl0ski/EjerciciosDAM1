package ProgramacionOrientadaAObjetos.ArrayListHashMap_TuEliges.gui;

import ProgramacionOrientadaAObjetos.ArrayListHashMap_TuEliges.modelo.Coche;
import ProgramacionOrientadaAObjetos.ArrayListHashMap_TuEliges.servicios.CocheServicios;
import ProgramacionOrientadaAObjetos.ArrayListHashMap_TuEliges.utils.Constantes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CocheServicios cocheServicios = new CocheServicios();
        Scanner sc = new Scanner(System.in);

        //INstanciciacion de objetos Coches para añadirlos a la estructura de almacenamiento
        Coche coche1 = new Coche("Rojo", "PORSCHE", "911", "POR123", 2);
        Coche coche2 = new Coche("Amarillo", "FERRARI", "488 GTB", "FER456", 2);
        Coche coche3 = new Coche("Negro", "TESLA", "Model S", "TES789", 4);
        Coche coche4 = new Coche("Blanco", "LAMBORGHINI", "Huracán", "LAM101", 2);
        Coche coche5 = new Coche("Gris", "MERCEDES", "Clase C", "MER202", 4);
        Coche coche6 = new Coche("Azul", "BMW", "Serie 3", "BMW303", 4);
        Coche coche7 = new Coche("Plateado", "AUDI", "A4", "AUD404", 4);
        Coche coche8 = new Coche("Negro", "ASTON_MARTIN", "DB11", "AST505", 2);
        Coche coche9 = new Coche("Rojo", "JAGUAR", "F-Type", "JAG606", 2);
        Coche coche10 = new Coche("Azul", "MASERATI", "Ghibli", "MAS707", 4);
        Coche coche11 = new Coche("Blanco", "LEXUS", "ES", "LEX808", 4);
        Coche coche12 = new Coche("Plateado", "BENTLEY", "Continental GT", "BEN909", 2);
        Coche coche13 = new Coche("Negro", "ROLLS_ROYCE", "Phantom", "ROL1010", 4);
        cocheServicios.añadirCoche(coche1);
        cocheServicios.añadirCoche(coche2);
        cocheServicios.añadirCoche(coche3);
        cocheServicios.añadirCoche(coche4);
        cocheServicios.añadirCoche(coche5);
        cocheServicios.añadirCoche(coche6);
        cocheServicios.añadirCoche(coche7);
        cocheServicios.añadirCoche(coche8);
        cocheServicios.añadirCoche(coche9);
        cocheServicios.añadirCoche(coche10);
        cocheServicios.añadirCoche(coche11);
        cocheServicios.añadirCoche(coche12);
        cocheServicios.añadirCoche(coche13);

        int opcion;
        do {
            System.out.println("BIENVENID@ A NUESTRA APLICACION");
            System.out.println("1. Buscar coche por matrícula");
            System.out.println("2. Eliminar coche");
            System.out.println("3. Mostrar todos los coches (ordenados por marca)");
            System.out.println("4. Mostrar todos los coches (ordenados por matrícula)");
            System.out.println("5. Mostrar todos los coches de una marca");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.print("Ingrese la matrícula del coche: ");
                    String matriculaBuscar = sc.nextLine();
                    Coche cocheEncontrado = cocheServicios.buscarCochePorMatricula(matriculaBuscar);
                    if (cocheEncontrado != null) {
                        System.out.println("Coche encontrado: " + cocheEncontrado);
                    } else {
                        System.out.println(Constantes.COCHE_NO_ENCONTRADO);
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la matrícula del coche a eliminar: ");
                    String matriculaEliminar = sc.nextLine();
                    boolean eliminado = cocheServicios.eliminarCoche(matriculaEliminar);
                    if (eliminado) {
                        System.out.println(Constantes.COCHE_ELIMINADO_CORRECTAMENTE);
                    } else {
                        System.out.println(Constantes.ERROR_ELIMINAR_COCHE);
                    }
                    break;
                case 3:
                    System.out.println(Constantes.OBTENIENDO_TODOS_LOS_COCHES);
                    imprimirCoches(cocheServicios.obtenerTodos(1));
                    break;
                case 4:
                    System.out.println(Constantes.OBTENIENDO_TODOS_LOS_COCHES);
                    imprimirCoches(cocheServicios.obtenerTodos(2));
                    break;
                case 5:
                    System.out.print("Ingrese la marca de los coches a mostrar: ");
                    String marcaMostrar = sc.nextLine();
                    imprimirCoches(cocheServicios.obtenerCochesMarca(marcaMostrar));
                    break;
                case 6:
                    System.out.println(Constantes.GRACIAS_POR_UTILIZAR_LA_APLICACION);
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }while (opcion !=6);
    }

    private static void imprimirCoches(java.util.List<Coche> coches) {
        for (Coche coche : coches) {
            System.out.println(coche);
        }
    }
}
