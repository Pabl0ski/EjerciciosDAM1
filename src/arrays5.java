import java.util.Scanner;

public class arrays5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[10];
        int contadorPositivos=0;
        int contadorNegativos=0;
        int contadorCEROS=0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Escribe el numero " + (i + 1) + ":");
            numeros[i] = scanner.nextDouble();
            if (numeros[i]==0){
                contadorCEROS++;
            }
            else if (numeros[i]>0) {
                contadorPositivos++;
            }
            else if (numeros[i]<0) {
                contadorNegativos++;
            }
        }

        int mediaPositivos=0;
        int sumaPositivos=0;

        int mediaNegativos=0;
        int sumaNegativos=0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
            }
        }
        mediaPositivos=sumaPositivos/contadorPositivos;
        mediaNegativos=sumaNegativos/contadorNegativos;

        System.out.println("La media de los numeros positivos es: "+mediaPositivos+"" +
                "\nLa media de los numeos negativos es: "+mediaNegativos+""+
                "\nLa cantidad de 0 introducida es de: "+contadorCEROS);


    }
}
