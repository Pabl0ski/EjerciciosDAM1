package EjerciciosDeAmpliacion;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la velocidad(km/h) de dos vehiculos y la distancia(km) que hay entre ellos.\n" +
                "Necesariamente el vehiculo de detrás tiene que ser mas rapido que el otro\n" +
                "Con ello calcularemos el tiempo que tardará en alcanzara el vahicula mas rapido al mas lento");
        System.out.print("vcoche1 en km/h:");
        double vcoche1 = sc.nextInt();
        System.out.print("vcoche2 en km/h:");
        double vcoche2 = sc.nextInt();
        System.out.print("distancia entre los coches en km:");
        int distancia = sc.nextInt();
        double tiempo1;
        double tiempo2;
        tiempo1 = (distancia / ((vcoche1 - vcoche2)) * 60);
        tiempo2 = (distancia / ((vcoche2 - vcoche1)) * 60);

        if (vcoche1 > vcoche2) {
            System.out.println("EL coche1 alcanzará al coche2 en: " + (tiempo1) + " minutos");
        } else if (vcoche1 < vcoche2) {
            System.out.println("EL coche2 alcanzará al coche1 en: " + (tiempo2) + " minutos");

        } else {
            System.out.println("Nunca se alcanzaran ya que ambos tienen la misma velocidad");
        }

    }
}
