package EjerciciosDeAmpliacion;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime de tu examen cuantas preguntas tenias correctas, cuantas incorrectas y cuantas en blanco");
        int correctas = sc.nextInt();
        int incorrectas = sc.nextInt();
        int enblanco = sc.nextInt();
        int TotalPreguntas = (correctas+incorrectas);
        double NotaFinal = (correctas * 5 - incorrectas);
        System.out.println("Tu nota es: "+NotaFinal);

    }
}
