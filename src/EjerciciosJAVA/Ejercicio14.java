package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el valor de la base ");
        double base = sc.nextDouble();
        System.out.println("Dame el valor de la altura ");
        double altura = sc.nextDouble();
        System.out.println("El perímetro es: "+((2*base)+(2*altura))+"\nEl area es: "+(base * altura));
    }
}
