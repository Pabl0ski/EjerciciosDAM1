package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numero1 = sc.nextInt();
        System.out.println("El doble de "+(numero1)+" es: "+(numero1*2)+"\nEl triple de "+(numero1)+ " es: "+(numero1*3));
    }
}
