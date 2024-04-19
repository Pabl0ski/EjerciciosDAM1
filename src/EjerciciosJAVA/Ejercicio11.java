package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero de tres cifras: ");
        int numerotrescifras = sc.nextInt();
        System.out.println("La primera cifra es "+((numerotrescifras/100)+
                "\nLa segunda cifra es "+((numerotrescifras%100)/10)+
                "\nLa ultima cifra es " +(numerotrescifras%10)));
    }
}
