package EjerciciosDeAmpliacion;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero A:");
        int A = sc.nextInt();
        System.out.println("Introduce un numero B:");
        int B = sc.nextInt();
        int aux;
        aux = A;
        System.out.println("A="+A+ " y B="+B);
        System.out.println("A = B, por tanto, A = "+(A=B));
        System.out.println("B = A, por tanto, B = "+(B=aux));
        
    }
}
