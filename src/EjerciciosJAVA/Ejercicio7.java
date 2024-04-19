package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Hola "+nombre+", ¿Cómo estás?");
    }
}
