import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int num;
        int limiteInferior;
        int limiteSuperior;
        int numerosFuera = 0;
        boolean igualALimite = false;

        do {
            System.out.print("Introduzca el límite inferior: ");
            limiteInferior = scanner.nextInt();
            System.out.print("Introduzca el límite superior: ");
            limiteSuperior = scanner.nextInt();
        } while (limiteInferior > limiteSuperior);

        System.out.println("Introduzca números hasta que introduzca el 0. Los números se sumarán y se contarán aquellos que no estén dentro del intervalo.");

        do {
            System.out.print("Introduzca un número: ");
            num = scanner.nextInt();

            if (num != 0) {
                if (num >= limiteInferior && num <= limiteSuperior) {
                    suma += num;
                } else {
                    numerosFuera++;
                }

                if (num == limiteInferior || num == limiteSuperior) {
                    igualALimite = true;
                }
            }
        } while (num != 0);

        System.out.println("La suma de los números que están dentro del intervalo es: " + suma);
        System.out.println("Cuantos números están fuera del intervalo: " + numerosFuera);
        System.out.println("Ha introducido algún número igual a los límites del intervalo: " + igualALimite);
    }
}
