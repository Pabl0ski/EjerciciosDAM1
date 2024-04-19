package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escríbeme dos números: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("La suma de ambos es: "+n1+" + "+n2+" = "+(n1+n2)+
                         "\nLa resta de ambos es: "+n1+" - "+n2+" = "+(n1-n2)+
                         "\nLa división de ambos es: "+n1+" / "+n2+" = "+(n1/n2)+
                         "\nEl producto de ambos es: "+n1+" * "+n2+" = "+(n1*n2));
    }
}
