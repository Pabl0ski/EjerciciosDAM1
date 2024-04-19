import java.util.Scanner;
public class caracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input;

        System.out.println("Ingrese un carácter (presione espacio para salir): ");
        input = scanner.next().charAt(0);

        while (input != ' ') {
            if (esVocal(input)) {
                System.out.println("VOCAL");
            } else {
                System.out.println("NO VOCAL");
            }

            System.out.println("Ingrese un carácter (presione espacio para salir): ");
            input = scanner.next().charAt(0);
        }

        System.out.println("Programa terminado.");
    }

    public static boolean esVocal(char c) {
        // Verifica si el carácter es una vocal (mayúscula o minúscula)
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U';
    }
}
