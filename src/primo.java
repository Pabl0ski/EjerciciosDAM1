import java.util.Scanner;

public class primo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un numero:");
        int numero= scanner.nextInt();
        boolean primo=true;
        int i = 2;
        while (primo && i <= numero / 2){
            if (numero%i ==0)primo=false;
            i++;
        }
        if (primo) System.out.println("El numero es primo");
        else System.out.println("no es primo");
    }
}
