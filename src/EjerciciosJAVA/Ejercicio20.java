package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime las monedas que tienes de 2€, 1€, 50cent, 20cent y 10cent, en ese orden");
        int monedas2e = sc.nextInt();
        int monedas1e = sc.nextInt();
        double monedas50cent = sc.nextDouble();
        double monedas20cent = sc.nextDouble();
        double monedas10cent = sc.nextDouble();
        double dinero2e = (monedas2e*2);
        double dinero50cent = (monedas50cent *0.5);
        double dinero20cent = (monedas20cent *0.2);
        double dinero10cent = (monedas10cent *0.1);
        System.out.println("Tienes en total: "+(monedas1e+dinero2e+dinero50cent+dinero20cent+dinero10cent)+"€");

    }
}
