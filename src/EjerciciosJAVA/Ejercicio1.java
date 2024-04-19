package EjerciciosJAVA;

public class Ejercicio1 {
    public static void main(String[] args) {
        double a=33.3;
        int n=8;
        char c='a';
        System.out.println("Valor de la variable 'n' es: "+n);
        System.out.println("Valor de la variable 'a' es: "+a);
        System.out.println("Valor de la variable 'c' es: "+c);
        System.out.print(n); System.out.print('+'); System.out.print(a); System.out.print('='); System.out.print(n+a); //System.out.println(n + " + " + a + " = " + (n+a));
        System.out.println(); //double suma = a+n;
        System.out.print(a); System.out.print('-'); System.out.print(n); System.out.print('='); System.out.print(a-n); //System.out.println(n + " + " + a + " = " + suma);
        //System.out.println(n + " - " + n + " = " + (a-n));
        System.out.println();
        System.out.println("Valor numerico de "+c+" es: "+ (int)c);

    }
}