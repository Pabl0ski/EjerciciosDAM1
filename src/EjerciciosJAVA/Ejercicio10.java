package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la velocidad en Km/h: ");
        int velocidad = sc.nextInt();
        System.out.println("Velocidad "+velocidad+"Km/h ---->" +(velocidad/3.6)+"m/s");
    }
}
