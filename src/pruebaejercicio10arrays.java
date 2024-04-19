import java.util.Scanner;
import java.util.Arrays;

public class pruebaejercicio10arrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ArrayEJ10 = new int[10];

        // Inicializar el array con ceros
        for (int i = 0; i < ArrayEJ10.length; i++) {
            ArrayEJ10[i] = 0;
        }

        // Pedir al usuario 8 números para insertarlos en cada posición del array
        System.out.println("Enter 8 integers: ");
        for (int i = 0; i < 8; i++) {
            ArrayEJ10[i] = scanner.nextInt();
        }

        // Pedir un número y una posición e insertar ese número en la posición indicada
        System.out.print("Ingrese un número para insertar: ");
        int num = scanner.nextInt();
        System.out.print("Ingrese la posición donde desea insertarlo: ");
        int pos = scanner.nextInt();

        // Insertar el número en la posición indicada, desplazando los elementos detrás
        for (int i = 9; i > pos; i--) {
            ArrayEJ10[i] = ArrayEJ10[i - 1];
        }
        ArrayEJ10[pos] = num;

        // Mostrar el array resultante
        System.out.println("Array resultante:");
        for (int i = 0; i < ArrayEJ10.length; i++) {
            System.out.println("posicion[" + i + "]: " + ArrayEJ10[i]);
        }
    }
    public static void insertNumber(int[] ArrayEJ10, int num, int pos) {
        for (int i = ArrayEJ10.length - 1; i >= pos; i--) {
            ArrayEJ10[i + 1] = ArrayEJ10[i];
        }

        ArrayEJ10[pos] = num;
    }
}
