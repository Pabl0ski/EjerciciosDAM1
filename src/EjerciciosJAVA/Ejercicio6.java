package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero entero: ");
        int variable = sc.nextInt();
        System.out.println("Introduzca otro numero entero");
        int variable2 = sc.nextInt();
        System.out.println("Los numeros introducidos han sido: " +variable+ " y " +variable2);
    }
}
