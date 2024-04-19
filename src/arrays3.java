import java.util.Scanner;

public class arrays3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe el numero "+(i+1)+":");
            numeros[i]= scanner.nextDouble();
        }

        double max = numeros[0];
        double min = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>max){
                max=numeros[i];
            }
            if (numeros[i]<min){
                min = numeros[i];
            }
        }
        System.out.println("El maximo es: "+max);
        System.out.println("El minimo es: "+min);
    }
}
