package funciones;

import java.util.Scanner;

public class ejercicio0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("Programa que muestra opciones al usuario");
        do {
            mostrarMenu();
            option = scanner.nextInt();
            switch (option){
                case 1: opcion1();
                break;
                case 2: opcion2();
                break;
                case 3: opcion3();
                break;
                case 4: opcion4();
                break;
                default:
                    System.out.println("ERROR. Elige entre 0 y 4");
                    break;

            }

        }while (option>0);
    }

    private static void mostrarMenu(){
        MenuDeOpciopnesExtraidio();

    }

    private static void MenuDeOpciopnesExtraidio() {
        System.out.println("Menu de opciones");
        System.out.println("1. Opcion1");
        System.out.println("2. Opcion2");
        System.out.println("3. Opcion3");
        System.out.println("4. Opcion4");
        System.out.println("0. Salir");
    }

    private static void opcion1 (){
        System.out.println("Es la opcion 1");
    }
    private static void opcion2 (){
        System.out.println("Es la opcion 2");
    }
    private static void opcion3 (){
        System.out.println("Es la opcion 3");
    }
    private static void opcion4 (){
        System.out.println("Es la opcion 4");
    }

}
