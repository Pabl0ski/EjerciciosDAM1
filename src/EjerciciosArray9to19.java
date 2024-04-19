import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class EjerciciosArray9to19 {
    public static void main(String[] args) {
        System.out.println("Titulo");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int opcion;
        final int NUM_EJERCICIOS = 19 + 1; //cantidad de opciones del menu
        final String MENSAJE_DESPEDIDA = "ADIÓS";
        final String MENSAJE_OPCION_ERROR = "Esa opción no existe. Por favor, introduzca una correcta.";

        do {
            System.out.println("Elige ejercicio:");
            mostrarMenu(NUM_EJERCICIOS); //mostramos el menú de opciones

            System.out.print("----- Opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 9 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio9(sc);
                }
                case 10 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio10(sc);
                }
                case 11 -> {
                    System.out.println(mostrarTituloEjercicio(opcion));
                    ejercicio11(sc, r);
                }
                case 12 -> {

                }
                case 13 -> {

                }
                case 14 -> {

                }
                case 15 -> {

                }
                case 16 -> {

                }
                case 17 -> {

                }
                case 18 -> {

                }
                case 19 -> {

                }
                case 0 -> {
                    System.out.println(MENSAJE_DESPEDIDA);
                }
                default -> {
                    System.out.println(MENSAJE_OPCION_ERROR);
                }
            }
        } while (opcion != 0);
    }

    private static void mostrarMenu(int NUM_EJERCICIOS) {
        for (int i = 9; i < NUM_EJERCICIOS; i++) {
            System.out.println(i + ". Ejercicio " + i);
        }
        System.out.println("0. Salir");
    }

    private static String mostrarTituloEjercicio(int opcion) {
        String mensaje = "****** EJERCICIO " + opcion + " ****** ";
        return mensaje;
        //las dos líneas anteriores también puede ponerse así:
        //  return "****** EJERCICIO "+opcion+" ****** ";
    }

    /*
    Funciones con los ejercicios a continuacion
     */

    //Ejercicio9
    private static void ejercicio9(Scanner sc){
        System.out.println("Crear un programa que cree un array de 10 números enteros." +
                " El rograma debe mostrar el array e indicarnos si sus elementos están ordenados de forma creciente," +
                " decreciente, o si están desordenados ");

        int[] Array10 = new int[10];
        System.out.println("Introduce 10 numeros: ");
        for (int i = 0; i < Array10.length; i++) {
            Array10[i] = sc.nextInt();
        }

        System.out.println("Array generado"+ Arrays.toString(Array10));
        System.out.println(checkArray10EJ9(Array10));

    }
    private static String checkArray10EJ9(int[] arr) {
        boolean isAscending = true;
        boolean isDescending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }

            if (arr[i] < arr[i + 1]) {
                isDescending = false;
            }
        }

        if (isAscending) {
            return "El array esta ordenado en orden ascendente.";
        } else if (isDescending) {
            return "El array esta ordenado en orden descendente.";
        } else {
            return "El array no esta ordenado.";
        }
    }
    //Fin Ejercicio9

    //Ejercicio10
    private static void ejercicio10(Scanner sc){
        int[] ArrayEJ10 = new int[10];

        // Inicializar el array con ceros
        for (int i = 0; i < ArrayEJ10.length; i++) {
            ArrayEJ10[i] = 0;
        }

        // Pedir al usuario 8 números para insertarlos en cada posición del array
        System.out.println("Introduce 8 numeros: ");
        for (int i = 0; i < 8; i++) {
            ArrayEJ10[i] = sc.nextInt();
        }


        // Pedir un número y una posición e insertar ese número en la posición indicada
        System.out.print("Ingrese un número para insertar: ");
        int num = sc.nextInt();
        System.out.print("Ingrese la posición donde desea insertarlo: ");
        int pos = sc.nextInt();

        // Insertar el número en la posición indicada, desplazando los elementos detrás
        for (int i = 9; i > pos; i--) {
            ArrayEJ10[i] = ArrayEJ10[i - 1];
        }
        ArrayEJ10[pos] = num;

        // Mostrar el array resultante
        System.out.println("Array resultante:");
        for (int i = 0; i < ArrayEJ10.length; i++) {
            System.out.println("posicion[" + i + "]: " + ArrayEJ10[i]);
        }
    }

    public static void InsertarNumeroEJ10(int[] ArrayEJ10, int numero, int posicion) {
        for (int i = ArrayEJ10.length - 1; i >= posicion; i--) {
            ArrayEJ10[i + 1] = ArrayEJ10[i];
        }

        ArrayEJ10[posicion] = numero;
    }
    //Fin Ejercicio10

    //Ejercicio11

    private static void ejercicio11(Scanner sc, Random r){
        // Initialize the array
        int[] array = new int[10];

        // Fill the array with random integers

        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100); // Generate random numbers between 0 and 99
        }

        // Display the array elements
        System.out.println("Array elements:");
        System.out.println(Arrays.toString(array));

        // Read a position from the user
        System.out.print("Enter a position between 0 and " + (array.length - 1) + ": ");
        int position = sc.nextInt();

        // Remove the element from the specified position without leaving gaps
        if (position >= 0 && position < array.length) {
            for (int i = position; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array = Arrays.copyOf(array, array.length - 1);
            System.out.println("Element at position " + position + " removed.");
        } else {
            System.out.println("Invalid position.");
        }

        // Display the updated array
        System.out.println("Updated array elements:");
        System.out.println(Arrays.toString(array));

    }

    //Fin Ejercicio11

}
