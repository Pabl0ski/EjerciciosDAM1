package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escríbeme tres números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        System.out.println("La media arítmetica de estos tres numeroes es: "+((n1+n2+n3)/3));
    }
}
