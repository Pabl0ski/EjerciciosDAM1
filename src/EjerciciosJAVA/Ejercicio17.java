package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int descuento = 15;
        System.out.println("Dime el coste de tu compra sin el descuento: ");
        double precioTotal = sc.nextDouble();
        System.out.println("El precio final de su compra será de: " +((precioTotal)-((precioTotal*descuento)/100)));
    }
}
