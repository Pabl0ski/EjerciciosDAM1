package EjerciciosCondicionales;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular su factorial:");
        int num = scanner.nextInt();
        System.out.println("El factorial de " + num + " es: " + factorial1(num));
    }

    public static long factorial1(int num) {
        long factorial1 = 1;
        for (int i = 1; i <= num; i++) {
            factorial1 *= i;
        }
        return factorial1;
    }
}