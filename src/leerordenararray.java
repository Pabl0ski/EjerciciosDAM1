import java.util.Scanner;

public class leerordenararray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int nuevoNumero;

        System.out.println("Por favor, ingrese 5 números:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Posicion ["+i+"]: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("Los números ingresados son:");
        System.out.print("{");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
        System.out.print("}");

        System.out.println("\nPor favor, ingrese otro número:");
        nuevoNumero = scanner.nextInt();

        int posicion = 0;
        boolean insertado = false;
        for (int i = 0; i < 5 && !insertado ; i++) {
            if (numeros[i] > nuevoNumero) {
                posicion = i;
                insertado = true;
//                break;
            }
        }

        if (!insertado) {
            posicion = 5;
        }

        for (int i = 4; i >= posicion; i--) {
            numeros[i + 1] = numeros[i];
        }

        numeros[posicion] = nuevoNumero;

        System.out.println("El array actualizado es:");
        System.out.print("{");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + ", ");
        }
        System.out.print("}");
    }
}
//revisar esto