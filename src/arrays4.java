import java.util.Scanner;

public class arrays4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[] numeros = new double[20];

            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Escribe el numero "+(i+1)+":");
                numeros[i]= scanner.nextDouble();
            }

            int sumaPositivos=0;
            int sumaNegativos=0;

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] > 0) {
                    sumaPositivos += numeros[i];
                } else if (numeros[i] < 0) {
                    sumaNegativos += numeros[i];
                }

            }
            System.out.println("La suma de todos los valores positivos es: " + sumaPositivos);
            System.out.println("La suma de todos los valores negativos es: " + sumaNegativos);
        }
}
