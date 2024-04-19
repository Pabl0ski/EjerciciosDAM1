package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eescribe un número de 5 cifras sin decimales ");
        int numero  = sc.nextInt();
        System.out.println((numero / 10000)+    //primer numero
                "\n"+(numero / 1000)+   //primeros dos numeros
                "\n"+(numero / 100)+    //primeros tres numeros
                "\n"+(numero / 10)+     //primeros cuatro numeros
                "\n"+(numero / 1));     //todos los numeros
    }
}
