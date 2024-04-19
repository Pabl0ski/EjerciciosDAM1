import java.util.Scanner;

public class arrays6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Ingrese un número entero: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\nNúmeros en el orden solicitado:");
        for (int i = 0; i < numbers.length / 2; i++) {
            System.out.println((i * 2 + 1) + ": " + numbers[i * 2]);
            System.out.println((i * 2 + 2) + ": " + numbers[numbers.length - i * 2 - 1]);
        }
    }
}
