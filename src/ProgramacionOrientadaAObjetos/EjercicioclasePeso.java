package ProgramacionOrientadaAObjetos;

import java.util.Scanner;

public class EjercicioclasePeso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        double kilos;
        String medida;
        Peso peso;

        System.out.println("Ingrese el peso en kilogramos:");
        kilos = sc.nextDouble();

        peso = new Peso(kilos);

        System.out.println("\nOpciones:");
        System.out.println("1) libras");
        System.out.println("2) lingotes");
        System.out.println("3) onzas");
        System.out.println("4) peniques");
        System.out.println("5) gramos");
        System.out.println("6) quintales");
        System.out.print("Ingrese una opción: ");
        medida = sc.next();

        switch (medida) {
            case "1":
                System.out.println("\nEl peso en libras es: " + peso.getPeso(0.453));
                break;
            case "2":
                System.out.println("\nEl peso en lingotes es: " + peso.getPeso(14.59));
                break;
            case "3":
                System.out.println("\nEl peso en onzas es: " + peso.getPeso(0.02835));
                break;
            case "4":
                System.out.println("\nEl peso en peniques es: " + peso.getPeso(0.00155));
                break;
            case "5":
                System.out.println("\nEl peso en gramos es: " + peso.getPeso(1.0));
                break;
            case "6":
                System.out.println("\nEl peso en quintales es: " + peso.getPeso(43.3));
                break;
            default:
                System.out.println("\nOpción inválida. Por favor, intente de nuevo.");
        }

        sc.close();
    }
}

class Peso {
    private double kilos;

    public Peso(double kilos) {
        this.kilos = kilos;
    }

    public void setKilos(double kilos) {
        this.kilos = kilos;
    }

    public double getKilos() {
        return kilos;
    }

    public double getPeso(double factor) {
        return kilos * factor;
    }
}