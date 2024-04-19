package EjerciciosJAVA;

public class Ejercicio2 {
    public static void main(String[] args) {
        double numeroD1;
        double numeroD2;
        int numeroint1;
        int numeroint2;
        numeroD1 = 4.7;
        System.out.println("Variable numeroD1 = " +numeroD1);
        numeroD2 = 3.2;
        System.out.println("Variable numeroD2 = " +numeroD2);
        numeroint1 = 1;
        System.out.println("Variable numeroint1 = " +numeroint1);
        numeroint2 = 2;
        System.out.println("Variable numeroint2 = " +numeroint2);
        System.out.print(numeroint1); System.out.print(" + "); System.out.print(numeroint2); System.out.print(" = "); System.out.print(numeroint1+numeroint2);
        System.out.println();
        System.out.print(numeroint1); System.out.print(" - "); System.out.print(numeroint2); System.out.print(" = "); System.out.print(numeroint1-numeroint2);
        System.out.println();
        System.out.println(numeroint1 + " * " + numeroint2 + " = " + (numeroint1*numeroint2));
        System.out.println(numeroint1 + " / " + numeroint2 + " = " + (numeroint1/numeroint2));
        System.out.println(numeroint1 + " % " + numeroint2 + " = " + (numeroint1%numeroint2));
        System.out.println(numeroD1 + " + " + numeroD2 + " = " + (numeroD1+numeroD2));
        System.out.println(numeroD1 + " - " + numeroD2 + " = " + (numeroD1-numeroD2));
        System.out.println(numeroD1 + " * " + numeroD2 + " = " + (numeroD1*numeroD2));
        System.out.println(numeroD1 + " / " + numeroD2 + " = " + (numeroD1/numeroD2));
        System.out.println(numeroD1 + " % " + numeroD2 + " = " + (numeroD1%numeroD2));
        System.out.println(numeroint1 + " + " + numeroD1 + " = " + (numeroint1+numeroD1));
        System.out.println(numeroint2 + " / " + numeroD2 + " = " + (numeroint2/numeroD2));
        System.out.println(numeroint2 + " % " + numeroD2 + " = " + (numeroint2%numeroD2));
        System.out.println("Variable numeroint1 = " + numeroint1 + " el doble " +2*numeroint1);
        System.out.println("Variable numeroint2 = " + numeroint2 + " el doble " +2*numeroint2);
        System.out.println("Variable numeroD1 = " + numeroD1 + " el doble " +2*numeroD1);
        System.out.println("Variable numeroD2 = " + numeroD2 + " el doble " +2*numeroD2);
        System.out.println("La suma de todas las variables: " +numeroint1+ " + " +numeroint2+ " + " +numeroD1+ " + " +numeroD2+ " = " +(numeroint1+numeroint2+numeroD1+numeroD2));

    }
}
