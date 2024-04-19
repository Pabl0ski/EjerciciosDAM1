package funciones;

import java.util.Scanner;

public class ejercicio19  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("dame un numero");
        int num1= scanner.nextInt();
        System.out.println("dame otro numero");
        int num2= scanner.nextInt();

        int divisores1=dameSumaDivisores(num1);
        int divisores2=dameSumaDivisores(num2);

        if (divisores1==num2 && divisores2==num1){
            System.out.println("Los numeros "+num1+" y "+num2+" son amigos.");
        }else System.out.println("Los numeros "+num1+" y "+num2+" no son amigos.");

    }

    public static int dameSumaDivisores(int numero){
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if(numero % i == 0) suma+=i;

        }
        return suma;
    }
}
