package funciones;

import java.util.Scanner;

public class ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        int num= sc.nextInt();
        System.out.println(imprimirFraseBinario(num, convertir(num)));



    }

    static String imprimirFraseBinario(int n, int bin){
        return "El numero "+n+" en binario es: "+bin+".";
    }

    static int convertir(int n){
        int resultadoBinario;
        if (n == 0 || n == 1){
            resultadoBinario = n;
        }else {
            resultadoBinario = n % 2 + 10 * convertir(n/2);
        }
        return resultadoBinario;
    }
}
