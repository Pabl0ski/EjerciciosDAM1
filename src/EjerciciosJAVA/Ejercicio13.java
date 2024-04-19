package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu dia de nacimiento: ");
        int dia =sc.nextInt();
        System.out.println("Introduce tu mes de nacimiento");
        int mes = sc.nextInt();
        System.out.println("Introduce tu año de nacimineto");
        int año = sc.nextInt();
        int suma=(dia+mes+año);
        System.out.println(suma);
        System.out.println("Tu numero de la suerte es: "+((suma/1000)+((suma%1000)/100)+((suma%100)/10)+(suma%10)));
    }
}
