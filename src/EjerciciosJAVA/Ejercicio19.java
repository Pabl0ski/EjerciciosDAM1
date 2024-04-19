package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número de dos cifras únicamente: ");
        int numero = sc.nextInt();
        int a = (numero/1000);
        int b = (numero%1000);
        System.out.println(a+"    " +b);
        System.out.println("El numero dado "+numero+" al inverso es:"+((b*1000)+a));
    }
}
