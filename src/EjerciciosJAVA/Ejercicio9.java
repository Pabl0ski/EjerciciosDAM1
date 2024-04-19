package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el radio que quieres para la circunferencia: ");
        double radio = sc.nextDouble();
        System.out.println("Longitud de la circunferencia: "+(2*Math.PI*radio)+"\nÁrea de la circunferencia: "+(Math.PI*Math.pow(radio,2)));

    }
}
