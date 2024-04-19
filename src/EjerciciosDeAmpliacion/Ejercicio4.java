package EjerciciosDeAmpliacion;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la hora (HH, MM, SS)a la que sale un ciclista de una ciudad (A):");
        int horas = sc.nextInt();
        int minutos = sc.nextInt();
        int segundos = sc.nextInt();
        System.out.println("Ahora dime en segundos el tiempo que tarda el ciclista en llegar a la ciudad (B):");
        int tiempoS = sc.nextInt();
        int HorasASegundos = (horas * 3600);
        int MinutosASegundos = (minutos * 60);
        int  segundosTotales = (HorasASegundos + MinutosASegundos + segundos + tiempoS);
        System.out.println("El ciclista llegara a las: "+(segundosTotales/3600)+":"+((segundosTotales % 3600) / 60)+":"+(segundosTotales%60));
    }
}
