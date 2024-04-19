package ProgramacionOrientadaAObjetos;
import java.util.Scanner;

public class EjercicioMiNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double numero;
        Calculadora calculadora;

        do {
            System.out.println("Ingrese un número:");
            numero = sc.nextDouble();

            calculadora = new Calculadora(numero);

            System.out.println("\nOpciones:");
            System.out.println("1) doble");
            System.out.println("2) triple");
            System.out.println("3) cuádruple");
            System.out.println("4) Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nEl doble de " + numero + " es: " + calculadora.x2(numero));
                    break;
                case 2:
                    System.out.println("\nEl triple de " + numero + " es: " + calculadora.x3(numero));
                    break;
                case 3:
                    System.out.println("\nEl cuádruple de " + numero + " es: " + calculadora.x4(numero));
                    break;
                case 4:
                    System.out.println("\nSaliendo...");
                    break;
                default:
                    System.out.println("\nOpción inválida. Por favor, intente de nuevo.");
            }
        } while (opcion != 4);

        sc.close();
    }
}

class Calculadora {
    private double numero;

    public Calculadora(double numero) {
        this.numero = numero;
    }

    public double x2(double numero) {
        return numero * 2;
    }

    public double x3(double numero) {
        return numero * 3;
    }

    public double x4(double numero) {
        return numero * 4;
    }
}
