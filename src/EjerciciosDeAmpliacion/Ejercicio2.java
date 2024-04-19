package EjerciciosDeAmpliacion;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el primer par de números (x1, x2): ");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        System.out.println("Introduce el segundo par de números (y1, y2): ");
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); //Calcular la distantacia entre los dos putnos
        System.out.println("La distancia entre los dos puntos es: "+distancia); //mostrar por pantalla la distancia
    }
}
