package EjerciciosJAVA;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double examenes = 0.55;
        double exFinal = 0.3;
        double trabajoFinal = 0.15;
        System.out.println("Dime las notas de tus tres exámenes parciales: ");
        double parc1 = sc.nextDouble();
        double parc2 = sc.nextDouble();
        double parc3 = sc.nextDouble();
        double notaparciales;
        System.out.println("Tu media de exámenes es esta: "+(notaparciales=((parc1+parc2+parc3)/3))+
                            "\nLa parte de la nota final de examenes es: "+(notaparciales+examenes));
        System.out.println("Dime la nota del exámen final: ");
        double notfinal = sc.nextDouble();
        double nopondfinal;
        System.out.println("La parte de la nota final del exámen final es: "+(nopondfinal=(notfinal*exFinal)));
        System.out.println("Dime la nota del trabajo final: ");
        double notTraFinal = sc.nextDouble();
        double notPondTraFinal;
        System.out.println("La parte de la nota final del trabajo final es: "+(notPondTraFinal=(notTraFinal*trabajoFinal)));
        System.out.println("Dadas las notas, tu nota final es: "+notaparciales+" + "+nopondfinal+" + "+notPondTraFinal+" = "+(notaparciales+nopondfinal+notPondTraFinal));


    }
}
