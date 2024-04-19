import java.util.Scanner;
public class nuevo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese un número entero N:");
            int N = scanner.nextInt();
            scanner.close();

            do {
                System.out.print(N + " ");
                N--;
            } while (N >= 1);
        }

}
