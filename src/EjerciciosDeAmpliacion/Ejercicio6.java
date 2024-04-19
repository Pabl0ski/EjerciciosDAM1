package EjerciciosDeAmpliacion;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero de 5 cifras:");
        int numero = sc.nextInt();
        int inverso = 0;
        while (numero > 0) {
            inverso = inverso * 10 + numero % 10;
            numero /= 10;
        }
        //System.out.println(inverso);
        System.out.println((inverso / 10000)+    //primer numero
                "\n"+(inverso / 1000)+   //primeros dos numeros
                "\n"+(inverso / 100)+    //primeros tres numeros
                "\n"+(inverso / 10)+     //primeros cuatro numeros
                "\n"+(inverso));     //todos los numeros);

    }
}
